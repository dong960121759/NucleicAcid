package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @className: GetDoctorInfoOutSet
 * @Description: TODO
 * @author: cxd
 * @date: 2022/4/2 10:02
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "guideInfo")
public class GetGuideListOutSet {

    /**execHospitalId	guideInfo	String	否	执行分院代码*/
    private String execHospitalId;
    /**execDeptId	guideInfo	String	是	执行科室代码*/
    private String execDeptId;
    /**execDeptName	guideInfo	String	是	执行科室名称*/
    private String execDeptName;
    /**execDeptLocation	guideInfo	String	是	执行科室地点*/
    private String execDeptLocation;
    /**itemName	guideInfo	String	是	项目名称*/
    private String itemName;
    /**execDesc	guideInfo	String	是	执行说明*/
    private String execDesc;
    /**remark	guideInfo	String	是	备注*/
    private String remark;
    /**isReadyApply	guideInfo	String	否	是否允许申请（0：否，1：是）*/
    private String isReadyApply;
    /**applyStatus	guideInfo	String	否	申请状态（0:表示已经申请，1：已经取药，其余值表示未申请）*/
    private String applyStatus;
    /**     queueNo	   guideInfo	    String	否	排队号*/
    private String      queueNo;
    /**prescriptionId	guideInfo	    String	否	处方号*/
    private String prescriptionId;
    /**receiptId	guideInfo	String	否	不区分每笔订单的收据id（不加/CX）*/
    private String receiptId;
    /**oppatNo	guideInfo	String	否	病历号，备注：当平台门诊设置的就诊指引条形码开关开启时该项必填。*/
    private String oppatNo;


}
