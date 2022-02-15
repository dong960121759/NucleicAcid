package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.List;

/**
 * @className: GetItemOut
 * @date: 2022/1/10 17:06
 */
@Data
@XmlRootElement(name = "res")
@XmlSeeAlso({GetItemOutSet.class})
public class GetCompletedPayDetailInfoOut{

    /**resultCode	res	String	是	处理结果代码：0-成功*/
    private String resultCode;
    /**resultDesc	res	String	否	处理结果描述*/
    private String resultDesc;
    /**isMedicinalDetail	res	String	否	是否查看药品明细 （1有，0 无）*/
    private String isMedicinalDetail;
    /**prescriptionId	res	String	否	处方号 （用于查看发药信息必填）多个分方则以英文逗号拼接*/
    private String prescriptionId;
    /**invoiceNo	res	String	否	虚拟发票号*/
    private String invoiceNo;
    /**payType	res	String	否	付款方式*/
    private String payType;
    /**machineNo	res	String	否	终端编号*/
    private String machineNo;
    /**tradeDate	res	String	否	交易时间*/
    private String tradeDate;
    /**tradeNo	res	String	否	交易平台流水号*/
    private String tradeNo;
    /**invoiceUrl	res	String	否	电子票据地址url(此地址非空时将不允许退费)*/
    private String invoiceUrl;
    /**orderDetailInfo	res	List<orderDetailInfo>	否	缴费订单明细集合*/
    private List<GetCompletedPayDetailInfoOutSet> orderDetailInfo;
    /***/
}
