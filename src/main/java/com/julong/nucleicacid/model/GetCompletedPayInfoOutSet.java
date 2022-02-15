package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @className: GetItemOutSet
 * @date: 2022/1/10 15:23
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "payListInfo")
public class GetCompletedPayInfoOutSet {

    /**clinicSeq	payListInfo	String	是	就诊流水号*/
    private String clinicSeq;
    /**clinicTime	payListInfo	String	是	就诊日期*/
    private String clinicTime;
    /**hospitalId	payListInfo	String	是	医院代码*/
    private String hospitalId;
    /**deptId	payListInfo	String	是	接诊科室代码*/
    private String deptId;
    /**deptName	payListInfo	String	是	接诊科室名称*/
    private String deptName;
    /**doctorId	payListInfo	String	是	接诊医生代码*/
    private String doctorId;
    /**doctorName	payListInfo	String	是	接诊医生姓名*/
    private String doctorName;
    /**payAmout	payListInfo	String	是	自费金额(单位：分)*/
    private String payAmout;
    /**recPayAmout	payListInfo	String	是	统筹金额(单位：分)*/
    private String recPayAmout;
    /**totalPayAmout	payListInfo	String	是	总金额(单位：分)*/
    private String totalPayAmout;
    /**receiptId	payListInfo	String	是	收据ID*/
    private String receiptId;
    /**chargeDate	payListInfo	String	是	缴费日期*/
    private String chargeDate;
    /**remark	payListInfo	String	否	备注*/
    private String remark;
    /**orderId	payListInfo	String	否	支付平台订单号*/
    private String orderId;
    /**allowRefund	payListInfo	String	否	是否允许退费，1表示允许退费，0表示不允许，默认值为0*/
    private String allowRefund;
    /**prescriptionIds	payListInfo	String	否	处方号,允许线上退费时必须*/
    private String prescriptionIds;
    /**refundType	payListInfo	String	否	退费方式，线上退费填"online"*/
    private String refundType;
    /**refundNo	payListInfo	String	否	退费流水号，refundStatus=1或者2时必须*/
    private String refundNo;
    /**refundStatus	payListInfo	orderInfo	否	退费状态 0已支付1退费中 2 已退费*/
    private String refundStatus;
    /**refundFee	payListInfo	String	否	退费自费金额，单位分*/
    private String refundFee;
    /**refundTime	payListInfo	String	否	退费时间yyyy-MM-dd HH:mm:ss*/
    private String refundTime;
    /**hasExpress	payListInfo	String	否	是否有药品快递信息 1包含 0不包含*/
    private String hasExpress;
    /**deliveryStatus	payListInfo	String	否	药品物流状态 0 或空，不支持配送 1 可配送 2 已配送*/
    private String deliveryStatus;
    /**medicineCode	payListInfo	String	否	取药码*/
    private String medicineCode;
    /**pickUpLocation	payListInfo	String	否	取药药房*/
    private String pickUpLocation;
    /***/

}
