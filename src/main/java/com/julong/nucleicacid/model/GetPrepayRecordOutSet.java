package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @className: GetItemOutSet
 * @date: 2022/1/10 15:23
 */
@Data

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "recordInfo")
public class GetPrepayRecordOutSet {
   /**payTime	recordInfo	Stirng	是	交费日期*/
   private String payTime;
   /**payAmout	recordInfo	Stirng	是	交费金额（单位分）*/
   private String payAmout;
   /**payMode	recordInfo	String	是	支付方式：（在服务平台微信公众号缴费记录列表是直接显示本字段内容）*/
   private String payMode;
   /**payFlag	recordInfo	Stirng	是	交款状态 正常/已清/已注销*/
   private String payFlag;
   /**remark	recordInfo	String	否	备注*/
   private String remark;
   /**orderId	recordInfo	String	否	订单号（住院预交金缴费记录项订单号生成二维码时必填）*/
   private String orderId;


}
