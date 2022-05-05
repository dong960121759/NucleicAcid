package com.julong.nucleicacid.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@TableName("HC_MOBILEPAYMENT")
public class HcMobilePaymentFO extends Model<HcMobilePaymentFO> implements Serializable {

	@TableId("CHRGNO")
	private String chrgNo;

	/**
	 *结算类型  1门诊收费  2押金收费  3挂号收费  11门诊退款  31挂号退款
	 */

	@TableId("TYPE")
	private String type;

	/**
	 *诊疗卡类型
	 */
	@TableField("PATCARDTYPE")
	private String patCardType;

	/**
	 *诊疗卡号
	 */
	@TableField("PATCARDNO")
	private String patCardNo;

	/**
	 *病人姓名
	 */
	@TableField("NAME")
	private String name;

	/**
	 *医院订单号
	 */
	@TableField("HISORDNUM")
	private String hisOrdNum;

	/**
	 *平台订单号
	 */
	@TableField("PSORDNUM")
	private String psOrdNum;

	/**
	 *支付方式
	 */
	@TableField("PAYMODE")
	private String payMode;

	/**
	 *支付金额 单位：分
	 */
	@TableField("PAYAMT")
	private BigDecimal payAmt;

	/**
	 *支付机构流水号
	 */
	@TableField("AGTORDNUM")
	private String agtOrdNum;

	/**
	 *支付时间
	 */
	@TableField("PAYTIME")
	private String payTime;

	/**
	 *住院流水号
	 */
	@TableField("ADMISSIONNUM")
	private String admissionNum;

	/**
	 *平台用户ID
	 */
	@TableField("PSUSERID")
	private String psUserID;

	/**
	 *处方号
	 */
	@TableField("RECNO")
	private String recNo;

	/**
	 *处方支付金额
	 */
	@TableField("RECPAYAMT")
	private BigDecimal recPayAmt;

	/**
	 *发票号
	 */
	@TableField("INVOICENO")
	private String invoiceNo;

	/**
	 *备注
	 */
	@TableField("NOTE")
	private String note;


	public HcMobilePaymentFO() {

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chrgNo == null) ? 0 : chrgNo.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HcMobilePaymentFO other = (HcMobilePaymentFO) obj;
		if (chrgNo == null) {
			if (other.chrgNo != null)
				return false;
		} else if (!chrgNo.equals(other.chrgNo))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}
