package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @className: GetDeptInfoOutSet 用于预约挂号 通过本接口获取指定日期范围内的门诊可预约科室列表信息。
 * @Description: TODO
 * @author: cxd
 * @date: 2022/4/2 15:01
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "deptInfo")
public class GetDeptInfoAppOutSet {

    /**deptId	deptInfo	String	是	科室代码*/
    private String deptId;
    /**deptName	deptInfo	String	是	科室名称*/
    private String deptName;
    /**parentId	deptInfo	String	是	上级科室代码,没有填-1*/
    private String parentId;
    /**description	deptInfo	String	否	科室简介*/
    private String description;
    /**orderNo	deptInfo	String	否	排序号*/
    private String orderNo;
    /**keyDeptLevel	deptInfo	String	否	重点科室标示
     * 01，国家临床重点专科；
     * 02，国家区域中医诊疗中心；
     * 03，国家中医重点专科；
     * 04，省重点中医专科
     * */
    private String keyDeptLevel;


}
