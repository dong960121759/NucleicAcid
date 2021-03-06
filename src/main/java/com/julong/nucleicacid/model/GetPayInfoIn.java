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
public class GetPayInfoIn {
    /**hospitalId	req	String	否	医院代码*/
    private String hospitalId;
    /**healthCardNo	req	String	是	患者健康卡号码*/
    private String healthCardNo;
    /**patientId	req	String	是	患者唯一ID*/
    private String patientId;
    /**startDate	req	String	否	查询开始日期，格式：YYYY-MM-DD*/
    private String startDate;
    /**endDate	req	String	否	查询结束日期 格式：YYYY-MM-DD*/
    private String endDate;
    /**payChannel	req	String	否	支付渠道（上海医保必传）*/
    private String payChannel;



}
