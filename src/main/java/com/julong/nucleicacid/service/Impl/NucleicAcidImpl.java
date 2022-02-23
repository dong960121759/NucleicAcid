package com.julong.nucleicacid.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.julong.nucleicacid.dao.*;
import com.julong.nucleicacid.entity.*;
import com.julong.nucleicacid.model.*;
import com.julong.nucleicacid.service.NucleicAcid;
import com.julong.nucleicacid.utils.AgeUtil;
import com.julong.nucleicacid.utils.JlV60DictInfo;
import com.julong.nucleicacid.utils.KingDeeCodeInfo;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @className: NoSourcePoolImpl
 * @date: 2021/11/11 10:14
 */
@Slf4j
@Transactional(rollbackFor = Exception.class)
@Service
@MapperScan({"com.julong.nucleicacid.dao"})
public class NucleicAcidImpl implements NucleicAcid {

    @Value("${_defaultPayorID}")
    private Long _defaultPayorID; //默认支付人
    @Value("${_defaultPlanID}")
    private Long _defaultPlanID; //默认支付计划
    @Value("${_defaultWxUserID}")
    private Long _defaultWxUserID; //默认操作员
    @Value("${_defaultHsjcDrID}")
    private Long _defaultHsjcDrID; //默认医生
    @Value("${_defaultHsjcDeptID}")
    private Long  _defaultHsjcDeptID;
    @Value("${_defaultHsjcGroupID}") //核酸默认组号
    private Long  _defaultHsjcGroupID;
    @Value("${_defaultRecipeLimitDays}")
    private Long _defaultRecipeLimitDays ;//处方有效期
    private final SimpleDateFormat _formatDate_his = new SimpleDateFormat("yyyy.MM.dd");

    private final NucleicAcidMapper nucleicAcidMapper;
    private final PatientinfoFOMapper patientinfoFOMapper;
    private final PatientCardFOMapper patientCardFOMapper;
    private final GeneratorNoMapper generatorNoMapper;
    private final SmOidGeneratorMapper smOidGeneratorMapper;
    private final PaCLRegisterMapper paCLregisterMapper;
    private final PcClrecipeMapper pcClrecipeMapper;
    private final OrderGroupMapper orderGroupMapper;
    private final OrderItemMapper orderItemMapper;
    private final ClRecentryMapper clRecentryMapper;
    private final KingDeeNucleicLogMapper kingDeeNucleicLogMapper;

    public NucleicAcidImpl(NucleicAcidMapper nucleicAcidMapper, PatientinfoFOMapper patientinfoFOMapper, PatientCardFOMapper patientCardFOMapper, GeneratorNoMapper generatorNoMapper, SmOidGeneratorMapper smOidGeneratorMapper, PaCLRegisterMapper paCLregisterMapper, PcClrecipeMapper pcClrecipeMapper, OrderGroupMapper orderGroupMapper, OrderItemMapper orderItemMapper, ClRecentryMapper clRecentryMapper, KingDeeNucleicLogMapper kingDeeNucleicLogMapper) {
        this.nucleicAcidMapper = nucleicAcidMapper;
        this.patientinfoFOMapper = patientinfoFOMapper;
        this.patientCardFOMapper = patientCardFOMapper;
        this.generatorNoMapper = generatorNoMapper;
        this.smOidGeneratorMapper = smOidGeneratorMapper;
        this.paCLregisterMapper = paCLregisterMapper;
        this.pcClrecipeMapper = pcClrecipeMapper;
        this.orderGroupMapper = orderGroupMapper;
        this.orderItemMapper = orderItemMapper;
        this.clRecentryMapper = clRecentryMapper;
        this.kingDeeNucleicLogMapper = kingDeeNucleicLogMapper;
    }
    /**
     * 获得出生日期
     * 
     */
    private Date getBirthdayByIDNO(String id){
        Date birthD = null;
        String birthS = null;
        boolean isidok = false ;
        if ( id.length() == 18){

            birthS = id.substring(6, 10) + "-"
                    + id.substring( 10,12 ) +"-"
                    + id.substring(12, 14)  ;
            isidok = true ;
        }else if ( id.length() == 15){

            birthS = "19" + id.substring(6, 8) + "-"
                    + id.substring( 8,10 ) +"-"
                    + id.substring(10, 12)  ;
            isidok = true ;
        }

        if (isidok ) {
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            try {
                birthD = format.parse(birthS);
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
        return birthD;
    }

    /**
     * 生成OID
     */
    private Long smOidGenerate(String  fid) {
        SmOidGeneratorFO smOidGeneratorFO = smOidGeneratorMapper.selectById(fid);
        Long fcurrOid =smOidGeneratorFO.getFcurrOid();
        smOidGeneratorFO.setFcurrOid(fcurrOid+1);
        smOidGeneratorMapper.updateById(smOidGeneratorFO);
        smOidGeneratorFO = smOidGeneratorMapper.selectById(fid);

        return smOidGeneratorFO.getFcurrOid();

    }
    /**
     * 生成卡号
     * 
     */
    private String smNoGenerate(Long noType) {
        QueryWrapper<GeneratorNoFO> queryWrapper=new QueryWrapper<>();

        queryWrapper.eq("notype",noType);

        GeneratorNoFO generatorNoFO = generatorNoMapper.selectOne(queryWrapper);
        if (generatorNoFO!=null) {
            Long  currentNo = generatorNoFO.getCurrentNo();
            generatorNoFO.setCurrentNo(currentNo+1);
            generatorNoMapper.updateById(generatorNoFO);
        }
        return nucleicAcidMapper.getGeneratorNo(noType);

    }
    @Override
    public OutpatientInfoOut getOutpatientInfo(OutpatientInfoIn infoIn) {
        OutpatientInfoOut infoOut;

        if(infoIn.getIdCardNo()==null && infoIn.getPatientId()==null && infoIn.getHealthCardNo()==null){
            infoOut = new OutpatientInfoOut();
            infoOut.setResultCode(KingDeeCodeInfo.FAILED);
            infoOut.setResultDesc("idCardNo、healthCardNo、patientId不能同时为空!");
            return infoOut;
        }
        infoOut = nucleicAcidMapper.getOutpatientInfo(infoIn);
        if (infoOut==null){
            infoOut = new OutpatientInfoOut();
            infoOut.setResultCode(KingDeeCodeInfo.FAILED);
            infoOut.setResultDesc("未查到患者数据!");
        }else {
            infoOut.setResultCode(KingDeeCodeInfo.SUCCESS);
        }
        return infoOut;
    }


    @Override
    public CreateNewPatientOut createNewPatient(CreateNewPatientIn newPatientIn) {
        CreateNewPatientOut newPatientOut;

        if(newPatientIn.getIdCardNo()==null || "".equals(newPatientIn.getIdCardNo())
                || newPatientIn.getPatientName()==null || "".equals(newPatientIn.getPatientName())
                || newPatientIn.getPhone()==null ||"".equals(newPatientIn.getPhone()) ){
            newPatientOut = new CreateNewPatientOut();
            newPatientOut.setResultCode(KingDeeCodeInfo.FAILED);
            newPatientOut.setResultDesc("传入参数中身份证、姓名、手机号 有空!");
            return newPatientOut;
        }
        try {
            //1.判断是否已建过卡，按身份证号查询
            QueryWrapper<PatientinfoFO> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("ISDELETE", "0");
            queryWrapper.eq("IDNO", newPatientIn.getIdCardNo().trim());
            queryWrapper.eq("NAME", newPatientIn.getPatientName().trim());
            System.out.println(newPatientIn.getPatientName().trim());
            List<PatientinfoFO> list = patientinfoFOMapper.selectList(queryWrapper);
            System.out.println(list.size());
            if (list.size() > 0) {
                newPatientOut = new CreateNewPatientOut();
                newPatientOut.setResultCode(KingDeeCodeInfo.SUCCESS);
                newPatientOut.setResultDesc("成功-该身份证号病人已建卡!") ;
                newPatientOut.setPatientId(String.valueOf(list.get(0).getPatientid()));
                newPatientOut.setHealthCardNo(String.valueOf(list.get(0).getHcno()));
                return newPatientOut;
            }
        }catch (Exception e) {
            e.printStackTrace();
            newPatientOut = new CreateNewPatientOut();
            newPatientOut.setResultCode(KingDeeCodeInfo.FAILED);
            newPatientOut.setResultDesc("查询病人信息出错1!") ;
            return newPatientOut;
        }
        //2.未建卡，进行建卡
        PatientinfoFO fo = new PatientinfoFO();

        fo.setPayorid(_defaultPayorID) ;
        fo.setPlanid(_defaultPlanID) ;
        fo.setName(newPatientIn.getPatientName()) ;
        fo.setBirthday(getBirthdayByIDNO(newPatientIn.getIdCardNo().trim()));

        //性别默认
        if(KingDeeCodeInfo.SEX_M.equals(newPatientIn.getGender())){
            fo.setSex(JlV60DictInfo.SEX_1 ) ;
        }else if(KingDeeCodeInfo.SEX_F.equals(newPatientIn.getGender())){
            fo.setSex(JlV60DictInfo.SEX_2) ;
        }else{
            fo.setSex(JlV60DictInfo.SEX_1 ) ;
        }

        fo.setIdno(newPatientIn.getIdCardNo()) ;
        fo.setMobile(newPatientIn.getPhone()) ;
        fo.setAddress(newPatientIn.getAddress());

        Calendar cal = Calendar.getInstance();

        fo.setInputtime(cal.getTime() );
        fo.setInputoper( _defaultWxUserID);
        fo.setVersionid(cal.getTime());

        fo.setPatientid(smOidGenerate("PA_DATA_PATIENT"));
        String cardNo =smNoGenerate(1L);
        fo.setHcno(cardNo);

        if (patientinfoFOMapper.insert(fo)>0) {

            PatientCardFO foCard = new PatientCardFO();
            foCard.setOid(smOidGenerate("PA_DATA_PATIENTCARD"));
            foCard.setCardno(cardNo);
            foCard.setPatientid(fo.getPatientid());
            foCard.setInputoper(_defaultWxUserID);
            foCard.setInputtime(cal.getTime());
            if (patientCardFOMapper.insert(foCard)>0) {

                newPatientOut = new CreateNewPatientOut();
                newPatientOut.setResultCode(KingDeeCodeInfo.SUCCESS);
                newPatientOut.setPatientId(String.valueOf(fo.getPatientid()));
                newPatientOut.setHealthCardNo(cardNo);
                return newPatientOut;
            }else {
                newPatientOut = new CreateNewPatientOut();
                newPatientOut.setResultCode(KingDeeCodeInfo.FAILED);
                newPatientOut.setResultDesc("保存患者信息卡失败！") ;
                return newPatientOut;
            }
        }else {
            newPatientOut = new CreateNewPatientOut();
            newPatientOut.setResultCode(KingDeeCodeInfo.FAILED);
            newPatientOut.setResultDesc("保存患者信息失败！") ;
            return newPatientOut;
        }
    }

    /**
     * 1.2核酸检测预约项目类型
     * 接口代码	cstmr.nucleic.getItem
     * 说明	通过调用该接口获取可预约的核酸检测项目类型（有部分医院多类项目，不同价钱）
     *
     */
    @Override
    public GetItemOut<GetItemOutSet> nucleicGetItem(GetItemIn getItemIn) {


        GetItemOut<GetItemOutSet> getItemOut = new GetItemOut<>();
        List<GetItemOutSet> getItemOutSets = nucleicAcidMapper.nucleicGetItem(Long.valueOf(getItemIn.getItemId()));
        if (getItemOutSets!=null) {
            getItemOut.setSet(getItemOutSets);

            getItemOut.setResultCode(KingDeeCodeInfo.SUCCESS);
            getItemOut.setResultDesc("") ;
        }else {
            getItemOut.setResultCode(KingDeeCodeInfo.FAILED);
            getItemOut.setResultDesc("查询核酸检测预约项目类型失败！") ;
        }
        return getItemOut;
    }

    /**
     * 1.4核酸检测预约下单
     * 接口代码	cstmr. nucleic.addOrder
     * 说明	通过调用该接口预约申请核酸检测项目开单
     *
     * 
     */
    @Override
    public AddOrderOut nucleicAddOrder(AddOrderIn addOrderIn) {
        String cardNo=addOrderIn.getHealthCardNo();
        String examineDate;
        AddOrderOut addOrderOut =new AddOrderOut();
        if(cardNo == null || "".equals(cardNo)) {
            addOrderOut.setResultCode(KingDeeCodeInfo.FAILED);
            addOrderOut.setResultDesc("卡号 为 空!") ;
            return addOrderOut ;
        }
        QueryWrapper<PatientinfoFO> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("hcno", cardNo);
        queryWrapper.eq("isdelete", "0");
        List<PatientinfoFO>  plist =  patientinfoFOMapper.selectList(queryWrapper);
        if (plist.size() == 0)   {
            addOrderOut.setResultCode(KingDeeCodeInfo.FAILED);
            addOrderOut.setResultDesc(cardNo+ "没有找到病人！") ;
            return addOrderOut ;
        }
        PatientinfoFO patientinfoFO = plist.get(0);

        Date serviceTime = Calendar.getInstance().getTime( ) ;
        examineDate =  new SimpleDateFormat("yyyy-MM-dd").format( serviceTime ) ;

        QueryWrapper<PaCLregisterFO> queryRegister = new QueryWrapper<>();
        queryRegister.eq("hcno", cardNo);
        queryRegister.eq("patientid", patientinfoFO.getPatientid());
        queryRegister.eq("to_char(regtime,'yyyy-mm-dd')", examineDate);
        queryRegister.eq("REGDOCTOR", _defaultHsjcDrID);

        List<PaCLregisterFO>  regList =  paCLregisterMapper.selectList(queryRegister);
        boolean isChild = false ;
        PaCLregisterFO gh;
        if (regList.size()<1){
            gh = new PaCLregisterFO();

            gh.setPatientid( patientinfoFO.getPatientid() );
            gh.setHcno(patientinfoFO.getHcno() );
            gh.setPayorid( _defaultPayorID ); //3
            gh.setPlanid( _defaultPlanID );//7
            gh.setName(patientinfoFO.getName());
            gh.setSex(patientinfoFO.getSex());
            gh.setInputoper( _defaultHsjcDrID  );
            gh.setInputtime(serviceTime);
            gh.setAge(AgeUtil.computerAge(serviceTime,patientinfoFO.getBirthday()));
            gh.setBirthday(patientinfoFO.getBirthday() );
            gh.setIdno(patientinfoFO.getIdno() );
            gh.setAddress(patientinfoFO.getAddress() );

            gh.setRegtime( serviceTime );
            gh.setRegcatalog(1L);
            gh.setRegdept( _defaultHsjcDeptID ); //54
            gh.setRegdoctor( _defaultHsjcDrID ); //319
            gh.setRegtype(1L);
            gh.setRegstatus(1L);
            gh.setEncounterstatus(2L);

            Long agea;
            agea = AgeUtil.intAge(gh.getAge());

            if (agea != null && agea <= 14 ) {
                gh.setIschild("1");
                isChild = true ;
            }else {
                gh.setIschild("0");
            }
            gh.setEncounterid(smOidGenerate("PA_CL_DATA_REGISTER"));
            try {
              Integer i =  paCLregisterMapper.insert(gh);//保存：挂号表
                System.out.println(i);
            } catch (Exception e) {
                addOrderOut.setResultCode(KingDeeCodeInfo.FAILED);
                addOrderOut.setResultDesc(cardNo+ " 没有找到挂号记录！") ;
                return addOrderOut ;
            }

        }else {
            gh = regList.get(0);
        }
        PcClrecipeFO recipe = new PcClrecipeFO( );

        recipe.setRecipetype(1L);
        recipe.setEncounterid( gh.getEncounterid() );
        recipe.setPatientid(patientinfoFO.getPatientid());
        recipe.setCataid(8L);
        recipe.setName( patientinfoFO.getName() );
        recipe.setSex( patientinfoFO.getSex() );
        recipe.setAge(AgeUtil.computerAge(serviceTime, patientinfoFO.getBirthday()));
        recipe.setAddress( patientinfoFO.getAddress()  );
        recipe.setDeptid(_defaultHsjcDeptID);
        recipe.setDocid( _defaultHsjcDrID );

        recipe.setInputoper( _defaultHsjcDrID );
        recipe.setInputtime( serviceTime );
        recipe.setRecipeclass(1L);
        recipe.setIsmanual("1");
        recipe.setIsmain("1");
        recipe.setVersionid(serviceTime);

        recipe.setRecipeid(smOidGenerate("PC_CL_DATA_RECIPE"));
        Integer cfh = pcClrecipeMapper.insert(recipe);
        System.out.println(cfh);

        if (cfh<1){
            addOrderOut.setResultCode(KingDeeCodeInfo.FAILED);
            addOrderOut.setResultDesc(cardNo+ " 生成处方号错误！") ;
            return addOrderOut ;
        }
        List<ClRecentryFO> clRecentryFOS = new ArrayList<>();


        ClRecentryFO recipeEntryVO = new ClRecentryFO();
        recipeEntryVO.setRecipeid(recipe.getRecipeid());

        recipeEntryVO.setEntrytype(99L); //明细类型，组套用99
        recipeEntryVO.setRowstatus(0L);						//行状态
        recipeEntryVO.setIsitem("0");					//是否医嘱项（如果不为医嘱项，则为医嘱套）
        recipeEntryVO.setAliasid(_defaultHsjcGroupID);
        recipeEntryVO.setItemid(_defaultHsjcGroupID);								//项目ID
        recipeEntryVO.setRowno(1L);
        recipeEntryVO.setGroupno(1L);
        recipeEntryVO.setDiscountrate(new BigDecimal("100"));			//折扣率，默认100%
        recipeEntryVO.setIsdisplay("0");
        recipeEntryVO.setInputtime( serviceTime );


        QueryWrapper<OrderGroupFO> queryOrderGroup = new QueryWrapper<>();
        queryOrderGroup.eq("groupid",_defaultHsjcGroupID);
        OrderGroupFO orderGroupFO = orderGroupMapper.selectOne(queryOrderGroup);

        if(orderGroupFO.getIsfixedprice() != null && "".equals(orderGroupFO.getIsfixedprice() ) ){			//是否固定价格
            recipeEntryVO.setPrice( nucleicAcidMapper.getGroupUnitPrice(_defaultHsjcGroupID) );			//单价
            recipeEntryVO.setIscharge("1");				//是否收费（对于由医嘱套生成的明细，不能重复收费）
        }else{
            recipeEntryVO.setPrice(null);																	//单价
            recipeEntryVO.setIscharge("0");				//是否收费（对于由医嘱套生成的明细，不能重复收费）
        }

        recipeEntryVO.setItemsource( 1L );	//项目来源，默认1 "录入"

        //取单位，每次用量,默认单位为空，数量为1
        recipeEntryVO.setUnitid(null);									//以医嘱项单位为单位
        recipeEntryVO.setQuantity(new BigDecimal("1"));				//默认数量为1
        recipeEntryVO.setTotal(new BigDecimal("1"));					//默认数量为1
        recipeEntryVO.setQuanunitid(null);

        BigDecimal amount = nucleicAcidMapper.getGroupAmount(_defaultHsjcGroupID);
        recipeEntryVO.setAmount( amount );
        recipeEntryVO.setActualamount( amount );

        //生成主键
        recipeEntryVO.setEntryid(smOidGenerate("PC_CL_DATA_RECIPEENTRY"));

        clRecentryFOS.add( recipeEntryVO );

        List<Long> itemIdList = nucleicAcidMapper.getGroupItems(_defaultHsjcGroupID);
        int rowNo = 2;
        for (Long itemId: itemIdList){
            recipeEntryVO.setRecipeid(recipe.getRecipeid());

            recipeEntryVO.setEntrytype( nucleicAcidMapper.getOrderItemPretype( itemId ));

            AbOrderItemFO orderItem = orderItemMapper.selectById(itemId) ;
            recipeEntryVO.setGroupno(1L);
            recipeEntryVO.setRowno((long) rowNo);
            recipeEntryVO.setRowstatus(0L);
            recipeEntryVO.setAliasid(itemId);
            recipeEntryVO.setItemid(itemId);
            recipeEntryVO.setIsconfirm("1");
            recipeEntryVO.setConfirmoper(319L);
            recipeEntryVO.setConfirmtime( serviceTime );
            recipeEntryVO.setQuantity(new BigDecimal("1"));
            recipeEntryVO.setUnitid( orderItem.getClunitid() );
            recipeEntryVO.setIsitem("1");
            recipeEntryVO.setTotal(new BigDecimal("1"));
            recipeEntryVO.setIsdisplay("0");
            recipeEntryVO.setIscharge( "1" );
            recipeEntryVO.setInputtime( serviceTime );

            recipeEntryVO.setExeutedept( 129L ) ;

            //设置单价
            if ( isChild &&  orderItem.getChildplusprice() != null ) {
                recipeEntryVO.setPrice(orderItem.getChildplusprice());
                recipeEntryVO.setImmprice(orderItem.getClprice());
                recipeEntryVO.setImmamount(orderItem.getClprice().setScale(2, BigDecimal.ROUND_HALF_UP));
            }else{
                recipeEntryVO.setPrice( orderItem.getClprice() );				//单价
            }

            recipeEntryVO.setDiscountrate(new BigDecimal(100));
            recipeEntryVO.setQuanunitid(orderItem.getClunitid());					//数量单位
            recipeEntryVO.setAmount(recipeEntryVO.getPrice());
            recipeEntryVO.setActualamount(recipeEntryVO.getPrice());

            recipeEntryVO.setItemsource( 10L );

            recipeEntryVO.setEntryid(smOidGenerate("PC_CL_DATA_RECIPEENTRY"));

            clRecentryFOS.add(recipeEntryVO);
            rowNo++;

        }
        if (  clRecentryFOS.size()==0   ) {
            addOrderOut.setResultCode(KingDeeCodeInfo.FAILED);
            addOrderOut.setResultDesc(cardNo+ " 2生成处方表错误!") ;
            return addOrderOut ;
        }
        for (ClRecentryFO clRecentryFO: clRecentryFOS){
            clRecentryMapper.insert(clRecentryFO);
        }
        KingDeeNucleicLogFO kingDeeNucleicLogFO = new KingDeeNucleicLogFO();
        kingDeeNucleicLogFO.setHealthCardNo(cardNo);
        kingDeeNucleicLogFO.setIdCardNo(patientinfoFO.getIdno());
        kingDeeNucleicLogFO.setPatientName(patientinfoFO.getName());
        kingDeeNucleicLogFO.setPatientId(String.valueOf(patientinfoFO.getPatientid()));
        kingDeeNucleicLogFO.setPhone(patientinfoFO.getMobile());
        kingDeeNucleicLogFO.setItemId(String.valueOf(_defaultHsjcGroupID));
        kingDeeNucleicLogMapper.insert(kingDeeNucleicLogFO);

        addOrderOut.setResultCode(KingDeeCodeInfo.SUCCESS);

        return addOrderOut ;
    }

    /**
     * 2.2.3.1 待缴费记录查询
     * 接口代码	outpatient.getPayInfo
     * 说明	通过调用该接口获取患者的待缴费就诊记录
     *
     * @param getPayInfoIn
     */
    @Override
    public ResultOut<GetPayInfoOutSet> getPayInfo(GetPayInfoIn getPayInfoIn) {
        ResultOut<GetPayInfoOutSet> getPayInfoOut = new ResultOut<>();
        String cardNo = getPayInfoIn.getHealthCardNo();
        String beginDate = getPayInfoIn.getStartDate()  ;
        String endDate = getPayInfoIn.getEndDate()  ;
        //1.判断卡是否有效
        if(cardNo != null && !"".equals(cardNo.trim()) ){			//如果有卡号
            List<PatientinfoFO> patList = null ;
            try {
                QueryWrapper<PatientinfoFO> queryWrapper = new QueryWrapper<>();
                queryWrapper.eq("hcno", cardNo);
                queryWrapper.eq("isdelete", "0");
                 patList =  patientinfoFOMapper.selectList(queryWrapper);

                if(patList == null || patList.size() <= 0){
                    getPayInfoOut.setResultCode(KingDeeCodeInfo.FAILED);
                    getPayInfoOut.setResultDesc(cardNo+ "找不到该卡号对应的病人信息！") ;
                    return getPayInfoOut ;
                }else if( patList.size() > 1){
                    getPayInfoOut.setResultCode(KingDeeCodeInfo.FAILED);
                    getPayInfoOut.setResultDesc(cardNo+ "该卡号对应多个病人信息！") ;
                    return getPayInfoOut ;
                }

            } catch (Exception e) {
                e.printStackTrace();
                getPayInfoOut.setResultCode(KingDeeCodeInfo.FAILED);
                getPayInfoOut.setResultDesc(cardNo+ "出错！") ;
                return getPayInfoOut ;
            }
        }else {
            getPayInfoOut.setResultCode(KingDeeCodeInfo.FAILED);
            getPayInfoOut.setResultDesc("卡号不能为空！") ;
            return getPayInfoOut ;
        }
        //取处方
        //处方有效天数begin
        Long limitDay = _defaultRecipeLimitDays ;
        if(limitDay == null || limitDay.intValue() <= 0){
            limitDay = 3L;
        }

        if(beginDate == null || "".equals(beginDate.trim()) ) {
            Calendar cal = Calendar.getInstance();// 取当前日期。
            cal.add(Calendar.DATE, -1 * limitDay.intValue() ) ;	//当前日期加n天
            beginDate = _formatDate_his.format(cal.getTime())  ;
        }

        if(endDate == null || "".equals(endDate.trim()) ) {
            Calendar cal = Calendar.getInstance();// 取当前日期。
            endDate = _formatDate_his.format(cal.getTime())  ;
        }

        //获得全部未结算处方ID列表
        List<UnChrgRecipeFO> unChrgRecipeFOS = nucleicAcidMapper.getUnChrgRecipeFO(cardNo , limitDay , beginDate , endDate);
        List<Long> recipeIds = new ArrayList<>();
        boolean hasother = false;
        boolean has114 = false;
        for (UnChrgRecipeFO unChrgRecipeFO : unChrgRecipeFOS){
            recipeIds.add(unChrgRecipeFO.getRecipeid());
            if (JlV60DictInfo.NEW_CL_DEPT_114.equals(unChrgRecipeFO.getDeptid().toString())) {
                has114 = true;
            } else {
                hasother = true;
            }
        }
        // 地点校验，否，不生成PAYNO 该结算既有114新市门诊 又有总院
        if(has114 == hasother){
            getPayInfoOut.setResultCode(KingDeeCodeInfo.FAILED);
            getPayInfoOut.setResultDesc("该结算既有114新市门诊处方 又有总院的！");
            return getPayInfoOut;
        }



        return null;
    }

    /**
     * 2.2.3.2 获取待缴费用信息
     * 接口代码	outpatient.getPaybillfee
     * 说明	可以通过调用本接口获取某次就诊中指定处方的待缴费费用信息
     *
     */
    @Override
    public GetPaybillfeeOut getPaybillfee(GetPaybillfeeIn getPaybillfeeIn) {
        return null;
    }

    /**
     * 2.2.3.3 待缴费记录支付
     * 接口代码	outpatient.pay
     * 说明	通过调用本接口，将门诊处方的支付结果同步到HIS，并且执行相应的收费逻辑处理。
     *
     * @param payIn
     */
    @Override
    public PayOut pay(PayIn payIn) {
        return null;
    }

    /**
     * 2.2.3.4 已缴费记录查询
     * 接口代码	outpatient.getCompletedPayInfo
     * 说明	通过调用本接口获取用户已缴费记录。
     *
     * @param getCompletedPayInfoIn
     */
    @Override
    public ResultOut<GetCompletedPayInfoOutSet> getCompletedPayInfo(GetCompletedPayInfoIn getCompletedPayInfoIn) {
        return null;
    }

    /**
     * 2.2.3.5 已缴费记录明细查询
     * 接口代码	outpatient.getCompletedPayDetailInfo
     * 说明	通过调用该接口获取用户已缴费记录的详细信息。
     *
     * @param getCompletedPayDetailInfoIn
     */
    @Override
    public GetCompletedPayDetailInfoOut getCompletedPayDetailInfo(GetCompletedPayDetailInfoIn getCompletedPayDetailInfoIn) {
        return null;
    }

}
