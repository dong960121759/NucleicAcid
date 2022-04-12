package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @className: GetRegisterInfoIn
 * @Description: TODO
 * @author: cxd
 * @date: 2022/4/11 9:06
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "req")
public class GetRegisterInfoIn {
    /**healthCardNo	req	String	否	患者卡号*/
    private String healthCardNo;
    /**clinicSeq	req	String	否	就诊流水*/
    private String clinicSeq;
    /**patientId	req	String	否	患者ID*/
    private String patientId;
    /**orderId	req	String	否	移动订单号*/
    private String orderId;
    /**orderDate	req	String	否	挂号日期【格式：YYYY-MM-DD】*/
    private String orderDate;
    /**visitDate	req	String	否	就诊日期【格式：YYYY-MM-DD】*/
    private String visitDate;
    /**patientName	req	String	否	患者姓名*/
    private String patientName;
    /**idCardNo	req	String	否	身份证号码*/
    private String idCardNo;
    /**bookingNo	req	String	否	HIS预约订单号/当天挂号锁号ID*/
    private String bookingNo;
    /**doctorId	req	String	否	医生ID*/
    private String doctorId;
    /**orderStatus	req	String	否	挂号状态：
     * 0：未取号
     * 1：已取号
     * 2：已退费(已取号)
     * 3: 已就诊
     * 4：未付费取消
     * 5: 已付费已取消
     * 6: 允许预约报到
     * 7：已爽约
     * */
    private String orderStatus;

}
