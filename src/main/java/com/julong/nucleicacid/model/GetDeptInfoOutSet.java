package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @className: GetDeptInfoOutSet
 * @Description: TODO
 * @author: cxd
 * @date: 2022/4/2 15:01
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "deptInfo")
public class GetDeptInfoOutSet {

    /**deptId	deptInfo	String	是	科室代码*/
    private String deptId;
    /**deptName	deptInfo	String	是	科室名称*/
    private String deptName;
    /**deptType	deptInfo	Integer	是	1专科2 专家*/
    private String deptType;
    /**parentId	deptInfo	String	是	上级科室代码,没有填-1*/
    private String parentId;
    /**description	deptInfo	String	是	科室简介 */
    private String description;

}
