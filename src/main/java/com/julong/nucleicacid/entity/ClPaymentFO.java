package com.julong.nucleicacid.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@TableName("AB_CL_DATA_CHARGEPAYMENT")
public class ClPaymentFO extends Model<ClPaymentFO> implements Serializable {
	

	
	public ClPaymentFO(){
		paysum =  new BigDecimal(0) ;
		refundmentsum = new BigDecimal(0) ;
		rate =  new BigDecimal(1) ;
		isdeposit = "0" ;
		isupload =  "0" ;
		istransserv =  "0" ;
	}

	
	
	/**
	*AB_CL_DATA_CHARGEPAYMENT.PAYID type:NUMBER len:22 scale:0
	*/
	@TableId("PAYID" )
	private  Long payid ;

	/**
	*AB_CL_DATA_CHARGEPAYMENT.CHARGEID type:NUMBER len:22 scale:0
	*/

	@TableField("CHARGEID" ) 
	private  Long chargeid ;


	/**
	*AB_CL_DATA_CHARGEPAYMENT.PAYMENTID type:NUMBER len:22 scale:0
	*/

	@TableField("PAYMENTID" ) 
	private  Long paymentid ;


	/**
	*AB_CL_DATA_CHARGEPAYMENT.PAYSUM type:NUMBER len:22 scale:2
	*/

	@TableField("PAYSUM" ) 
	private  BigDecimal paysum ;


	/**
	*AB_CL_DATA_CHARGEPAYMENT.REFUNDMENTSUM type:NUMBER len:22 scale:2
	*/

	@TableField("REFUNDMENTSUM" ) 
	private  BigDecimal refundmentsum ;


	/**
	*AB_CL_DATA_CHARGEPAYMENT.RATE type:NUMBER len:22 scale:4
	*/

	@TableField("RATE" ) 
	private  BigDecimal rate ;


	/**
	*AB_CL_DATA_CHARGEPAYMENT.ISDEPOSIT type:CHAR len:1
	*/

	@TableField("ISDEPOSIT" ) 
	private  String isdeposit ;


	/**
	*AB_CL_DATA_CHARGEPAYMENT.ISUPLOAD type:CHAR len:1
	*/

	@TableField("ISUPLOAD" ) 
	private  String isupload ;


	/**
	*AB_CL_DATA_CHARGEPAYMENT.CHECKNO type:VARCHAR2 len:30
	*/

	@TableField("CHECKNO" ) 
	private  String checkno ;


	/**
	*AB_CL_DATA_CHARGEPAYMENT.ISTRANSSERV type:CHAR len:1
	*/

	@TableField("ISTRANSSERV" ) 
	private  String istransserv ;


	public Long getPayid() {
		return payid;
	}


	public void setPayid(Long payid) {
		this.payid = payid;
	}


	public Long getChargeid() {
		return chargeid;
	}


	public void setChargeid(Long chargeid) {
		this.chargeid = chargeid;
	}


	public Long getPaymentid() {
		return paymentid;
	}


	public void setPaymentid(Long paymentid) {
		this.paymentid = paymentid;
	}


	public BigDecimal getPaysum() {
		return paysum;
	}


	public void setPaysum(BigDecimal paysum) {
		this.paysum = paysum;
	}


	public BigDecimal getRefundmentsum() {
		return refundmentsum;
	}


	public void setRefundmentsum(BigDecimal refundmentsum) {
		this.refundmentsum = refundmentsum;
	}


	public BigDecimal getRate() {
		return rate;
	}


	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}


	public String getIsdeposit() {
		return isdeposit;
	}


	public void setIsdeposit(String isdeposit) {
		this.isdeposit = isdeposit;
	}


	public String getIsupload() {
		return isupload;
	}


	public void setIsupload(String isupload) {
		this.isupload = isupload;
	}


	public String getCheckno() {
		return checkno;
	}


	public void setCheckno(String checkno) {
		this.checkno = checkno;
	}


	public String getIstransserv() {
		return istransserv;
	}


	public void setIstransserv(String istransserv) {
		this.istransserv = istransserv;
	}



}