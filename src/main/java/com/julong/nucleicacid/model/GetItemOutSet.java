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
@XmlRootElement(name = "set")
public class GetItemOutSet {
    /**itemId	set	String	是	套餐代码*/
    private String itemId;
    /**itemName	set	String	是	套餐名称*/
    private String itemName;
    /**totalFee	set	String	是	套餐总金额，单位：分*/
    private BigDecimal totalFee;
}
