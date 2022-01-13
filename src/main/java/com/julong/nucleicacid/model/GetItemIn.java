package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @className: GetItemIn
 * @date: 2022/1/10 15:20
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "req")
public class GetItemIn {
    /**hospitalId	req	String	是	医院代码*/
    private String hospitalId;
    /**itemId	req	String	否	套餐代码*/
    private String itemId;
}
