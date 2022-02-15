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
public class GetCompletedPayDetailInfoIn {

    /**clinicSeq	req	String	是	就诊流水号*/
    private String clinicSeq;
    /**receiptId	req	String	否	收据ID*/
    private String receiptId;

}
