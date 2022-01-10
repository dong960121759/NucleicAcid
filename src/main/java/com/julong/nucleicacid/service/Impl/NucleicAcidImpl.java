package com.julong.nucleicacid.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.julong.nucleicacid.dao.NucleicAcidMapper;
import com.julong.nucleicacid.dao.PatientinfoFOMapper;
import com.julong.nucleicacid.entity.PatientinfoFO;
import com.julong.nucleicacid.model.CreateNewPatientIn;
import com.julong.nucleicacid.model.CreateNewPatientOut;
import com.julong.nucleicacid.model.OutpatientInfoIn;
import com.julong.nucleicacid.model.OutpatientInfoOut;
import com.julong.nucleicacid.service.NucleicAcid;
import com.julong.nucleicacid.utils.JlV60DictInfo;
import com.julong.nucleicacid.utils.KingDeeCodeInfo;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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

    private final NucleicAcidMapper nucleicAcidMapper;
    private final PatientinfoFOMapper patientinfoFOMapper;

    public NucleicAcidImpl(NucleicAcidMapper nucleicAcidMapper, PatientinfoFOMapper patientinfoFOMapper) {
        this.nucleicAcidMapper = nucleicAcidMapper;
        this.patientinfoFOMapper = patientinfoFOMapper;
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
        System.out.println(_defaultPayorID);
        System.out.println(_defaultPlanID);

        fo.setPayorid(_defaultPayorID) ;
        fo.setPlanid(_defaultPlanID) ;
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
        //fo.setHcno(
        patientinfoFOMapper.insert(fo);


        return new CreateNewPatientOut();
    }

}
