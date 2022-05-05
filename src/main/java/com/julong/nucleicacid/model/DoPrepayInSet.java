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
@XmlRootElement(name = "data")
public class DoPrepayInSet {

    /**orderId	data	String	是	移动订单号*/
    private String orderId;
    /**hospitalId	data	String	是	医院代码*/
    private String hospitalId;
    /**idCardNo	data	String	否	患者身份证件号码*/
    private String idCardNo;
    /**healthCardNo	data	String	否	健康卡号*/
    private String healthCardNo;
    /**patientId	data	String	是	住院患者唯一ID*/
    private String patientId;
    /**inpatientId	data	String	是	住院号*/
    private String inpatientId;
    /**orderTime	data	String	是	下订单时间，格式：YYYY-MM-DD HH24:MI:SS*/
    private String orderTime;
    /**tradeNo	data	String	是	支付流水号*/
    private String tradeNo;
    /**operatorId	data	String	是	操作员工号*/
    private String operatorId;
    /**machineId	data	String	否	设备代码（针对自助设备）*/
    private String machineId;
    /**payAmout	data	String	是	支付金额(单位“分”)*/
    private String payAmout;
    /**payMode	data	String	是	支付方式：*/
    private String payMode;
    /**prepayName	data	String	否	补录预缴纳人信息*/
    private String prepayName;


}
