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
public class PayIn {
    /**sign	req		是	签名（校验用）*/
    private String sign;
    /**data	req		是	中间节点*/
    private String data;
    /**hospitalId	req	String	是	医院代码*/
    private String hospitalId;
    /**healthCardNo	req	String	是	用户健康卡号码*/
    private String healthCardNo;
    /**patientId	req	String	是	患者唯一ID*/
    private String patientId;
    /**clinicSeq	req	String	是	就诊流水号*/
    private String clinicSeq;
    /**orderId	req	String	是	支付平台订单号*/
    private String orderId;
    /**tradeNo	req	String	是	第三方支付交易流水号*/
    private String tradeNo;
    /**operatorId	req	String	是	操作员工号*/
    private String operatorId;
    /**machineId	req	String	否	设备代码（针对自助设备）*/
    private String machineId;
    /**payAmout	req	String	是	自费金额(单位：分)*/
    private String payAmout;
    /**recPayAmout	req	String	否	统筹金额(单位：分)*/
    private String recPayAmout;
    /**totalPayAmout	req	String	否	总金额(单位：分)*/
    private String totalPayAmout;
    /**payMode	req	String	是	支付方式：具体编码定义见2.8支付方式*/
    private String payMode;
    /**payTime	req	String	是	交易时间，格式：YYYY-MM-DD HI24:MI:SS*/
    private String payTime;
    /**prescriptionIds	req	String	是	处方号，多个处方号用半角逗号分隔*/
    private String prescriptionIds;
    /**medicareSettleLogId	req	String	否	医保成功支付结果串，详细看样例*/
    private String medicareSettleLogId;
    /**isDecoction	res	String	否	是否代煎，1表示需要 0或者空不需要*/
    private String isDecoction;
    /**isDelivery	res	String	否	是否需要配送 1表示需要 0或者空不需要*/
    private String isDelivery;
    /**deliveryAddr	res	String	否	配送地址，isDelivery=1时必须*/
    private String deliveryAddr;
    /**deliveryAddrJson	res	String	否	配送地址JSON*/
    private String deliveryAddrJson;
    /**receiver	res	String	否	收货人，isDelivery=1时必须*/
    private String receiver;
    /**receiverPhone	res	String	否	收货人电话，isDelivery=1时必须*/
    private String receiverPhone;
    /**payChannel	req	String	否	支付渠道（上海医保必传） 当为随申办渠道时，客开需发起医保结算。*/
    private String payChannel;
    /**patientName	req	String	否	患者姓名（上海医保必传）*/
    private String patientName;
    /***/

}
