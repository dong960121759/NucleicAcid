package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @className: OutpatientInfoIn
 * @date: 2022/1/6 14:21
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "req")
public class DoPrepayIn {
    /**sign	req		是	签名（校验用）*/
    private String sign;
    /**data	req		是	中间节点*/
    private DoPrepayInSet data;

}
