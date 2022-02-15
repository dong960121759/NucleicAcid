package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

/**
 * @className: GetItemOutSet
 * @date: 2022/1/10 15:23
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "feeInfo")
public class GetPaybillfeeOutSet {
    /**typeCode	feeInfo	String	是	费用分类代码*/
    private String typeCode;
    /**typeName	feeInfo	String	是	费用分类名称*/
    private String typeName;
    /**typeAmout	feeInfo	String	是	费用分类金额，单位分*/
    private String typeAmout;

}
