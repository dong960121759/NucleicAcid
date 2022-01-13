package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @className: CreateNewPatientOut
 * @date: 2022/1/6 16:48
 */
@Data
@XmlRootElement(name = "res")
public class AddOrderOut {
    /**resultCode	res	String	是	处理结果代码：0-成功*/
    private String resultCode;
    /**resultDesc	res	String	是	处理结果描述*/
    private String resultDesc;
    /**patientId	res	String	是	患者ID，当resultCode为0时必须返回*/
    private String patientId;
    /**healthCardNo	res	String	是	健康卡号码，当resultCode为0时必须返回*/
    private String healthCardNo;
    /**oppatNo	res	String	否	患者病历号*/
    private String oppatNo;

}
