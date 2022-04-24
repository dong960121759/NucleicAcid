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
@XmlRootElement(name = "regInfo")
public class GetScheduleInfoOutSet {
    /**doctorId	regInfo	String	是	医生代码*/
    private String doctorId;
    /**doctorName	regInfo	String	是	医生名称*/
    private String doctorName;
    /**doctorLevelCode	regInfo	String	是	医生职称代码*/
    private String doctorLevelCode;
    /**doctorLevel	regInfo	String	是	医生职称*/
    private String doctorLevel;
    /**description	regInfo	String	否	医生简介*/
    private String description;
    /**affiliatedHospital	regInfo	String	否	医生所属医院*/
    private String affiliatedHospital;
    /**registerMode	regInfo	String	否	挂号模式
     * 0：普通模式，需要及时支付确认
     * 1：审核模式：预约成功后，需要医生助手确认通过才能支付
     * */
    private String registerMode;
    /**remark	regInfo	String	否	医生出诊信息备注*/
    private String remark;
    /**deptAddress	scheduleInfo	String	否	出诊诊室地址*/
    private String deptAddress;
    /**scheduleInfo	regInfo	List*/
    private List<GetScheduleInfo> scheduleInfo;

}
