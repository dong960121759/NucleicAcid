package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @className: CreateNewPatientOut
 * @date: 2022/1/6 16:48
 */
@Data
@XmlRootElement(name = "res")
public class PayOut {
    /**resultCode	res	String	是	处理结果代码：0-成功*/
    private String resultCode;
    /**resultDesc	res	String	否	处理结果描述*/
    private String resultDesc;
    /**remark	res	String	否	备注*/
    private String remark;
    /**guideInfo	res	String	否	指引信息*/
    private String guideInfo;
    /**receiptId	res	String	否	收据ID*/
    private String receiptId;
    /**orderIdHIS	res	String	否	HIS缴费订单号缴费成功时返回HIS系统生成的缴费订单，要求唯一*/
    private String orderIdHIS;
    /**hasDelivery	res	String	否	是否支持药品配送 0 或空，不支持配送 1 可配送 将会推送一条配送消息*/
    private String hasDelivery;
    /***/

}
