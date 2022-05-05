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
    /**deptType	req	String	否	科室分类：例如：1专科2 专家 为空时不限制查询指定科室分类，不为空则限制*/
    private String deptType;
    /**doctorId	req	String	否	医生代码*/
    private String doctorId;
    /**searchCode	req	String	否	搜索关键字，如医生姓名，拼音码等*/
    private String searchCode;
    /**startDate	req	String	是	号源开始日期，格式：YYYY-MM-DD*/
    private String startDate;
    /**endDate	req	String	是	号源结束日期格式：YYYY-MM-DD*/
    private String endDate;

}
