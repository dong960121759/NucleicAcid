package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @className: GetItemOut
 * @date: 2022/1/10 17:06
 */
@Data
@XmlRootElement(name = "res")
public class GetDailyBillOut {

    /**resultCode	res	String	是	处理结果代码：0-成功 -1 失败*/
    private String resultCode;
    /**resultDesc	res	String	否	处理结果描述*/
    private String resultDesc;
    /**totalAmout	res	String	是	住院总费用（单位分）*/
    private String totalAmout;
    /**prepayAmout	res	Stirng	是	预交金额（单位分）*/
    private String prepayAmout;
    /**unsettled	res	Stirng	是	未结算总额（单位分）*/
    private String unsettled;
    /**balance	res	Stirng	是	截止至上一日结存余额（单位分，正数为欠费，负数为结余）*/
    private String balance;
    /**settled	res	Stirng	是	已结算总额（单位分）*/
    private String settled;
    /**billAmout	res	Stirng	是	本清单费用合计（单位分）*/
    private String billAmout;
    /**startMxseq	res	Stirng	否	费用明细开始序列*/
    private String startMxseq;
    /**endMxseq	res	Stirng	否	费用明细结束序列*/
    private String endMxseq;
    /**remark	res	String	否	备注*/
    private String remark;
    /**feeInfo	res	List<feeInfo>	否	明细项目记录*/
    private List<GetDailyBillOutSet> feeInfo;

}
