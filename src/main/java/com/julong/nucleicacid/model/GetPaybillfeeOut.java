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

public class GetPaybillfeeOut {

    /**resultCode	res	String	是	处理结果代码：0-成功*/
    private String resultCode;
    /**resultDesc	res	String	否	处理结果描述*/
    private String resultDesc;
    /**payAmout	res	String	是	自费金额(单位：分)*/
    private String payAmout;
    /**recPayAmout	res	String	是	统筹金额(单位：分)*/
    private String recPayAmout;
    /**totalPayAmout	res	String	是	总金额(单位：分)*/
    private String totalPayAmout;
    /**prescriptionIds	res	String	是	处方号，多个处方号用半角逗号分隔*/
    private String prescriptionIds;
    /**remark	res	String	否	备注信息*/
    private String remark;
    /**medicareSettleLogId	res	String	否	医保预结算参数 若使用线上医保结算，参数格式必须json格式：{“serial_no”:”业务流水号”,“bill_no”:”业务单据号”}*/
    private String medicareSettleLogId;
    /**insuranType	res	String	否	参保类型代码，KID02代表少儿医保结算*/
    private String     insuranType;
    /**prescriptionContent	res	String	否	处方单详细内容，具体格式以当地人社局系统要求为准 线上医保结算时，必须传入。包含<![CDATA[]]>标签。当该透传体不为空时，平台会调用medicare.getOnlineMedicareSettle接口，重新构造透传体*/
    private String prescriptionContent;
    /**isDecoction	res	String	否	是否代煎， 1表示需要 0或者空不需要*/
    private String isDecoction;
    /**isDelivery	res	String	否	是否需要配送 1表示需要 0或者空不需要*/
    private String isDelivery;
    /**isInformedConsent	res	String	否	是否有知情同意书需要确认 1表示需要 0或者空不需要*/
    private String isInformedConsent;
    /**isMedicinalDetail	res	String	否	是否查看药品明细 （1有，0 无）*/
    private String isMedicinalDetail;
    /**citizenCardAmount 	res	String	否	市民卡金额(单位：分)*/
    private String citizenCardAmount ;
    /**citizenCardAmountName	res	String	否	市民卡金额显示名称,可自定义为其他名称*/
    private String citizenCardAmountName;
    /**hospitalCardAmount	res	String	否	院内卡金额(单位：分)*/
    private String hospitalCardAmount;
    /**hospitalCardAmountName	res	String	否	院内卡金额显示名称,可自定义为其他名称*/
    private String hospitalCardAmountName;
    /**feeInfo	res	List<feeInfo>	否	费用分类信息*/
    private List<GetPaybillfeeOutSet> feeInfo;

}
