package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @className: GetGuideListIn 用于获取项目执行指引单入参接口
 * @Description: TODO
 * @author: cxd
 * @date: 2022/4/2 9:46
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "req")
public class GetGuideListIn {
    /**clinicSeq	req	String	是	就诊流水号*/
    private String clinicSeq;
    /**receiptId	req	String	否	收据ID*/
    private String receiptId;

}
