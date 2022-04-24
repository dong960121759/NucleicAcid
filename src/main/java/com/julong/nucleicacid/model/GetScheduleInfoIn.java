package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @className: GetScheduleInfoIn 2.2.1.2 医生出诊信息查询入参接口
 * @Description: TODO
 * @author: cxd
 * @date: 2022/4/2 9:46
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "req")
public class GetScheduleInfoIn {
    /**hospitalId	req	String	是	医院代码*/
    private String hospitalId;
    /**deptId	req	String	否	科室代码*/
    private String deptId;
    /**doctorId	req	String	否	医生代码*/
    private String doctorId;

}
