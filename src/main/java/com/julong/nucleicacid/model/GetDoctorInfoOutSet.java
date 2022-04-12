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
@XmlRootElement(name = "doctorInfo")
public class GetDoctorInfoOutSet {
    /**doctorId	doctorInfo	String	是	医生ID*/
    private String doctorId;
    /**doctorName	doctorInfo	String	是	医生名称*/
    private String doctorName;
    /**doctorLevelCode	doctorInfo	String	是	医生职称代码*/
    private String doctorLevelCode;
    /**doctorLevel	doctorInfo	String	是	医生职称*/
    private String doctorLevel;
    /**deptId	doctorInfo	String	是	科室代码*/
    private String deptId;
    /**deptName	doctorInfo	String	是	科室名称*/
    private String deptName;
    /**description	doctorInfo	String	否	医生简介*/
    private String description;

}
