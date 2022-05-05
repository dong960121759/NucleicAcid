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
@XmlRootElement(name = "feeInfo")
public class GetDailyBillOutSet {

    /**typeCode	feeInfo	Stirng	是	类型代码*/
    private String typeCode	;
    /**typeName	feeInfo	Stirng	是	费用分类名称*/
    private String typeName	;
    /**typeAmout	feeInfo	Stirng	是	费用分类金额*/
    private String typeAmout;
    /**reimburseRatio	feeInfo	String	否	报销比例*/
    private String reimburseRatio;

}
