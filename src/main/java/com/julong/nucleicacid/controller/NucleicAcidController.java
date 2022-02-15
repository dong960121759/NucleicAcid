package com.julong.nucleicacid.controller;

import com.julong.nucleicacid.model.*;
import com.julong.nucleicacid.service.NucleicAcid;
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

    @PostMapping(value = "/doReqToHis",produces = "application/xml;charset=UTF-8")
    public String doReqToHis(@Valid RequestIn requestIn, @RequestBody String inXml){
        System.out.println(requestIn.getService());
        System.out.println(requestIn.getUser());
        System.out.println(requestIn.getPassword());
        System.out.println(inXml);

        switch (requestIn.getService()) {
            case "getOutpatientInfo":
                //2.1.2.1 门诊患者基本信息查
                return XmlUtil.pojoToXml(nucleicAcidImpl.getOutpatientInfo((OutpatientInfoIn) XmlUtil.xmlToPojo(OutpatientInfoIn.class,inXml)));
            case "createNewPatient":
                //2.2.4.1在线建卡
                return XmlUtil.pojoToXml(nucleicAcidImpl.createNewPatient((CreateNewPatientIn) XmlUtil.xmlToPojo(CreateNewPatientIn.class,inXml)));
            case "getItem":
                //1.2核酸检测预约项目类型
                return XmlUtil.pojoToXml(nucleicAcidImpl.nucleicGetItem((GetItemIn) XmlUtil.xmlToPojo(GetItemIn.class,inXml)));
            case "addOrder":
                //1.4核酸检测预约下单
                return XmlUtil.pojoToXml((nucleicAcidImpl.nucleicAddOrder((AddOrderIn) XmlUtil.xmlToPojo(AddOrderIn.class,inXml))));
            case "getPayInfo":
                //2.2.3.1待缴费记录查询
                return XmlUtil.pojoToXml((nucleicAcidImpl.getPayInfo((AddOrderIn) XmlUtil.xmlToPojo(AddOrderIn.class,inXml))));
            case "getPaybillfee":
            //2.2.3.2获取待缴费用信息
                return XmlUtil.pojoToXml((nucleicAcidImpl.getPaybillfee((AddOrderIn) XmlUtil.xmlToPojo(AddOrderIn.class,inXml))));

            case "pay":
            //2.2.3.3待缴费记录支付
                return XmlUtil.pojoToXml((nucleicAcidImpl.pay((AddOrderIn) XmlUtil.xmlToPojo(AddOrderIn.class,inXml))));

            case "getCompletedPayInfo":
            //2.2.3.4已缴费记录查询
                return XmlUtil.pojoToXml((nucleicAcidImpl.getCompletedPayInfo((AddOrderIn) XmlUtil.xmlToPojo(AddOrderIn.class,inXml))));

            case "getCompletedPayDetailInfo":
            //2.2.3.5 已缴费记录明细查询
                return XmlUtil.pojoToXml((nucleicAcidImpl.getCompletedPayDetailInfo((AddOrderIn) XmlUtil.xmlToPojo(AddOrderIn.class,inXml))));

        }
        return null;
    }
}
