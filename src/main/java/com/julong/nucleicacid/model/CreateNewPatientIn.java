package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @className: CreateNewPatientIn
 * @date: 2022/1/6 16:40
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "req")
public class CreateNewPatientIn {
    /**idCardNo	req	String	是	身份证*/
    private String idCardNo;
    /**identifyType	req	String	否	证件类型*/
    private String identifyType;
    /**patientName	req	String	是	用户姓名*/
    private String patientName;
    /**gender	req	String	是	用户性别：M-男性 F-女性*/
    private String gender;
    /**phone	req	String	是	用户手机号码*/
    private String phone;
    /**birthday	req	String	否	用户出生日期：YYYY-MM-DD*/
    private String birthday;
    /**address	req	String	否	用户地址*/
    private String address;
    /**contractPerson	req	String	否	联系人*/
    private String contractPerson;
    /**contractPersonPhone	req	String	否	联系人电话*/
    private String contractPersonPhone;
    /**remark	req	String	否	备注*/
    private String remark;
    /**guardianName	req	String	否	监护人姓名*/
    private String guardianName;
    /**guardianIdCardNo	req	String	否	监护人身份证*/
    private String guardianIdCardNo;
    /**extend	req	String	否	扩展字段，格式为json如：{“nation”:”汉族”}*/
    private String extend;

}
