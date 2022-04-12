package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @className: GetRegisterInfoOutSet
 * @Description: TODO
 * @author: cxd
 * @date: 2022/4/11 9:12
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "orderInfo")
public class GetRegisterInfoOutSet {
    /**status*/
    private String status;
    /**healthCardNo	orderInfo	String	是	患者卡号*/
    private String healthCardNo;
    /**patientName	orderInfo	String	是	患者姓名*/
    private String patientName;
    /**patientId	orderInfo	String	是	患者ID*/
    private String patientId;
    /**orderId	orderInfo	String	是	移动订单号*/
    private String orderId;
    /**bookingNo	orderInfo	String	是	HIS预约订单号/当天挂号锁号ID*/
    private String bookingNo;
    /**clinicSeq	orderInfo	String	是	就诊流水号*/
    private String clinicSeq;
    /**hospitalId	orderInfo	String	否	医院代码 第三方挂的号要在服务平台支付，则该参数必传*/
    private String hospitalId;
    /**deptId	orderInfo	String	是	科室代码*/
    private String deptId;
    /**deptName	orderInfo	String	是	科室名称*/
    private String deptName;
    /**doctorId	orderInfo	String	否	接诊医生代码*/
    private String doctorId;
    /**doctorName	orderInfo	String	否	接诊医生姓名*/
    private String doctorName;
    /**regDate	orderInfo	String 	否	就诊日期*/
    private String regDate;
    /**shiftCode	orderInfo	String	否	班别代码*/
    private String shiftCode;
    /**shiftName	orderInfo	String	否	班别名称，如上午、下午*/
    private String shiftName;
    /**startTime	orderInfo	String	否	分时开始时间，格式：HH:MI*/
    private String startTime;
    /**endTime	orderInfo	String	否	分时结束时间，格式：HH:MI*/
    private String endTime;
    /**svObjectId	orderInfo	String	否	服务对象id，默认为普通患者*/
    private String svObjectId;
    /**svObjectName	orderInfo	String	否	患者服务对象(人群 )*/
    private String svObjectName;
    /**scheduleId	orderInfo	String	否	排班号*/
    private String scheduleId;
    /**roomAddress	orderInfo	String	否	出诊位置*/
    private String roomAddress;
    /**registerType	orderInfo	String	是	挂号类型 0-预约挂号 1-当天挂号*/
    private String registerType;
    /**queueNo	orderInfo	String	是	排队序号*/
    private String queueNo;
    /**waitingCount	orderInfo	Sring	否	前面就诊人数，如果患者已就诊，则设为-1*/
    private String waitingCount;
    /**waitingTime	orderInfo	Sring	否	预计候诊等待时间(分钟) 例:1患者就诊设置3分分钟，10个患者预计候诊30分钟*/
    private String waitingTime;
    /**infoTime	orderInfo	String	否	取号时间格式： YYYY-MM-DD HI24:MI:SS*/
    private String infoTime;
    /**visitTime	orderInfo	String	否	就诊时间（实际接诊时间） YYYY-MM-DD HI24:MI:SS*/
    private String visitTime;
    /**orderType	orderInfo	String	是	挂号来源 10-金蝶微信 11-金蝶支付宝（其他渠道的值his自定义）*/
    private String orderType;
    /**orderTypeName	orderInfo	String	否	挂号来源名称*/
    private String orderTypeName;
    /**orderTime	orderInfo	String	是	挂号下单时间*/
    private String orderTime;
    /**remark	orderInfo	String	否	备注*/
    private String remark;
    /**isCancelabe	orderInfo	String	是	是否可以取消，0-不可以，1-可以，2-未定义，移动平台可根据自己的规则控制。*/
    private String isCancelabe;
    /**isPayment 	orderInfo	String	否	是否允许支付【0-不允许；1-允许】 默认值为1*/
    private String isPayment ;
    /**payStatus	orderInfo	String	是	支付状态 0-未支付 1-已支付 2-已退费*/
    private String payStatus;
    /**regFee	orderInfo	String	是	挂号费(单位“分”)*/
    private String regFee;
    /**treatFee	orderInfo	String	是	诊疗费(单位“分”)*/
    private String treatFee;
    /**yhFee	orderInfo	String	是	优惠挂号费(单位“分”)*/
    private String yhFee;
    /**payFee	orderInfo	String	是	实际支付费用(单位“分”) payFee = regFee + treatFee - yhFee*/
    private String payFee;
    /**isSelectSvObject	orderInfo	String	否	是否允许选择服务对象  0-不允许，1-允许默认值为0,该参数只针对第三方渠道的挂号订单，在支付前选择服务对象。*/
    private String isSelectSvObject;
    /**autoLockBeforePay	orderInfo	String	否	挂号支付前，是否必须先锁号  0-不允许，1-允许默认值为0，该参数只针对第三方渠道的挂号订单。*/
    private String autoLockBeforePay;


}
