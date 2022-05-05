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
public class InpatientInfoIn {
    /**healthCardNo	req	String	否	健康卡号*/
    private String healthCardNo;
    /**idCardNo	req	String	否	身份证号码*/
    private String idCardNo;
    /**patientId	req	String	否	住院患者唯一ID*/
    private String patientId;
    /**inpatientId	req	String	否	住院号，患者每次住院都会生成的流水号*/
    private String inpatientId;

}
