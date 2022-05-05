package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @className: GetScheduleInfoOutSet
 * @Description: TODO
 * @author: cxd
 * @date: 2022/4/2 10:02
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "recordInfo")
public class InPatientInfoOutSet {
    /**patientId	recordInfo	String	是	住院患者唯一ID*/
    private String patientId;
    /**hospitalId	recordInfo	String	是	院区代码*/
    private String hospitalId;
    /**patientName	recordInfo	String	是	姓名*/
    private String patientName;
    /**inTime	recordInfo	String	是	入院日期*/
    private String inTime;
    /**outTime	recordInfo	String	是	出院日期(未出院，为空)*/
    private String outTime;
    /**inDays	recordInfo	String	是	住院天数*/
    private String inDays;
    /**patientFlag	recordInfo	String	是	患者状态 在院/预出院/结账/出院/清账*/
    private String patientFlag;
    /**totalAmout	recordInfo	String	是	总费用（单位分）*/
    private String totalAmout;
    /**prepayAmout	recordInfo	String	是	预交金额（单位分）*/
    private String prepayAmout;
    /**balance	recordInfo	String	是	预交金余额（单位分）*/
    private String balance;
    /**settled	recordInfo	String	否	已结算总额（单位分）*/
    private String settled;
    /**inpatientId	recordInfo	String	是	住院号*/
    private String inpatientId;
    /**idCardNo	recordInfo	String	否	患者身份证件号码*/
    private String idCardNo;
    /**deptId	recordInfo	String	是	病区代码*/
    private String deptId;
    /**deptName	recordInfo	String	是	病区*/
    private String deptName;
    /**bedNo	recordInfo	String	否	床位*/
    private String bedNo;
    /**chargeDoctorId	recordInfo	String	是	主管医生代码*/
    private String chargeDoctorId;
    /**chargeDoctorName	recordInfo	String	是	主管医生姓名*/
    private String chargeDoctorName;
    /**chargeNurseId	recordInfo	String	是	主管护士代码*/
    private String chargeNurseId;
    /**chargeNurseName	recordInfo	String	是	主管护士姓名*/
    private String chargeNurseName;
    /**gender	recordInfo	String	否	性别（男、女）*/
    private String gender;
    /**birthday	recordInfo	String	否	出生日期*/
    private String birthday;
    /**address	recordInfo	String	否	家庭地址*/
    private String address;
    /**connectPhone	recordInfo	String	否	联系电话（患者电话）*/
    private String connectPhone;
    /**relatePerson	recordInfo	String	否	联系人*/
    private String relatePerson;
    /**relation	recordInfo	String	否	联系人关系（文字）*/
    private String relation;
    /**relatePhone	recordInfo	String	否	联系人电话*/
    private String relatePhone;
    /**remark	recordInfo	String	否	备注*/
    private String remark;
    /**isReadyCopy	recordInfo	String	否	是否允许复印*/
    private String isReadyCopy;

}
