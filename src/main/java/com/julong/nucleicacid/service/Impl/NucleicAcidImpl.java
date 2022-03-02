package com.julong.nucleicacid.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.julong.nucleicacid.dao.*;
import com.julong.nucleicacid.entity.*;
import com.julong.nucleicacid.model.*;
import com.julong.nucleicacid.service.NucleicAcid;
import com.julong.nucleicacid.utils.AgeUtil;
import com.julong.nucleicacid.utils.DateTimeUtil;
import com.julong.nucleicacid.utils.JlV60DictInfo;
import com.julong.nucleicacid.utils.KingDeeCodeInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
    @Value("${_defaultWxPayID}")
    private Long _defaultWxPayID;
    @Value("${_defaultZfbPayID}")
    private Long _defaultZfbPayID;
    @Value("${_defaultDgNshPayID}")
    private Long _defaultDgNshPayID;
    @Value("${_defaultChargeWin}")
    private Long _defaultChargeWin;
    @Value("${_noteJY}")
    private String _noteJY;
    @Value("${_noteJY}")
    private String _noteFS;
    @Value("${_noteJY}")
    private String _noteBC;


    private final SimpleDateFormat _formatDate_his = new SimpleDateFormat("yyyy-MM-dd");
    private final SimpleDateFormat _formatDateTime_wx = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


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
    private final MobilePayHisPayNoFOMapper mobilePayHisPayNoFOMapper;
    private final ClChargeFOMapper clChargeFOMapper;
    private final ClChrgentryFOMapper clChrgentryFOMapper;
    private final ClPaymentFOMapper clPaymentFOMapper;
    private final ClInvoiceFOMapper clInvoiceFOMapper;
    private final ClInvoentryFOMapper clInvoentryFOMapper;
    private final LisRequestFOMapper lisRequestFOMapper;
    private final HcMobilePaymentFOMapper hcMobilePaymentFOMapper;
    private final PhysioTherapyReqFOMapper physioTherapyReqFOMapper;
    private final AppointmentReqFOMapper appointmentReqFOMapper;
    private final AppointmentFOMapper appointmentFOMapper;
    private final WindowFOMapper windowFOMapper;
    private final WindowLinkFOMapper windowLinkFOMapper;

    public NucleicAcidImpl(NucleicAcidMapper nucleicAcidMapper, PatientinfoFOMapper patientinfoFOMapper,
                           PatientCardFOMapper patientCardFOMapper, GeneratorNoMapper generatorNoMapper,
                           SmOidGeneratorMapper smOidGeneratorMapper, PaCLRegisterMapper paCLregisterMapper,
                           PcClrecipeMapper pcClrecipeMapper, OrderGroupMapper orderGroupMapper,
                           OrderItemMapper orderItemMapper, ClRecentryMapper clRecentryMapper,
                           KingDeeNucleicLogMapper kingDeeNucleicLogMapper, MobilePayHisPayNoFOMapper mobilePayHisPayNoFOMapper,
                           ClChargeFOMapper clChargeFOMapper, ClChrgentryFOMapper clChrgentryFOMapper, ClPaymentFOMapper clPaymentFOMapper,
                           ClInvoiceFOMapper clInvoiceFOMapper, ClInvoentryFOMapper clInvoentryFOMapper,
                           LisRequestFOMapper lisRequestFOMapper, HcMobilePaymentFOMapper hcMobilePaymentFOMapper, PhysioTherapyReqFOMapper physioTherapyReqFOMapper, AppointmentReqFOMapper appointmentReqFOMapper, AppointmentFOMapper appointmentFOMapper, WindowFOMapper windowFOMapper, WindowLinkFOMapper windowLinkFOMapper) {
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
        this.mobilePayHisPayNoFOMapper = mobilePayHisPayNoFOMapper;
        this.clChargeFOMapper = clChargeFOMapper;
        this.clChrgentryFOMapper = clChrgentryFOMapper;
        this.clPaymentFOMapper = clPaymentFOMapper;
        this.clInvoiceFOMapper = clInvoiceFOMapper;
        this.clInvoentryFOMapper = clInvoentryFOMapper;
        this.lisRequestFOMapper = lisRequestFOMapper;
        this.hcMobilePaymentFOMapper = hcMobilePaymentFOMapper;
        this.physioTherapyReqFOMapper = physioTherapyReqFOMapper;
        this.appointmentReqFOMapper = appointmentReqFOMapper;
        this.appointmentFOMapper = appointmentFOMapper;
        this.windowFOMapper = windowFOMapper;
        this.windowLinkFOMapper = windowLinkFOMapper;
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


            SmOidGeneratorFO smOidGeneratorFO= smOidGeneratorMapper.selectById(fid);
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
        log.info("在线建卡");
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
    public GetItemOut nucleicGetItem(GetItemIn getItemIn) {
       Long hsjcGroupID ;
        if (getItemIn.getItemId()==null ||"".equals(getItemIn.getItemId())) {
            hsjcGroupID =_defaultHsjcGroupID;
        }else {
            hsjcGroupID = Long.valueOf(getItemIn.getItemId());
        }
        GetItemOut getItemOut = new GetItemOut();
        List<GetItemOutSet> getItemOutSets = nucleicAcidMapper.nucleicGetItem(hsjcGroupID);
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
     */
    @Override
    public AddOrderOut nucleicAddOrder(AddOrderIn addOrderIn) {
        log.info("cstmr. nucleic.addOrder核酸检测预约下单");
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
            recipeEntryVO = new ClRecentryFO();
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

        kingDeeNucleicLogFO.setOid(smOidGenerate("CL_NUCLEICLOG_KINGDEE"));
        kingDeeNucleicLogMapper.insert(kingDeeNucleicLogFO);

        addOrderOut.setResultCode(KingDeeCodeInfo.SUCCESS);

        return addOrderOut ;
    }

    /**
     * 2.2.3.1 待缴费记录查询
     * 接口代码	outpatient.getPayInfo
     * 说明	通过调用该接口获取患者的待缴费就诊记录
     *
     */
    @Override
    public ResultOut<GetPayInfoOutSet> getPayInfo(GetPayInfoIn getPayInfoIn) {
        ResultOut<GetPayInfoOutSet> getPayInfoOut = new ResultOut<>();
        String cardNo = getPayInfoIn.getHealthCardNo();
        String beginDate = getPayInfoIn.getStartDate()  ;
        String endDate = getPayInfoIn.getEndDate()  ;
        //1.判断卡是否有效
        if(cardNo != null && !"".equals(cardNo.trim()) ){			//如果有卡号
            List<PatientinfoFO> patList;
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
        List<GetPayInfoOutSet> getPayInfoOutSets = nucleicAcidMapper.getPayInfo(cardNo , limitDay , beginDate , endDate);
        boolean hasother = false;
        boolean has114 = false;
        for (GetPayInfoOutSet getPayInfoOutSet : getPayInfoOutSets){

            if (JlV60DictInfo.NEW_CL_DEPT_114.equals(getPayInfoOutSet.getDeptId())) {
                has114 = true;
            } else {
                hasother = true;
            }
        }
        // 地点校验，否，不生成PAYNO 该结算既有114新市门诊 又有总院
        if(getPayInfoOutSets.size()>0 && has114 == hasother){
            getPayInfoOut.setResultCode(KingDeeCodeInfo.FAILED);
            getPayInfoOut.setResultDesc("该结算既有114新市门诊处方 又有总院的！");
            return getPayInfoOut;
        }
        getPayInfoOut.setResultCode(KingDeeCodeInfo.SUCCESS);
        getPayInfoOut.setSet(getPayInfoOutSets);

        return getPayInfoOut;
    }

    /**
     * 2.2.3.2 获取待缴费用信息
     * 接口代码	outpatient.getPaybillfee
     * 说明	可以通过调用本接口获取某次就诊中指定处方的待缴费费用信息
     *
     */
    @Override
    public GetPaybillfeeOut getPaybillfee(GetPaybillfeeIn getPaybillfeeIn) {

        GetPaybillfeeOut getPaybillfeeOut = new GetPaybillfeeOut();

        List<Long> recIds = new ArrayList<>();
        String cardNo = getPaybillfeeIn.getHealthCardNo();
        String recList = getPaybillfeeIn.getPrescriptionIds();
        List<PatientinfoFO> patList ;
        //1.判断卡是否有效
        if(cardNo != null && !"".equals(cardNo.trim()) ){			//如果有卡号

            try {
                QueryWrapper<PatientinfoFO> queryWrapper = new QueryWrapper<>();
                queryWrapper.eq("hcno", cardNo);
                queryWrapper.eq("isdelete", "0");
                patList =  patientinfoFOMapper.selectList(queryWrapper);

                if(patList == null || patList.size() <= 0){
                    getPaybillfeeOut.setResultCode(KingDeeCodeInfo.FAILED);
                    getPaybillfeeOut.setResultDesc(cardNo+ "找不到该卡号对应的病人信息！") ;
                    return getPaybillfeeOut ;
                }else if( patList.size() > 1){
                    getPaybillfeeOut.setResultCode(KingDeeCodeInfo.FAILED);
                    getPaybillfeeOut.setResultDesc(cardNo+ "该卡号对应多个病人信息！") ;
                    return getPaybillfeeOut ;
                }

            } catch (Exception e) {
                e.printStackTrace();
                getPaybillfeeOut.setResultCode(KingDeeCodeInfo.FAILED);
                getPaybillfeeOut.setResultDesc(cardNo+ "出错！") ;
                return getPaybillfeeOut ;
            }
        }else {
            getPaybillfeeOut.setResultCode(KingDeeCodeInfo.FAILED);
            getPaybillfeeOut.setResultDesc("卡号不能为空！") ;
            return getPaybillfeeOut ;
        }
        if (recList == null){
            //获得全部未结算处方ID列表

            List<GetPayInfoOutSet> getPayInfoOutSets = nucleicAcidMapper.getPayInfo(cardNo , _defaultRecipeLimitDays , null , null);

            StringBuilder sb = new StringBuilder();
            for (GetPayInfoOutSet getPayInfoOutSet: getPayInfoOutSets){
                sb.append(getPayInfoOutSet.getPrescriptionIds()).append(",");

                recIds.add(Long.valueOf(getPayInfoOutSet.getPrescriptionIds()));
            }
            recList = sb.deleteCharAt(sb.length()-1).toString();
        }else{
            String[] strRecs = recList.split(",");

            for (String strRec : strRecs){
                System.out.println(strRec);
                recIds.add(Long.valueOf(strRec));
            }
        }
        System.out.println("recIds: "+recIds.size());
        List<UnChrgRecipeBillFO> unChrgRecipeBillFOS = nucleicAcidMapper.getRecipsbyRecIds(recIds);
        List<GetPaybillfeeOutSet> getPaybillfeeOutSets = new ArrayList<>();

        System.out.println("unChrgRecipeBillFOS:"+unChrgRecipeBillFOS);
        BigDecimal amout = new BigDecimal("0");
        for (UnChrgRecipeBillFO unChrgRecipeBillFO: unChrgRecipeBillFOS) {
            //his的mobilepay_hispayno表处理
            StringBuilder sb = new StringBuilder();
            //recList = sb.deleteCharAt(sb.length()-1).toString();
            for (String recId: unChrgRecipeBillFO.getRecipeids()){
                sb.append(recId).append(",");
            }
            String eachRecipesOneEncounterId = sb.deleteCharAt(sb.length()-1).toString();

            String hispaynoKey = getHisPayNo(eachRecipesOneEncounterId,patList.get(0).getPatientid());

            for (GetPaybillfeeOutSet getPaybillfeeOutSet: unChrgRecipeBillFO.getGetPaybillfeeOutSets()){
                BigDecimal typeAmout = new BigDecimal(getPaybillfeeOutSet.getTypeAmout());
                typeAmout=  typeAmout.multiply(new BigDecimal(100));
                amout = amout.add(typeAmout);
            }

            getPaybillfeeOutSets.addAll(unChrgRecipeBillFO.getGetPaybillfeeOutSets());

        }
        getPaybillfeeOut.setPayAmout(amout.toString());
        getPaybillfeeOut.setRecPayAmout("0");
        getPaybillfeeOut.setTotalPayAmout(amout.toString());
        getPaybillfeeOut.setPrescriptionIds(recList);
        getPaybillfeeOut.setFeeInfo(getPaybillfeeOutSets);
        getPaybillfeeOut.setResultCode(KingDeeCodeInfo.SUCCESS);
        return getPaybillfeeOut;
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
        PayOut payOut = new PayOut();
        payOut.setResultCode(KingDeeCodeInfo.FAILED);

        List<Long> recIds = new ArrayList<>();
        String cardNo = payIn.getHealthCardNo();
        String recList = payIn.getPrescriptionIds();
        List<PatientinfoFO> patList ;

        //1.判断卡是否有效
        if(cardNo != null && !"".equals(cardNo.trim()) ){			//如果有卡号

            try {
                QueryWrapper<PatientinfoFO> queryWrapper = new QueryWrapper<>();
                queryWrapper.eq("hcno", cardNo);
                queryWrapper.eq("isdelete", "0");
                patList =  patientinfoFOMapper.selectList(queryWrapper);

                if(patList == null || patList.size() <= 0){
                    payOut.setResultCode(KingDeeCodeInfo.FAILED);
                    payOut.setResultDesc(cardNo+ "找不到该卡号对应的病人信息！") ;
                    return payOut ;
                }else if( patList.size() > 1){
                    payOut.setResultCode(KingDeeCodeInfo.FAILED);
                    payOut.setResultDesc(cardNo+ "该卡号对应多个病人信息！") ;
                    return payOut ;
                }

            } catch (Exception e) {
                e.printStackTrace();
                payOut.setResultCode(KingDeeCodeInfo.FAILED);
                payOut.setResultDesc(cardNo+ "出错！") ;
                return payOut ;
            }
        }else {
            payOut.setResultCode(KingDeeCodeInfo.FAILED);
            payOut.setResultDesc("卡号不能为空！") ;
            return payOut ;
        }
        if (recList == null){
            payOut.setResultCode(KingDeeCodeInfo.FAILED);
            payOut.setResultDesc("处方号不能为空！");
            return payOut ;
        }else{
            String[] strRecs = recList.split(",");
            for (String strRec : strRecs){
                recIds.add(Long.valueOf(strRec));
            }
        }

        String orderId = payIn.getOrderId() ;
        String tradeNo = payIn.getTradeNo();
        BigDecimal payAmout = payIn.getPayAmout().divide(new BigDecimal(100), 2, RoundingMode.HALF_UP) ;
        BigDecimal recPayAmout =payIn.getRecPayAmout().divide(new BigDecimal(100), 2, RoundingMode.HALF_UP);
        String payMode = payIn.getPayMode() ;
        if(orderId == null || "".equals(orderId.trim()) ) {
            payOut.setResultCode(KingDeeCodeInfo.FAILED);
            payOut.setResultDesc("支付平台订单号不能为空！");
            return payOut ;
        }

        if(tradeNo == null || "".equals(tradeNo.trim()) ) {
            payOut.setResultCode(KingDeeCodeInfo.FAILED);
            payOut.setResultDesc("第三方支付交易流水号不能为空！");
            return payOut ;
        }

        if(payAmout == null || payAmout.floatValue() < 0.01 ) {
            payOut.setResultCode(KingDeeCodeInfo.FAILED);
            payOut.setResultDesc("金额不能为空！");
            return payOut;
        }
            if (payMode == null || "".equals(payMode.trim())) {
                payOut.setResultCode(KingDeeCodeInfo.FAILED);
                payOut.setResultDesc("支付方式不能为空！");
                return payOut;
            }

            try{
                Map tMap = null ;

                tMap = null;// Hjyy_mzCharge( payMode , payAmout , recPayAmout , null , payIn ) ;

                if(tMap != null){
                    String errorMessage = (String) tMap.get("errorMessage") ;
                    if(errorMessage != null){
                        payOut.setResultCode(KingDeeCodeInfo.SUCCESS);
                        payOut.setResultDesc(errorMessage) ;
                    }else{

                        List<Long> chrgNoList = (List) tMap.get("chrgNo") ;
                        List<String> invoiceNoList = (List) tMap.get("invoiceNo") ;

                        String name   = (String)tMap.get("name") ;
                        String cardno   = (String)tMap.get("cardno") ;
                        String phone   = (String)tMap.get("phone") ;

                        //20180628 增加导引信息
                        List<String> guideList = (List) tMap.get("guideInfo") ;

                        if(chrgNoList != null && chrgNoList.size() > 0 ){

                            String chrgNo = "" , invoiceNo = "",guideinfo = "" ;

                            if(guideList != null && guideList.size() > 0){
                                for(String eachGuide : guideList){
                                    if(guideinfo.length() == 0){
                                        guideinfo = eachGuide ;
                                    }else{
                                        guideinfo = guideinfo + "；" + eachGuide ;
                                    }
                                }
//								guideinfo = guideinfo +"。[如果需要退费请先到收费处专窗补打发票]。";
//								guideinfo += "[温馨提示：请在取药、检验、检查时向医务人员出示带有条码的支付详情页面]。";
                            }

                            for(Long t_chrgNo : chrgNoList){
                                if(chrgNo.length() == 0){
                                    chrgNo = t_chrgNo.toString() ;
                                }else{
                                    chrgNo = chrgNo + "," + t_chrgNo.toString() ;
                                }
                            }

                            if(invoiceNoList != null && invoiceNoList.size() > 0){
                                for(String t_invoiceNo : invoiceNoList){
                                    if(invoiceNo.length() == 0){
                                        invoiceNo = t_invoiceNo ;
                                    }else{
                                        invoiceNo = invoiceNo + "," + t_invoiceNo ;
                                    }
                                }
                            }

                            payOut.setOrderIdHIS(chrgNo) ;
                            payOut.setReceiptId(invoiceNo); ;

                            String guide = ""; //整合，结算号和各结算的导引
                            guide = "序列号：" + chrgNoList.toString(); //结算号列表
                            guideinfo += "。[如果需要退费请先到收费处专窗补打发票]。"; //各结算号的导引导累加
                            guideinfo += "[温馨提示：请在取药、检验、检查时向医务人员出示带有条码的支付详情页面]。";
                            guide = guide + guideinfo ;

                            payOut.setGuideInfo( guide  ); ;

                            //No assign values
//							String infoMessage = (String) tMap.get("infoMessage") ;
//							if(infoMessage != null && !("".equals(infoMessage.trim())) ){
//								outBody.setGuideinfo("结算号：" + chrgNoList.toString() + "；" + infoMessage) ;
//							}

                            payOut.setResultCode(KingDeeCodeInfo.SUCCESS);
                            payOut.setResultDesc( "成功! " ) ;


                        }
                    }
                }else {
                    payOut.setResultCode(KingDeeCodeInfo.FAILED);
                    payOut.setResultDesc( "mzCharge错误! " ) ;
                }
            } catch (Exception e) {
                e.printStackTrace();
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                payOut.setResultCode(KingDeeCodeInfo.FAILED);
                payOut.setResultDesc("门诊结算出错!" + e.getMessage()) ;

            }

        return payOut;
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
    private String getHisPayNo(String recNoList,Long patientId){
            // 判断是否有KEYNO，若无则新生成hispayno 和 加记录
            String hispaynoKey = DigestUtils.md5Hex(recNoList).toUpperCase(); // MD5（hispayno）
            String oldKey = null;
            QueryWrapper<MobilePayHisPayNoFO> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("ISCHRG", "0");
            queryWrapper.eq("RECNO",recNoList);
            List<MobilePayHisPayNoFO> mobilePayHisPayNoFOS = mobilePayHisPayNoFOMapper.selectList(queryWrapper);
            if (mobilePayHisPayNoFOS !=null && mobilePayHisPayNoFOS.size()>0){
                oldKey = mobilePayHisPayNoFOS.get(0).getHisPayNo();
            }
            if (oldKey == null ||"".equals(oldKey)){
                MobilePayHisPayNoFO hispayFO = new MobilePayHisPayNoFO();
                hispayFO.setGenDate(Calendar.getInstance().getTime());
                hispayFO.setHisPayNo(hispaynoKey);
                hispayFO.setRecNo(recNoList);
                hispayFO.setPid(patientId);
                mobilePayHisPayNoFOMapper.insert(hispayFO);
            }else {
                //用原有的Key
                hispaynoKey = oldKey;
            }
            return hispaynoKey;
    }
    /**
     *<pre>
     * 黄江医院 门诊结算
     * 需求：每个医生打张发票。
     *
     * @param payIn	处方号列表
     * @param payMode	支付方式
     * @param totalPayMoney 支付总金额
     * @param medicalPayMoney 医保支付金额
     * @param preChargeMoney 预交金 支付
     * @return
     * Map
     * chrgNo 结算号
     * errorMessage 出错信息
     * infoMessage 指引信息
     * recipeItemList 返回的处方明细,List<RecipeItem>
     * </pre>
     */
    private Map Hjyy_mzCharge(String payMode,BigDecimal totalPayMoney,BigDecimal medicalPayMoney,BigDecimal preChargeMoney,PayIn payIn ){

        Map returnMap = new HashMap<>() ;

        if(totalPayMoney == null) totalPayMoney = new BigDecimal("0") ;
        if(medicalPayMoney == null) medicalPayMoney = new BigDecimal("0") ;
        if(preChargeMoney == null) preChargeMoney = new BigDecimal("0") ;


        Long pid = null ;
        List<Long> chrgNoList   = null ;	//N个 结算号
        List<String> fpNoList   = null ;  //N个发票号
        List<String> guideList  = null ;  //N个导引信息
        Object name = null , cardno = null , phone = null;

        Calendar cal = Calendar.getInstance();// 取当前日期。
        String infoMessage = "" ;		//返回指引提示信息

        Map<String , Map> recClassToWin_map = new HashMap<String , Map>() ; 	//记录已分配过的处方类型
        Map<String , String> execLocationMap = new HashMap<String , String >() ;	//记录处方执行地点

        //根据hispayno 得到 recno
        //MOBILEPAY_HISPAYNO( hispayno,recno )
        //hisPayNo：123,235,456  > 数组 rec[0] = 123,rec[1] = 235,rec[2]=456

        List<String> recNoList = new ArrayList<String>() ; //处方号的列表，生成FO时要用
        String recByPayno = payIn.getPrescriptionIds();
        String  hisPayNo = getHisPayNo(recByPayno, Long.valueOf(payIn.getPatientId()));


        String[] allRec = recByPayno.split(",") ;//全部的此次结算的处方串，包括N个医生的

        BigDecimal totalMoney = new BigDecimal("0") ;

        //Verfiy begin
        for(String oneRecNo : allRec){
            if(oneRecNo != null && !"".equals(oneRecNo.trim())){

                List<RecentryItem>  cfmx = nucleicAcidMapper.getRecentry( Long.parseLong(oneRecNo)) ;

                if (cfmx.size() > 0 ) {
                    RecentryItem obj = cfmx.get(0) ;
                    if (    "1".equals( obj.getIsCharge() )
                            || "1".equals( obj.getIsDelete() )
                    )
                    {
                        returnMap.put("errorMessage", "支付单: " + hisPayNo + " 已经无效!") ;
                        return returnMap ;
                    }

                    //此处方号的明细汇总金额
                    totalMoney = totalMoney.add( obj.getAmountAll( ) ) ;
                    pid = obj.getPatientID();

                }else {
                    returnMap.put("errorMessage", "处方: " + oneRecNo + " 无明细内容!") ;
                    return returnMap ;
                }

                recNoList.add(oneRecNo) ;
            }
        }

        if(recNoList.isEmpty()){
            returnMap.put("errorMessage", "支付单: " + hisPayNo + " 没有记录处方号!") ;
            return returnMap ;
        }

        totalPayMoney = totalPayMoney.setScale(2, BigDecimal.ROUND_HALF_UP) ; //传入的总金额
        totalMoney = totalMoney.setScale(2, BigDecimal.ROUND_HALF_UP) ; //全部处方明细的总金额
        if(Math.abs (totalPayMoney.floatValue() - totalMoney.floatValue()) >= 0.01 ){
            returnMap.put("errorMessage", "支付金额与处方金额不一致，不能结算！处方金额="+totalMoney+" 支付金额 = "+totalPayMoney) ;
            return returnMap ;
        }

        //Verify End

        try {
            //取系统设置支付代码 defaultWxPayID
            Long payCode = _defaultWxPayID ;

            //if(NYDictInfo.PAYMODE_3.equals(payMode)){
            //equalsIgnoreCase
            if(KingDeeCodeInfo.PAYMODE_98.equals(payMode)){
                payCode = _defaultWxPayID ;
            }else if(KingDeeCodeInfo.PAYMODE_99.equals(payMode)){
                payCode = _defaultZfbPayID ;
            }else{
                returnMap.put("errorMessage", "平台支付方式不正确2！") ;
                return returnMap ;
            }
            //校验支付代码
            if(payCode == null  ){
                returnMap.put("errorMessage", "微信或支付宝的支付代码 设置  错误 !") ;
                return returnMap ;
            }

            //取默认结算人代码和校验
            Long operCode = _defaultWxUserID;
            if(operCode == null  ){
                returnMap.put("errorMessage", "微信操作员代码设置错误 !") ;
                return returnMap ;
            }

            String preStock ;//计价库存预发
            String manageStock ; //是否启用库存管理0不启用、1启用不限制、2启用限制录入

            preStock = _preStock ;
            manageStock = _manageStock ;
            //// end 取系统设置

            //取病人信息
            PatientinfoFO  patientinfoFO  = patientinfoFOMapper.selectById(pid);
            if(patientinfoFO == null){
                returnMap.put("errorMessage", "取病人信息失败！") ;
                return returnMap ;
            }


            // ------ 按Encounterid分单结算  ------
			/*
			 * 各医生的分开：源串为：zs001 , zs002 ,ls001 , ls002
			 * 张三1号方，张三2号方，李四1号方，李四2号方
			 * 分成2个数组 ： (zs001,zs002) (ls001, ls002)
			 * 此单结算2次
			 *
			   hispayno > String[0] = ls001,ls002
			   String[1]= zs001,zs002
			 * */

            chrgNoList = new ArrayList<Long>();
            fpNoList   = new ArrayList<String>();
            guideList   = new ArrayList<String>();

            name = patientinfoFO.getName();
            cardno = patientinfoFO.getHcno();
            phone = patientinfoFO.getMobile();
            List<Long> recNoListLong = new ArrayList<>();
            for (String s : recNoList) {

                recNoListLong.add(Long.valueOf(s));
            }

            List<String> allDrRecs = nucleicAcidMapper.getRecipsbyEncounterID(recNoListLong) ;
            //Source data : ecNoList  = ls001, ls002 , zs001, zs002
            //Target data : allDrRecs[0] = ls001,ls002 ;  allDrRecs[1] = zs001,zs002

            for(String oneDrRecs : allDrRecs){ //医生处方串的集合,结算次数

                Long chrgNo = null ;	//1次的结算号
                String fpNo = null ;  	//1次发票号
                Long fpID = null  ; //1次发票ID
                StringBuilder eachGuide = new StringBuilder(); //1次结算的指引导

                //每个医生的处方串生成列表
                String[] rec1 =  oneDrRecs.split(",") ;
                //loop 1: oneDrRecs = ls001, ls002 > rec[0] = ls001 , rec[1] = ls002
                //loop 2: oneDrRecs = zs001 , zs002 > rec[0]=zs001 , rec[1] = zs002

                List<Long> oneDrRecsList = new ArrayList<>() ; //1个医生的处方串

                for(String recNo1 : rec1){ //1个医生处方串转化成LIST
                    oneDrRecsList.add(Long.valueOf(recNo1)); //数组到 LIST
                }

                //1个医生处方列表生成 处方头FO的LIST
                List<PcClrecipeFO> oneDrRecipeFOs = pcClrecipeMapper.selectBatchIds(oneDrRecsList) ;
                //1个医生处方列表生成 处方明细 FO 的LIST
                List<ClRecentryFO> oneDrRecentryFOs = nucleicAcidMapper.getClRecentryFOs(oneDrRecsList) ;

                //此次结算的1个医生的全部处方金额
                BigDecimal oneTotalMoney = new BigDecimal("0") ;
                for(ClRecentryFO recentryFO : oneDrRecentryFOs){
                    BigDecimal total = recentryFO.getAmount()  ;
                    if(total == null ) total = new BigDecimal("0") ;

                    oneTotalMoney = oneTotalMoney.add(total) ;
                }

                List<ClChrgentryFO> clChrgentryFOs = nucleicAcidMapper.mzCalculateClChrgentryFOs(oneDrRecsList) ;
                if (clChrgentryFOs.size()<1){
                    returnMap.put("errorMessage", "算费出错！") ;
                    return returnMap ;
                }
                List<ClInvoentryFO> clInvoentryFOs = nucleicAcidMapper.mzCalculateClInvoentryFOs(oneDrRecsList) ;
                if (clInvoentryFOs.size()<1){
                    returnMap.put("errorMessage", "算费出错！") ;
                    return returnMap ;
                }

                ClChargeFO clChargeFO = new ClChargeFO() ;
                clChargeFO.setPayorid( patientinfoFO.getPayorid()) ;
                clChargeFO.setPlanid( patientinfoFO.getPlanid()) ;
                clChargeFO.setMcno( patientinfoFO.getMcno()) ;
                clChargeFO.setSino(patientinfoFO.getSino()) ;
                clChargeFO.setChargeoper(_defaultWxUserID) ;
                clChargeFO.setChargetime(cal.getTime() ) ;
                clChargeFO.setTotalsum( oneTotalMoney ) ;
                clChargeFO.setSpsum( oneTotalMoney ) ;
                clChargeFO.setHcno( patientinfoFO.getHcno() ) ;

                clChargeFO.setChargeid(smOidGenerate("AB_CL_DATA_CHARGE"));
                clChargeFOMapper.insert(clChargeFO);
                chrgNo = clChargeFO.getChargeid();

                for(ClChrgentryFO clChrgentryFO : clChrgentryFOs ){
                    clChrgentryFO.setChargeid( chrgNo ) ;
                    clChrgentryFO.setEntryid(smOidGenerate("AB_CL_DATA_CHARGEENTRY"));
                    clChrgentryFOMapper.insert(clChrgentryFO); 	////保存：结算分类表
                }

                ClPaymentFO clPaymentFO = new ClPaymentFO() ;
                clPaymentFO.setChargeid(chrgNo) ;
                clPaymentFO.setPaymentid(payCode) ;
                clPaymentFO.setPaysum( oneTotalMoney ) ;
                clPaymentFO.setPayid(smOidGenerate("AB_CL_DATA_CHARGEPAYMENT"));
                clPaymentFOMapper.insert(clPaymentFO);


                ClInvoiceFO clInvoiceFO = new ClInvoiceFO() ;
                fpNo = "wx" + chrgNo ;
                clInvoiceFO.setInvoiceno(fpNo) ;
                clInvoiceFO.setChargeid(chrgNo) ;
                clInvoiceFO.setChargetime( cal.getTime()) ;
                clInvoiceFO.setInvoicetime(cal.getTime() ) ;
                clInvoiceFO.setName( patientinfoFO.getName() ) ;
                clInvoiceFO.setPayorid(patientinfoFO.getPayorid()) ;
                clInvoiceFO.setPlanid( patientinfoFO.getPlanid() ) ;
                clInvoiceFO.setChargeoper(_defaultWxUserID) ;
                clInvoiceFO.setSpsum(oneTotalMoney ) ;
                clInvoiceFO.setAcctsum( new BigDecimal(0));
                clInvoiceFO.setSbsum(   new BigDecimal(0) );
                clInvoiceFO.setInvoiceid(smOidGenerate("AB_CL_DATA_INVOICE"));
                clInvoiceFOMapper.insert(clInvoiceFO);
                fpID = clInvoiceFO.getInvoiceid();	//保存 :发票表

                for(ClInvoentryFO clInvoentryFO : clInvoentryFOs ){
                    clInvoentryFO.setInvoiceid( fpID ) ;
                    clInvoentryFO.setEntryid(smOidGenerate("AB_CL_DATA_INVOICEENTRY"));
                    clInvoentryFOMapper.insert(clInvoentryFO);//保存 ：发票明细表
                }


                Boolean isasrec = false;

                //导诊提示的处理
                for(PcClrecipeFO oneRecipeFO : oneDrRecipeFOs){

                    Long cfcataid = oneRecipeFO.getCataid();
                    Long deptID = oneRecipeFO.getDeptid();
                    Long mdwin = null;
                    Long cfh= oneRecipeFO.getRecipeid() ;
                    Long cflx = null ; //处方类型


                    //处理指引导信息 begin
                    List<RecentryItem> recentryLists = nucleicAcidMapper.getRecentry(cfh) ;

                    //判断是否检验处方，若是需要处理申请单数据
                    if(recentryLists != null && recentryLists.size() > 0){
                        for (RecentryItem entryItem : recentryLists) {
                            cflx = entryItem.getEntryType();

                            //此批处方中若有一个检验时，就需要做申请明细表
                            if (cflx.equals(new Long("7"))) {
                                isasrec = true;
                            }
                            ////
                        }
                    }


                    if(new Long(5).equals(cfcataid)){
                        if(!guideList.contains(_noteJY)){
                            guideList.add(_noteJY);
                        }
                    }
                    if(new Long(4).equals( cfcataid )){
                        if(recentryLists != null && recentryLists.size() > 0){
                            for (RecentryItem recipeEntryVO : recentryLists) {
                                Long executeDept = recipeEntryVO.getExecuteDept();
                                if (new Long(45).equals(executeDept)) {
                                    if (!guideList.contains(_noteBC)) {
                                        guideList.add(_noteBC);
                                    }
                                }
                                if (new Long(41).equals(executeDept)) {
                                    if (!guideList.contains(_noteFS)) {
                                        guideList.add(_noteFS);
                                    }
                                }
                            }
                        }
                    }

                    //处理指引导信息 end

                }

                //20180701-begin
                // 保存检验中间表,直接传入rec list , 用SQL构造好结构，直接存

                if (isasrec.equals(Boolean.TRUE)) {
                    List <LisRequestFO> asfos = nucleicAcidMapper.getLisRequest( oneDrRecsList  ) ;

                    if ( asfos!=null && asfos.size() > 0 ) {
                        for (LisRequestFO lisRequestFO: asfos) {
                            lisRequestFO.setChargeid(String.valueOf(chrgNo));
                            lisRequestFO.setHisRequestId(smOidGenerate("LIS_SYS_INPUT_REQUEST"));
                            lisRequestFOMapper.insert(lisRequestFO);
                        }
                    }else {
                        returnMap.put("errorMessage", "保存检验中间表错误！") ;
                        return returnMap ;
                    }

                }
                //20180701- end
                //更新挂号信息
                for(PcClrecipeFO recipeFO : oneDrRecipeFOs){
                    PaCLregisterFO paCLregisterFO = paCLregisterMapper.selectById(recipeFO.getEncounterid());
                    paCLregisterFO.setIscharge("1");
                    paCLregisterMapper.updateById(paCLregisterFO);
                }

                //保存移动支付记录表
                HcMobilePaymentFO hcMobilePaymentFO = new HcMobilePaymentFO() ;
                hcMobilePaymentFO.setChrgNo(chrgNo.toString()) ;
                hcMobilePaymentFO.setType("1") ;
                hcMobilePaymentFO.setPatCardType("01"); //TODO
                hcMobilePaymentFO.setPatCardNo(payIn.getHealthCardNo());
                hcMobilePaymentFO.setHisOrdNum(hisPayNo);
                hcMobilePaymentFO.setPsOrdNum(payIn.getOrderId());
                hcMobilePaymentFO.setAgtOrdNum(payIn.getTradeNo());
                hcMobilePaymentFO.setPayMode(String.valueOf(payCode));
//							hcMobilePaymentFO.setPayAmt(inParameter.getPayAmt());

                hcMobilePaymentFO.setPayTime(_formatDateTime_wx.format(cal.getTime()));

                hcMobilePaymentFO.setName(patientinfoFO.getName()) ;
                hcMobilePaymentFO.setPayAmt(oneTotalMoney) ;
                hcMobilePaymentFO.setRecPayAmt( oneTotalMoney ) ;

                hcMobilePaymentFO.setInvoiceNo(fpNo);

                //20180628 Save GuideInfo
                if(guideList.size() > 0){

                    for(String guide : guideList){
                        if(eachGuide.length() == 0){
                            eachGuide = new StringBuilder(guide);
                        }else{
                            eachGuide.append("；").append(guide);
                        }
                    }
                    eachGuide.append("。");
                }

                hcMobilePaymentFO.setNote(eachGuide.toString());

                hcMobilePaymentFOMapper.insert(hcMobilePaymentFO);//保存hc_MobilePayment


                //修改处方结算标志
                for(PcClrecipeFO recipeFO : oneDrRecipeFOs){

                    recipeFO.setIscharge("1");
                    recipeFO.setChargeid( chrgNo ) ;
                    recipeFO.setChargeoper( _defaultWxUserID) ;
                    recipeFO.setChargetime( cal.getTime() );
                    recipeFO.setVersionid( cal.getTime() ); //20181215

                    pcClrecipeMapper.updateById(recipeFO); //更新cl_recipe
                }


                //20181112 begin
                //检查申请表的处理 复用HIS的算法
                for(PcClrecipeFO recipeFO : oneDrRecipeFOs){

                    Long bookID = recipeFO.getRequisitionid() ;

//								if ( bookID == null ) continue;
                    if ( bookID != null ) {
                        if (  bookID < 0 ) { //病理申请单处理

                            Long reqID = (long) -bookID.intValue();
                            PhysioTherapyReqFO pfo  =physioTherapyReqFOMapper.selectById(reqID) ;
                            if (pfo !=null ) {
                                pfo.setIscharge( "1" );
                                physioTherapyReqFOMapper.updateById(pfo); //EX_DATA_PHYSIOTHERAPYREQ
                            }


                        }else { //其他申请单

                            boolean isException = false;

                            //recipe.requestid > appointreq.oid
                            //22的设备直接关联 处方表申请记录
                            //22无预约，直接申请
                            AppointmentReqFO reqVO = appointmentReqFOMapper.selectById(bookID);
                            if(reqVO != null){

                                if(new Long(22).equals(reqVO.getDevicetype())){
                                    isException = true;
                                    Long bookStatus = reqVO.getBookstatus();
                                    if(new Long(1).equals(bookStatus)){

                                        reqVO.setBookstatus(6L);
                                       appointmentReqFOMapper.updateById( reqVO ) ; //AppointmentReqFO
                                    }
                                }
                            }

                            if(!isException){
                                //recipe.requestid > appoint.bookid
                                //先预约，再申请
                                AppointmentFO fo = appointmentFOMapper.selectById( bookID);

                                if(fo != null){

                                    fo.setBookstatus(6L);

                                    appointmentFOMapper.updateById( fo ) ; //AppointmentFO
                                    //Pacs接口
                                    Long pacsItemID = fo.getPacsitemid();
                                    Long encounterID = fo.getEncounterid();

                                    if(pacsItemID != null){
                                        //getPacsServiceLocal().pacsChargeRecipes(fo);
                                        Long bbid = null;
                                        bbid = fo.getRequisitionid() ;
                                        //appoint.requestid > appointreq.oid
                                        AppointmentReqFO reqPacs =  appointmentReqFOMapper.selectById(bbid);
                                        if( reqPacs != null ) {
                                            Long bookStatus = reqPacs.getBookstatus();

                                            if(new Long(1).equals(bookStatus)){

                                                reqPacs.setBookstatus(6L);
                                                appointmentReqFOMapper.updateById( reqPacs ) ; //AppointmentReqFO
                                            }


                                        }
                                    }
                                    //Pacs接口
                                }
                            }

                        }
                    }

                }
							/*
							 *
			if(vo != null){
				Long requisitionID = vo.getRequisitionID();
				if(requisitionID != null){
					AppointmentReqVO reqVO = getAppointmentServiceLocal().getAppointmentReqVO(requisitionID);
					if(reqVO != null){
						Long bookStatus = reqVO.getBookStatus();
						if(new Long(SYDictConstants.DICT95_1).equals(bookStatus)){
							reqVO.setBookStatus(new Long(SYDictConstants.DICT95_6));
							getAppointmentServiceLocal().updateAppointmentReq(reqVO);
						}
					}
					getAppointmentServiceLocal().remove();
				}
			}

							 * */

                //20181112 end


                //修改his支付单据表记录状态
                MobilePayHisPayNoFO hispayFO = mobilePayHisPayNoFOMapper.selectById(hisPayNo);
                hispayFO.setSite(  chrgNo.toString()   );
                hispayFO.setIsChrg("1") ;
               mobilePayHisPayNoFOMapper.updateById(hispayFO) ;

                chrgNoList.add(chrgNo) ;
                fpNoList.add(fpNo) ;

                //20180911 - begin
                //分配药口窗口
                List mdqueues;
                List mdrecs  = new ArrayList() ;
                Long cfdeptid = null;
                Long ii = null;
                Long cfid = null ;

                for(PcClrecipeFO recipeFO : oneDrRecipeFOs){
                    cfid = recipeFO.getRecipeid( ) ;
                    ii = (long) -1;
                    cfdeptid = recipeFO.getDeptid() ;

                    //20181122 begin
                    //itemsource
                    try {
                        ii = nucleicAcidMapper.getNeedDispMed1(cfid) ;
                    }catch(Exception e) {
                        returnMap.put("errorMessage", "getNeedDispMed1 error"  ) ;
                    }


                    log.error(Calendar.getInstance().getTime()  + " getNeedDispMed1 cfh = " + cfid  + "，ii1 = ： " + ii);

                    if ( ii != null && ii > 0 ) {
                        //case 1 :
                        //有非加收的药品，要分窗口
                    }else {
                        ii = (long) -1;
                        //ma_agent
                        try {
                            ii = nucleicAcidMapper.getNeedDispMed2(cfid  ) ;
                        }catch(Exception e) {
                            returnMap.put("errorMessage", "getNeedDispMed2 error"  ) ;
                        }

                        log.error(Calendar.getInstance().getTime() + " getNeedDispMed2 cfh = "+ cfid +"，ii2 = ： " +  ii) ;

                        if ( ii!=null && ii > 0 ) {
                            //有ma_agent，要分窗口
                        }else {
                            //不分配口
                            continue ;
                        }

                    }

                    //20181122 end

                    Map itMap = new HashMap() ;

                    //处方头
                    itMap.put("recipe" , recipeFO);

                    //处方明细
                    ClRecentryFO aa = getDao().getRecentryFO(recipeFO.getRecipeid( ) );
                    List<ClRecentryFO> entryList = new ArrayList<>();
                    entryList.add(aa) ;

                    itMap.put("entrys" , entryList);

                    mdrecs.add(itMap) ; //做入参
                }

                //mdrecs.size() //要校验是否相同
                //不同也报错

                //根据算法来取收费窗口 ，普诊或急诊
                Long win  = _defaultChargeWin ;
                if (new Long(114).equals(cfdeptid)) {
                    win = 41L; //41	 	镇区收费窗口1
                }

                if (new Long(204).equals(cfdeptid)) {
                    win = 56L;
                    //20210913 发热门诊处方以发热收费窗来处理
                }

//							//way1:
//							mdqueues = allocateRecipes( mdrecs ,   win ) ; //返回LIST
//							if ( mdqueues.size() > 0 ) {
//								getDao().createFOs( mdqueues ) ;
//							}

                //20181122 再校验 若该 分配窗口，却未分时，报错
                //该分
                //way2:返回MAP， begin
                try {
                    Map retMap = allocateRecipes2Map( mdrecs ,   win ) ;
                    if( retMap != null ) {

                        Boolean needDispense = (Boolean) retMap.get("NeedDispense");
                        mdqueues = (List) retMap.get("mdQueue");

                        log.error(
                                Calendar.getInstance().getTime()
                                        + " 结算： hisPayNo = "+hisPayNo
                                        +"，chargeWin = " +win
                                        +"，needDispense = " + needDispense
                                        +"，产生的发药队列数： " +  mdqueues.size()
                                        +"，要分配的处方数：" + mdrecs.size()
                        ) ;

                        //若需要分配窗口，但是没有产生队列时报错
                        if ( needDispense ) {
                            if ( mdqueues.size() > 0 ) {
                                //
                                if ( mdqueues.size() != mdrecs.size() ) {
                                    returnMap.put("errorMessage", "队列数不正确  ！要分的处方数：" + mdrecs.size()
                                            + " , 分配的队列数 ="+ mdqueues.size() ) ;
                                    return returnMap ;

                                }
                                //
                                getDao().createFOs( mdqueues ) ;
                            }else {
                                returnMap.put("errorMessage", "没有产生候药队列 ！") ;
                                return returnMap ;
                            }
                        }
                    }else {
                        if ( mdrecs.size() > 0 ) {
                            returnMap.put("errorMessage", "需要分配 窗口，但allocateRecipes2Map返回空。");
                            return returnMap ;
                        }

                    }

                }catch(Exception e) {
                    returnMap.put("errorMessage", "分配窗口方法出错！！") ;
                    //return returnMap ;
                }finally {
//								if ( mdrecs.size() > 0 ) {
//
//								}
                }

                //way2 end



                //20180911 - end

            }
            // ------ end 按处方分单结算  ------


        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();

            chrgNoList = null ;
            returnMap.put("errorMessage", e.getMessage()) ;

        }finally {

            if(returnMap.containsKey("errorMessage")){		//任何一次结算发生出错时，全部回滚
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            }
        }

        //完成返回结算号
        if(chrgNoList != null){
            returnMap.put("chrgNo", chrgNoList) ;
            returnMap.put("invoiceNo", fpNoList) ;
            returnMap.put("guideInfo", guideList) ;

            returnMap.put("name", name ) ;
            returnMap.put("cardno", cardno) ;
            returnMap.put("phone", phone) ;

        }

        //返回指引信息
        if(infoMessage != null && !("".equals(infoMessage.trim())) ){
            returnMap.put("infoMessage", infoMessage ) ;
        }

        return returnMap ;
    }

    /**
     * 分配窗口
     * @param recipes
     * @param windowID
     * @return
     * @throws Exception
     */
    public Map<String, Object> allocateRecipes2Map( List recipes, Long windowID )throws Exception {

        Map<String, Object> retMap = new HashMap<>();
        List retList = new ArrayList<>();
        Map<String, Object> recipeMap = new HashMap<>();//存放处方:需要配药的处方

        Boolean NeedDispense = false ;
        try {
            if(recipes.size() > 0 ){

                //取当前时间
                Date currTime = DateTimeUtil.normalizeDate(new Date(), DateTimeUtil.DATETIME);

                //从窗口缓存中读取窗口状态和窗口对应关系。 缓存区域为：CACHE_WINDOW，缓存值为包含窗口信息和对应关系的map
                //ReplaceMent
                Map<String, Object> window = getWinLink( windowID ) ;

                WindowFO windowFO = (WindowFO) window.get("window"); //1 winID
                List windowLinkFOs = (List) window.get("links"); //N toWinLinks

//				Map recipeMap = new HashMap();//存放处方

                List agentList = new ArrayList<>();//代发材料处方
                PatientinfoFO patient = null;

                String isEmployee =null ;
                String isPriorityPack = null; //优先配药标识

                Long emergency = 109L;//急诊内科
                Long emergency1 = 208L;//急诊外科

                Long child = 136L;
                Long child1 = 137L;

                //20200817 added begin
                Long child4 = 205L;
                Long child2 = 88L;
                Long child3 = 89L;
                //20200817 added end

                //预处理处方
                for (Object o : recipes) {
                    Map recipe = (Map) o;
                    PcClrecipeFO recipeVO = (PcClrecipeFO) recipe.get("recipe");
                    List recipeEntryVOs = (List) recipe.get("entrys");
                    Long recipeID = recipeVO.getRecipeid();
                    Long patientID = recipeVO.getPatientid();

                    boolean isNeedDispense = false;

                    Long cataID = recipeVO.getCataid(); // 处方类型
                    if (cataID == null) {
                        continue;
                    }


                    for (Object entryVO : recipeEntryVOs) {
                        ClRecentryFO recipeEntryVO = (ClRecentryFO) entryVO;

                        // 是否自备药
//						if (recipeEntryVO.getIsProvide().booleanValue()) continue;

                        //加收项目不参与判断
                        Long itemsource = recipeEntryVO.getItemsource();
                        if (new Long(2).equals(itemsource)
                                || new Long(3).equals(itemsource)
                                || new Long(4).equals(itemsource)
                                || new Long(7).equals(itemsource)
                                || new Long(8).equals(itemsource)
                                || new Long(9).equals(itemsource)
                                || new Long(12).equals(itemsource)
                                || new Long(13).equals(itemsource)) {
                            continue;
                        }

                        Long entryType = recipeEntryVO.getEntrytype(); // 明细类型，即医嘱项类型
                        if (entryType.equals(1L)
                                || entryType.equals(3L)
                                || entryType.equals(4L)
                                || entryType.equals(5L)) {

                            //判断是否有优先配药的药品,若处方是否时，取药品的优先级
                            if (new String("0").equals(recipeVO.getIsprioritypack())) {

                                String isdrugPriorpack = "0";
                                isdrugPriorpack = nucleicAcidMapper.getDrugisPriortyPack(recipeEntryVO.getItemid());
                                recipeVO.setIsprioritypack(isdrugPriorpack);

                            }

                            if (new String("1").equals(recipeVO.getIsprioritypack())) {
                                isPriorityPack = "1";
                            }

                            isNeedDispense = true;

                            Long executeDept = recipeEntryVO.getExeutedept();

                        } else {
                            Long itemID = recipeEntryVO.getItemid();
                            Long encounterType = 1L;
                            String key = encounterType.toString() + "/" + itemID.toString();

                            AgentFO agentfo = null;

                            //ReplaceMent
                            agentfo = getDao().getAgentFO(encounterType, itemID);
                            if (agentfo != null) {

                                isNeedDispense = true;

                                Long agentDeptID = agentfo.getDeptID();

                                if (!agentList.contains(recipeID)) {
                                    agentList.add(recipeID);
                                }
                            }
                        }
                    }

                    log.error(Calendar.getInstance().getTime() + "需要分配窗口吗？ ,第1次 ： recipeID = "
                            + recipeID + " ， isNeedDispense = " + isNeedDispense);

                    //20181122 begin
                    //verify two //get recentry or get ma_agent
                    //再判断一次分配 窗口
                    if (!isNeedDispense) {

                        Long ii = null;
                        //用SQL来查询1
                        ii = getDao().getNeedDispMed1(recipeID);

                        if (ii != null && ii > 0) {
                            isNeedDispense = true;
                        }

                        log.error(Calendar.getInstance().getTime() + "需要分配窗口吗？ ,第2次 ： recipeID = "
                                + recipeID + " ， isNeedDispense = " + isNeedDispense);
                    }
                    if (!isNeedDispense) {

                        Long ii = null;
                        //用SQL来查询1:ma_agent
                        ii = nucleicAcidMapper.getNeedDispMed2(recipeID);

                        if (ii != null && ii > 0) {
                            isNeedDispense = true;
                        }
                        ErrorLogUtil.error(Calendar.getInstance().getTime() + "需要分配窗口吗？ ,第3次 ： recipeID = "
                                + recipeID + " ， isNeedDispense = " + isNeedDispense);
                    }

                    //20181122  end
                    if (isNeedDispense) {
                        recipeMap.put(recipeID, recipe);


                        if (patient == null) {
                            patient = getDao().getPatinfoByPid(patientID);
                            isEmployee = patient.getIsemployee();
                        }
                    }
                }

                Long MDwindow = null;
                Long MRwindow = null;

                //开始计算配药窗口
                List toCreate = new ArrayList();
                Iterator reIt = recipeMap.values().iterator();
                while(reIt.hasNext()){
                    //取第一张处方，计算分配窗口
                    Map recipe = (Map)reIt.next();

                    ClRecipeFO recipeVO = (ClRecipeFO) recipe.get("recipe");

                    Long rightWindow = null;
                    List toWindowIDs = new ArrayList();
                    Long cataID = recipeVO.getCataid();
                    String isManual = recipeVO.getIsmanual();


                    Long recipeType = recipeVO.getRecipetype();//处方种类
                    Long recipeClass = recipeVO.getRecipeclass();//处方类型
                    Long deptID = recipeVO.getDeptid();//开方科室

                    boolean isMD = false; //是否中药处方
                    boolean isFirst = false;//是否优先处方
                    boolean isChild = false;//是否儿科处方


                    if(new Long(2).equals(recipeType)){//中药处方
                        isMD = true;
                    }

                    if( new Long(2).equals(recipeClass)
                            || new String("1").equals(  isEmployee )
                            || new String("1").equals(  isPriorityPack) )  {//优先处方
                        isFirst = true;
                    }

//					if(new Long(3).equals(recipeClass)){
//						isChild = true;
//					}
                    //20200817 added , 7 depts
                    if(emergency.equals(deptID)
                            || emergency1.equals(deptID)
                            || child.equals(deptID)
                            || child1.equals(deptID)
                            || child2.equals(deptID)
                            || child3.equals(deptID)
                            || child4.equals(deptID)){//黄江特殊情况，急诊科和儿科处方 发送到统一优先窗口
                        isChild = true;
                    }

                    if(isMD){
                        if(MDwindow != null){
                            rightWindow = MDwindow;
                        }
                    }else{
                        if(MRwindow != null){
                            rightWindow = MRwindow;
                        }
                    }


                    //如果是优先处方，先看看有没有满足条件的优先窗口已经打开，有则分配进去，没有再按正常处方计算分配窗口
                    if(isFirst && rightWindow == null){
                        Iterator itWindowLinkVOs = windowLinkFOs.iterator();
                        while (itWindowLinkVOs.hasNext()) {
                            WindowLinkFO windowLinkVO = (WindowLinkFO) itWindowLinkVOs.next();
                            if (!windowLinkVO.getIsDrip().booleanValue()) {
                                if (cataID.equals(windowLinkVO.getRecType())) {
                                    Long toWinID = windowLinkVO.getToWinID();
                                    WindowFO toWindowVO = getDao().getWindowFO(toWinID);
                                    if (toWindowVO.getIsFirst() && new Long(1).equals(toWindowVO.getWinStatus())) { // 窗口状态为打开
                                        toWindowIDs.add(toWinID);
                                    }
                                }
                            }
                        }

                        if(toWindowIDs.size() == 1){
                            rightWindow = (Long) toWindowIDs.get(0);
                            if(isMD){
                                MDwindow = rightWindow;
                            }else{
                                MRwindow = rightWindow;
                            }
                        }else if(toWindowIDs.size() > 1){
                            // 多个符合的窗口以侯药人数最少的为准
                            int minPeoples = -1;

                            Iterator itToWinIDs = toWindowIDs.iterator();
                            while (itToWinIDs.hasNext()) {
                                Long winID = (Long) itToWinIDs.next();

                                // 获得该窗口的侯药队列
                                List pharmacyQueueVOs = getDao().getPharmacyQueueFOs(winID) ;

                                int peoples = pharmacyQueueVOs.size();
                                if (minPeoples == -1 || minPeoples > peoples) {
                                    minPeoples = peoples;
                                    rightWindow = winID;

                                    if(isMD){
                                        MDwindow = rightWindow;
                                    }else{
                                        MRwindow = rightWindow;
                                    }
                                }
                            }
                        }
                    }

                    //如果是儿科处方，先看看有没有满足条件的儿科窗口已经打开，有则分配进去，没有再按正常处方计算分配窗口
                    if(isChild && rightWindow == null){
                        Iterator itWindowLinkVOs = windowLinkFOs.iterator();
                        while (itWindowLinkVOs.hasNext()) {
                            WindowLinkFO windowLinkVO = (WindowLinkFO) itWindowLinkVOs.next();
                            if ( !windowLinkVO.getIsDrip().booleanValue() ) {
                                if (cataID.equals(windowLinkVO.getRecType())) {
                                    Long toWinID = windowLinkVO.getToWinID();
                                    WindowFO toWindowVO = getDao().getWindowFO(toWinID);
                                    if (toWindowVO.getIsChild() && new Long(1).equals(toWindowVO.getWinStatus())) { // 窗口状态为打开
                                        toWindowIDs.add(toWinID);
                                    }
                                }
                            }
                        }

                        if(toWindowIDs.size() == 1){
                            rightWindow = (Long) toWindowIDs.get(0);
                            if(isMD){
                                MDwindow = rightWindow;
                            }else{
                                MRwindow = rightWindow;
                            }
                        }else if(toWindowIDs.size() > 1){
                            // 多个符合的窗口以侯药人数最少的为准
                            int minPeoples = -1;

                            Iterator itToWinIDs = toWindowIDs.iterator();
                            while (itToWinIDs.hasNext()) {
                                Long winID = (Long) itToWinIDs.next();

                                // 获得该窗口的侯药队列
                                List pharmacyQueueVOs = getDao().getPharmacyQueueFOs(winID);

                                int peoples = pharmacyQueueVOs.size();
                                if (minPeoples == -1 || minPeoples > peoples) {
                                    minPeoples = peoples;
                                    rightWindow = winID;

                                    if(isMD){
                                        MDwindow = rightWindow;
                                    }else{
                                        MRwindow = rightWindow;
                                    }
                                }
                            }
                        }
                    }

                    if(rightWindow == null){
                        //第一遍找有没有状态为打开的窗口
                        Iterator itWindowLinkVOs = windowLinkFOs.iterator();
                        while (itWindowLinkVOs.hasNext()) {
                            WindowLinkFO windowLinkVO = (WindowLinkFO) itWindowLinkVOs.next();
                            if (!windowLinkVO.getIsDrip().booleanValue()) {
                                if (cataID.equals(windowLinkVO.getRecType())) {
                                    Long toWinID = windowLinkVO.getToWinID();
                                    WindowFO toWindowVO = getDao().getWindowFO(toWinID);
                                    if (!toWindowVO.getIsFirst()
                                            && !toWindowVO.getIsChild()
                                            && new Long(1).equals(toWindowVO.getWinStatus())) { // 窗口状态为打开
                                        toWindowIDs.add(toWinID);
                                    }
                                }
                            }
                        }

                        if(toWindowIDs.size() == 1){
                            rightWindow = (Long) toWindowIDs.get(0);
                            if(isMD){
                                MDwindow = rightWindow;
                            }else{
                                MRwindow = rightWindow;
                            }
                        }else if(toWindowIDs.size() > 1){
                            // 多个符合的窗口以侯药人数最少的为准
                            int minPeoples = -1;

                            Iterator itToWinIDs = toWindowIDs.iterator();
                            while (itToWinIDs.hasNext()) {
                                Long winID = (Long) itToWinIDs.next();

                                // 获得该窗口的侯药队列
                                List pharmacyQueueVOs = getDao().getPharmacyQueueFOs(winID);

                                int peoples = pharmacyQueueVOs.size();
                                if (minPeoples == -1 || minPeoples > peoples) {
                                    minPeoples = peoples;
                                    rightWindow = winID;

                                    if(isMD){
                                        MDwindow = rightWindow;
                                    }else{
                                        MRwindow = rightWindow;
                                    }
                                }
                            }
                        }else{
                            //第一遍没找到,第二遍找状态为挂起的窗口
                            itWindowLinkVOs = windowLinkFOs.iterator();
                            while (itWindowLinkVOs.hasNext()) {
                                WindowLinkFO windowLinkVO = (WindowLinkFO) itWindowLinkVOs.next();
                                if (!windowLinkVO.getIsDrip().booleanValue()) {
                                    if (cataID.equals(windowLinkVO.getRecType())) {
                                        Long toWinID = windowLinkVO.getToWinID();
                                        WindowFO toWindowVO = getDao().getWindowFO(toWinID);
                                        if (!toWindowVO.getIsFirst()
                                                && !toWindowVO.getIsChild()
                                                && new Long(2).equals(toWindowVO.getWinStatus())) { // 窗口状态为挂起
                                            toWindowIDs.add(toWinID);
                                        }
                                    }
                                }
                            }

                            if(toWindowIDs.size() > 0){
                                rightWindow = (Long) toWindowIDs.get(0);
                                if(isMD){
                                    MDwindow = rightWindow;
                                }else{
                                    MRwindow = rightWindow;
                                }
                            }else{
                                //第二遍没找到,第三遍找状态为关闭的窗口
                                itWindowLinkVOs = windowLinkFOs.iterator();
                                while (itWindowLinkVOs.hasNext()) {
                                    WindowLinkFO windowLinkVO = (WindowLinkFO) itWindowLinkVOs.next();
                                    if (!windowLinkVO.getIsDrip().booleanValue()) {
                                        if (cataID.equals(windowLinkVO.getRecType())) {
                                            Long toWinID = windowLinkVO.getToWinID();

                                            WindowFO toWindowVO = getDao().getWindowFO(toWinID);
                                            if (!toWindowVO.getIsFirst()
                                                    && !toWindowVO.getIsChild()
                                                    && new Long(3).equals(toWindowVO.getWinStatus())) { // 窗口状态为关闭
                                                toWindowIDs.add(toWinID);
                                            }
                                        }
                                    }
                                }

                                if(toWindowIDs.size() > 0 ){
                                    rightWindow = (Long) toWindowIDs.get(0);

                                    if(isMD){
                                        MDwindow = rightWindow;
                                    }else{
                                        MRwindow = rightWindow;
                                    }
                                }else{
                                    //此时没找到应该是维护有问题将窗口号设置为-1,黄江特殊处理为西药放进西药房，中药放进中药房

                                    itWindowLinkVOs = windowLinkFOs.iterator();
                                    while (itWindowLinkVOs.hasNext()) {
                                        WindowLinkFO windowLinkVO = (WindowLinkFO) itWindowLinkVOs.next();
                                        if (!windowLinkVO.getIsDrip().booleanValue()) {
                                            Long toWinID = windowLinkVO.getToWinID();

                                            WindowFO toWindowVO = getDao().getWindowFO(toWinID);
                                            if (!toWindowVO.getIsFirst()
                                                    && !toWindowVO.getIsChild()
                                                    && new Long(1).equals(toWindowVO.getWinStatus())) { // 窗口状态为关闭
                                                if(isMD){
                                                    if(new Long(50).equals(toWindowVO.getDeptID())){
                                                        rightWindow = toWinID;
                                                        break;
                                                    }
                                                }else{
                                                    if(new Long(52).equals(toWindowVO.getDeptID())){
                                                        rightWindow = toWinID;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }

                                    if(rightWindow == null){
                                        itWindowLinkVOs = windowLinkFOs.iterator();
                                        while (itWindowLinkVOs.hasNext()) {
                                            WindowLinkFO windowLinkVO = (WindowLinkFO) itWindowLinkVOs.next();
                                            if (!windowLinkVO.getIsDrip().booleanValue()) {
                                                Long toWinID = windowLinkVO.getToWinID();

                                                WindowFO toWindowVO = getDao().getWindowFO(toWinID);
                                                if (!toWindowVO.getIsFirst()
                                                        && !toWindowVO.getIsChild()
                                                        && new Long(2).equals(toWindowVO.getWinStatus())) { // 窗口状态为挂起
                                                    if(isMD){
                                                        if(new Long(50).equals(toWindowVO.getDeptID())){
                                                            rightWindow = toWinID;
                                                            break;
                                                        }
                                                    }else{
                                                        if(new Long(52).equals(toWindowVO.getDeptID())){
                                                            rightWindow = toWinID;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }

                                    if(rightWindow == null){
                                        itWindowLinkVOs = windowLinkFOs.iterator();
                                        while (itWindowLinkVOs.hasNext()) {
                                            WindowLinkFO windowLinkVO = (WindowLinkFO) itWindowLinkVOs.next();
                                            if (!windowLinkVO.getIsDrip().booleanValue()) {
                                                Long toWinID = windowLinkVO.getToWinID();

                                                WindowFO toWindowVO = getDao().getWindowFO(toWinID);
                                                if (!toWindowVO.getIsFirst()
                                                        && !toWindowVO.getIsChild()
                                                        && new Long(3).equals(toWindowVO.getWinStatus())) { // 窗口状态为关闭
                                                    if(isMD){
                                                        if(new Long(50).equals(toWindowVO.getDeptID())){
                                                            rightWindow = toWinID;
                                                            break;
                                                        }
                                                    }else{
                                                        if(new Long(52).equals(toWindowVO.getDeptID())){
                                                            rightWindow = toWinID;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }

                                    if(rightWindow == null){
                                        rightWindow = new Long(-1);
                                    }

                                    if(isMD){
                                        MDwindow = rightWindow;
                                    }else{
                                        MRwindow = rightWindow;
                                    }
                                }
                            }
                        }
                    }

                    ErrorLogUtil.error(
                            Calendar.getInstance().getTime()
                                    +"分配 窗口map： recipeid = " + recipeVO.getRecipeid()
                                    + "， rightWindow = "+rightWindow
                    );

                    if(rightWindow != null){
                        ClMdqueueFO pharmacyQueueVO = new ClMdqueueFO();
                        pharmacyQueueVO.setQueueid(null);
                        pharmacyQueueVO.setPatientid(recipeVO.getPatientid());
                        pharmacyQueueVO.setEncounterid(recipeVO.getEncounterid());
                        pharmacyQueueVO.setName(recipeVO.getName());
                        pharmacyQueueVO.setSex(recipeVO.getSex());
                        pharmacyQueueVO.setAge(recipeVO.getAge());
                        pharmacyQueueVO.setRecipeid(recipeVO.getRecipeid() );
                        pharmacyQueueVO.setDeptid(recipeVO.getDeptid());
                        pharmacyQueueVO.setDocid(recipeVO.getDocid());
                        pharmacyQueueVO.setRecipetime(recipeVO.getInputtime());
                        pharmacyQueueVO.setQueuetime(recipeVO.getChargetime());
                        pharmacyQueueVO.setChargeoper(recipeVO.getChargeoper());
                        pharmacyQueueVO.setIsprioritypack(recipeVO.getIsprioritypack());

                        pharmacyQueueVO.setIsincludedrip("1");

                        //是否非药品处方
                        if(agentList.contains(recipeVO.getRecipeclass())){
                            pharmacyQueueVO.setIsnotdrug("1");
                        }else{
                            pharmacyQueueVO.setIsnotdrug("0");
                        }

                        pharmacyQueueVO.setQueuestatus(new Long(1));
                        pharmacyQueueVO.setWindowid(rightWindow);
                        pharmacyQueueVO.setChargeid(recipeVO.getChargeid());
                        pharmacyQueueVO.setVersionid( currTime  );
                        toCreate.add(pharmacyQueueVO);
                    }
                }

                if(toCreate.size() > 0){
                    Iterator aIt = toCreate.iterator();
                    while(aIt.hasNext()){
                        ClMdqueueFO pharmacyQueueVO = (ClMdqueueFO) aIt.next();
                        retList.add(pharmacyQueueVO);
                    }
                }

            }

        }
        catch (Exception e) {
            log.error(e.getLocalizedMessage());

        }

        if ( recipeMap.size() > 0 ) {
            NeedDispense = new Boolean( true );
        }else {
            NeedDispense = new Boolean( false ); //不需要分配药房
        }

        retMap.put("NeedDispense", NeedDispense) ;
        retMap.put("mdQueue", retList) ;

        return retMap;
    }
    public Map<String,Object> getWinLink( Long winid ) {

        if (winid == null) {
            return null;
        }

        Map<String, Object> content = new HashMap<>();

        WindowFO windowFO;


        windowFO = windowFOMapper.selectById(winid); //1 WIndow
        if (windowFO != null) {
            QueryWrapper<WindowLinkFO> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("winID", winid);

            List<WindowLinkFO> windowLinkFOs = windowLinkFOMapper.selectList(queryWrapper);


            content.put("window", windowFO); //1 window
            content.put("links", windowLinkFOs); //1:N windowLinks


        }

        return content;
    }

}
