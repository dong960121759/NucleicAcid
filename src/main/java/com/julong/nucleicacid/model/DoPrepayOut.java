package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @className: CreateNewPatientOut
 * @date: 2022/1/6 16:48
 */
@Data
@XmlRootElement(name = "res")
public class DoPrepayOut {
    /**resultCode	res	String	是	处理结果代码：0-成功 -1 失败*/
    private String resultCode;
    /**resultDesc	res	String	否	处理结果描述*/
    private String resultDesc;
    /**receiptId	res	String 	否	收据ID*/
    private String receiptId;
    /**balance	res	String	否	预交金余额（单位分）*/
    private String balance;
    /**remark	res	String	否	备注*/
    private String remark;


}
