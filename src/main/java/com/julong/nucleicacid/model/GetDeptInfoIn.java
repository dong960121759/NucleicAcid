package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @className: GetDeptInfoIn医院科室信息入参
 * @Description: TODO
 * @author: cxd
 * @date: 2022/4/2 15:00
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "req")
public class GetDeptInfoIn {

    /**hospitalId	req	String	是	医院代码*/
    private String hospitalId;
    /**deptId	req	String	否	科室代码，如果为空则获取所有科室的信息*/
    private String deptId;
    /**deptType	req	String	否	科室分类：例如：1专科2 专家*/
    private String deptType;

}
