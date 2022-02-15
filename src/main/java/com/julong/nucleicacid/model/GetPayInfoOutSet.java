package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

/**
 * @className: GetItemOutSet
 * @date: 2022/1/10 15:23
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "payListInfo")
public class GetPayInfoOutSet {
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
    /**payAmout	payListInfo	String	是	未缴费总金额，单位：分*/
    private String payAmout;
    /**settleCode	payListInfo	String	是	结算类型代码，自费00 必填参数，，否则页面会显示null*/
    private String settleCode;
    /**settleType	payListInfo	String	否	结算类型名称,自费时可空*/
    private String settleType;
    /**outpatientType	payListInfo	String	否	诊间支付类型：	（空字符串或0：普通线上诊间支付模式；1：充值模式）*/
    private String outpatientType;
    /**prescriptionIds	payListInfo	String	否	处方号*/
    private String prescriptionIds;
    /**isFirstPay	payListInfo	String	否	是否优先支付 1是0 否*/
    private String isFirstPay;

}
