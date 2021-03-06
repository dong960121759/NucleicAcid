package com.julong.nucleicacid.controller;

import com.julong.nucleicacid.model.*;
import com.julong.nucleicacid.service.NucleicAcid;
import com.julong.nucleicacid.utils.KingDeeCodeInfo;
import com.julong.nucleicacid.utils.XmlUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


/**
 * @className: NucleicAcidController
 * @date: 2021/11/11 9:21
 */
@RestController
@RequestMapping("")
public class NucleicAcidController {

    private final NucleicAcid nucleicAcidImpl;

    public NucleicAcidController(NucleicAcid nucleicAcidImpl) {
        this.nucleicAcidImpl = nucleicAcidImpl;
    }

    @PostMapping(value = "/doReqToHis", produces = "application/xml;charset=UTF-8")
    public String doReqToHis(@Valid RequestIn requestIn, @RequestBody String inXml) {
        System.out.println(requestIn.getService());
        System.out.println(requestIn.getUser());
        System.out.println(requestIn.getPassword());
        System.out.println(inXml);
        WSCResult wscResult = new WSCResult();
        wscResult.setResultCode(KingDeeCodeInfo.SUCCESS);
        wscResult.setResultDesc("传入参数出错！");

        switch (requestIn.getService()) {
            //2.1.1	医院信息
            case "hospital.getDeptInfo":
                //2.1.1.1 获取医院科室信息接口
                return XmlUtil.pojoToXml((nucleicAcidImpl.getDeptInfo((GetDeptInfoIn) XmlUtil.xmlToPojo(GetDeptInfoIn.class, inXml))));
            case "hospital.getDoctorInfo":
                //2.1.1.2 获取医生信息接口
                return XmlUtil.pojoToXml((nucleicAcidImpl.getDoctorInfo((GetDoctorInfoIn) XmlUtil.xmlToPojo(GetDoctorInfoIn.class, inXml))));
            //2.1.2	患者基本信息
            case "baseinfo.getOutpatientInfo":
                //2.1.2.1 门诊患者基本信息查
                return XmlUtil.pojoToXml(nucleicAcidImpl.getOutpatientInfo((OutpatientInfoIn) XmlUtil.xmlToPojo(OutpatientInfoIn.class, inXml)));
            case "baseinfo.getInpatientInfo":
                //2.1.2.2 住院患者信息查询
                return XmlUtil.pojoToXml(nucleicAcidImpl.getInpatientInfo((InpatientInfoIn) XmlUtil.xmlToPojo(InpatientInfoIn.class, inXml)));
            //2.2.1	预约挂号
            case "appointment.getDeptInfo":
                //2.2.1.1 门诊出诊科室信息查询
                return XmlUtil.pojoToXml(nucleicAcidImpl.getDeptInfoApp((GetDeptInfoIn) XmlUtil.xmlToPojo(GetDeptInfoIn.class, inXml)));
            case "appointment.getScheduleInfo":
                //2.2.1.2 医生出诊信息查询
                return XmlUtil.pojoToXml(nucleicAcidImpl.getScheduleInfo((GetScheduleInfoIn) XmlUtil.xmlToPojo(GetScheduleInfoIn.class, inXml)));
            case "user.createNewPatient":
                //2.2.4.1在线建卡
                return XmlUtil.pojoToXml(nucleicAcidImpl.createNewPatient((CreateNewPatientIn) XmlUtil.xmlToPojo(CreateNewPatientIn.class, inXml)));
            case "support.getRegisterInfo":
                //2.2.5.1 挂号记录查询
                return XmlUtil.pojoToXml(nucleicAcidImpl.getRegisterInfoIn((GetRegisterInfoIn) XmlUtil.xmlToPojo(GetRegisterInfoIn.class, inXml)));

            case "cstmr.nucleic.getItem":
                //1.2核酸检测预约项目类型
                return XmlUtil.pojoToXml(nucleicAcidImpl.nucleicGetItem((GetItemIn) XmlUtil.xmlToPojo(GetItemIn.class, inXml)));
            case "cstmr.nucleic.addOrder":
                //1.4核酸检测预约下单
                return XmlUtil.pojoToXml((nucleicAcidImpl.nucleicAddOrder((AddOrderIn) XmlUtil.xmlToPojo(AddOrderIn.class, inXml))));
            case "outpatient.getPayInfo":
                //2.2.3.1待缴费记录查询
                return XmlUtil.pojoToXml((nucleicAcidImpl.getPayInfo((GetPayInfoIn) XmlUtil.xmlToPojo(GetPayInfoIn.class, inXml))));
            case "outpatient.getPaybillfee":
                //2.2.3.2获取待缴费用信息
                return XmlUtil.pojoToXml((nucleicAcidImpl.getPaybillfee((GetPaybillfeeIn) XmlUtil.xmlToPojo(GetPaybillfeeIn.class, inXml))));

            case "outpatient.pay":
                //2.2.3.3待缴费记录支付
                return XmlUtil.pojoToXml((nucleicAcidImpl.pay((PayIn) XmlUtil.xmlToPojo(PayIn.class, inXml))));

            case "outpatient.getCompletedPayInfo":
                //2.2.3.4已缴费记录查询
                return XmlUtil.pojoToXml((nucleicAcidImpl.getCompletedPayInfo((GetCompletedPayInfoIn) XmlUtil.xmlToPojo(GetCompletedPayInfoIn.class, inXml))));

            case "outpatient.getCompletedPayDetailInfo":
                //2.2.3.5 已缴费记录明细查询
                return XmlUtil.pojoToXml((nucleicAcidImpl.getCompletedPayDetailInfo((GetCompletedPayDetailInfoIn) XmlUtil.xmlToPojo(GetCompletedPayDetailInfoIn.class, inXml))));

            case "inpatient.doPrepay":
                //2.2.8.1 住院预交金缴纳
                return XmlUtil.pojoToXml((nucleicAcidImpl.doPrepay((DoPrepayIn) XmlUtil.xmlToPojo(DoPrepayIn.class, inXml))));
            case "inpatient.getPrepayRecord":
                //2.2.8.1 住院预交金缴纳
                return XmlUtil.pojoToXml((nucleicAcidImpl.getPrepayRecord((GetPrepayRecordIn) XmlUtil.xmlToPojo(GetPrepayRecordIn.class, inXml))));
            case "inpatient.getDailyBill":
                //2.2.8.1 住院预交金缴纳
                return XmlUtil.pojoToXml((nucleicAcidImpl.getDailyBill((GetDailyBillIn) XmlUtil.xmlToPojo(GetDailyBillIn.class, inXml))));


        }
        return XmlUtil.pojoToXml(wscResult);
    }
}
