package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @className: GetPaybillfeeIn
 * @Description: TODO
 * @author: cxd
 * @date: 2022/2/15 9:16
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "req")
public class GetPaybillfeeIn {
    /**hospitalId	req	String	是	医院代码*/
    private String hospitalId;
    /**healthCardNo	req	String	是	患者健康卡号码*/
    private String healthCardNo;
    /**patientId	req	String	是	患者唯一ID*/
    private String patientId;
    /**clinicSeq	req	String	是	就诊流水号*/
    private String clinicSeq;
    /**doctorId	req	String	是	接诊医生工号*/
    private String doctorId;
    /**settleCode	req	String	否	医保参保类型代码*/
    private String settleCode;
    /**prescriptionIds	req	String	否	处方号，多个处方号用半角逗号隔开，如果为空则表示查询所有处方的费用信息*/
    private String prescriptionIds;
    /**payChannel	req	String	否	支付渠道（上海医保必传）当渠道为微信支付宝时，客开需发起结算*/
    private String payChannel;
    /**ecQrcode	req	String	否	电子医保凭证二维码（上海医保必传）*/
    private String ecQrcode;
    /**patientName	req	String	否	患者姓名（上海医保必传）*/
    private String patientName;
    /***/

}
