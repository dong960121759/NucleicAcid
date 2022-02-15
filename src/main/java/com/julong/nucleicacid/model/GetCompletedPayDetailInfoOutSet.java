package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @className: GetItemOutSet
 * @date: 2022/1/10 15:23
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "orderDetailInfo")
public class GetCompletedPayDetailInfoOutSet {
    /**detailFee	orderDetailInfo	String	是	缴费费别*/
    private String detailFee;
    /**detailId	orderDetailInfo	String	是	缴费细目流水号，要求唯一*/
    private String detailId;
    /**detailName	orderDetailInfo	String	是	缴费细目名称*/
    private String detailName;
    /**detailCount	orderDetailInfo	String	是	缴费细目数量*/
    private String detailCount;
    /**detailUnit	orderDetailInfo	String	是	缴费细目单位*/
    private String detailUnit;
    /**detailAmout	orderDetailInfo	String	是	缴费细目金额，单位：分*/
    private String detailAmout;
    /**detailSpec	orderDetailInfo	String	是	缴费规格*/
    private String detailSpec;
    /**detailPrice	orderDetailInfo	String	是	缴费细目单价，单位：分*/
    private String detailPrice;
    /**usage	orderDetailInfo	String	是	用法格式：每次处方用量/每天频率/天数/（服药方法、给药途径）例如：1片/3did/4/口服*/
    private String usage;
    /**usageAdvice	orderDetailInfo	String	否	用法嘱托 例如：服用前切忌饮酒*/
    private String usageAdvice;
    /**detailDeliverStatus	orderDetailInfo	String	否	药品物流状态 0或空,支持配送 1不可配送*/
    private String detailDeliverStatus;
    /**remark	orderDetailInfo	String	否	备注*/
    private String remark;

}
