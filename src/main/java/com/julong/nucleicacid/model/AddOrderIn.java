package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @className: AddOrderIn
 * @date: 2022/1/11 9:57
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "req")
public class AddOrderIn {
    /**healthCardNo	req	String	是	健康卡号*/
    private String healthCardNo;
    /**idCardNo	req	String	否	身份证号*/
    private String idCardNo;
    /**patientName	req	String	否	姓名*/
    private String patientName;
    /**patientId	req	String	否	患者唯一ID*/
    private String patientId;
    /**phone	req	String	否	电话号码*/
    private String phone;
    /**itemId	req	string	是	核酸检测项目ID（部分医院分多种类型检测项目，需选择）*/
    private String itemId;
    /**hospitalId	req	String	是	医院代码*/
    private String hospitalId;
    /**nucleicAddressId	req	String	否	检测地址代码*/
    private String nucleicAddressId;
    /**regDate	req	String	否	检测日期(未实现分时接口不传)*/
    private String regDate;
    /**shiftCode	req	String	否	班别代码(未实现分时接口不传)*/
    private String shiftCode;
    /**periodId	req	String	否	分时号(未实现分时接口不传)*/
    private String periodId;
    /**startTime	req	String	否	分时开始时间，格式：HH:MM(未实现分时接口不传)*/
    private String startTime;
    /**endTime	req	String	否	分时结束时间，格式：HH:MM(未实现分时接口不传)*/
    private String endTime;
    /**orderTime	req	String	否	下单时间，格式：YYYY-MM-DD HH:MI:SS*/
    private String orderTime;

}
