package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @className: OutpatientInfoOut
 * @date: 2022/1/6 14:21
 */
@Data
@XmlRootElement(name = "res")
public class OutpatientInfoOut {
    /**resultCode	res	String	是	处理结果代码：0-成功*/
    private  String resultCode;
    /**resultDesc	res	String	是	处理结果描述*/
    private  String resultDesc;
    /**patientId	res	String	是	患者ID*/
    private  String patientId;
    /**patientName	res	String	是	患者姓名*/
    private  String patientName;
    /**gender	res	String	是	用户性别：M-男性 F-女性*/
    private  String gender;
    /**healthCardNo	res	String	是	健康卡号码*/
    private  String healthCardNo;
    /**idCardNo	res	String	否	身份证*/
    private  String idCardNo;
    /**birthday	res	String	否	出生日期*/
    private  String birthday;
    /**oppatNo	res	String	否	患者病历号*/
    private  String oppatNo;
    /**phone	res	String	否	联系电话*/
    private  String phone;
    /**medicareCardNo	res	String	否	医保卡号*/
    private  String medicareCardNo;
    /**homeAddress	res	String	否	家庭住址*/
    private  String homeAddress;
    /**remark	res	String	否	备注*/
    private  String remark;
    /**feeType	res	String	否	结算类型代码，1.医保 2自费 3公医 4省医*/
    private  String feeType;
    /**userTag	res	String	否	用户标签*/
    private  String userTag;
}
