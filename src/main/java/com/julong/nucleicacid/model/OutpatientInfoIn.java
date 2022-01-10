package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @className: OutpatientInfoIn
 * @date: 2022/1/6 14:21
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "req")
public class OutpatientInfoIn {
    /**idCardNo	req	String	否	身份证号码*/
    private String idCardNo;
    /**healthCardNo	req	String	否	健康卡号码*/
    private String healthCardNo;
    /**patientId	req	String	否	患者唯一ID*/
    private String patientId;
    /**patientName	req	String	否	姓名*/
    private String patientName;
    /**guardianName	req	String	否	监护人姓名*/
    private String guardianName;
    /**guardianIdCardNo	req	String	否	监护人身份证*/
    private String guardianIdCardNo;
    /**phone	req	String	否	手机号码*/
    private String phone;
    /**birthday	req	String	否	出生日期*/
    private String birthday;

}
