package com.julong.nucleicacid.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName("AB_CL_DATA_INVOICE")
public class ClInvoiceFO implements Serializable{ 
	
	/**
	*AB_CL_DATA_INVOICE.INVOICEID type:NUMBER len:22 scale:0
	*/
	@TableId("INVOICEID" )
	private  Long invoiceid ;

	/**
	*AB_CL_DATA_INVOICE.INVOICETYPE type:NUMBER len:22 scale:0
	*/

	@TableField("INVOICETYPE" ) 
	private  Long invoicetype ;

	/**
	*AB_CL_DATA_INVOICE.INVOICENO type:VARCHAR2 len:30
	*/

	@TableField("INVOICENO" ) 
	private  String invoiceno ;

	/**
	*AB_CL_DATA_INVOICE.CHARGEID type:NUMBER len:22 scale:0
	*/

	@TableField("CHARGEID" ) 
	private  Long chargeid ;

	/**
	*AB_CL_DATA_INVOICE.CHARGETIME type:DATE len:7
	*/

	@TableField("CHARGETIME" ) 
	private  Date chargetime ;

	/**
	*AB_CL_DATA_INVOICE.INVOICETIME type:DATE len:7
	*/

	@TableField("INVOICETIME" ) 
	private  Date invoicetime ;

	/**
	*AB_CL_DATA_INVOICE.NAME type:VARCHAR2 len:50
	*/

	@TableField("NAME" ) 
	private  String name ;

	/**
	*AB_CL_DATA_INVOICE.PAYORID type:NUMBER len:22 scale:0
	*/

	@TableField("PAYORID" ) 
	private  Long payorid ;

	/**
	*AB_CL_DATA_INVOICE.PLANID type:NUMBER len:22 scale:0
	*/

	@TableField("PLANID" ) 
	private  Long planid ;

	/**
	*AB_CL_DATA_INVOICE.ISSPECIAL type:CHAR len:1
	*/

	@TableField("ISSPECIAL" ) 
	private  String isspecial ;

	/**
	*AB_CL_DATA_INVOICE.CHARGEOPER type:NUMBER len:22 scale:0
	*/

	@TableField("CHARGEOPER" ) 
	private  Long chargeoper ;

	/**
	*AB_CL_DATA_INVOICE.INVOICESTATUS type:NUMBER len:22 scale:0
	*/

	@TableField("INVOICESTATUS" ) 
	private  Long invoicestatus ;

	/**
	*AB_CL_DATA_INVOICE.CANCELTIME type:DATE len:7
	*/

	@TableField("CANCELTIME" ) 
	private  Date canceltime ;

	/**
	*AB_CL_DATA_INVOICE.CANCELOPER type:NUMBER len:22 scale:0
	*/

	@TableField("CANCELOPER" ) 
	private  Long canceloper ;

	/**
	*AB_CL_DATA_INVOICE.REFUNDMENTTIME type:DATE len:7
	*/

	@TableField("REFUNDMENTTIME" ) 
	private  Date refundmenttime ;

	/**
	*AB_CL_DATA_INVOICE.REFUNDMENTOPER type:NUMBER len:22 scale:0
	*/

	@TableField("REFUNDMENTOPER" ) 
	private  Long refundmentoper ;

	/**
	*AB_CL_DATA_INVOICE.ACCTSUM type:NUMBER len:22 scale:2
	*/

	@TableField("ACCTSUM" ) 
	private  BigDecimal acctsum ;

	/**
	*AB_CL_DATA_INVOICE.SBSUM type:NUMBER len:22 scale:2
	*/

	@TableField("SBSUM" ) 
	private  BigDecimal sbsum ;

	/**
	*AB_CL_DATA_INVOICE.SPSUM type:NUMBER len:22 scale:2
	*/

	@TableField("SPSUM" ) 
	private  BigDecimal spsum ;

	/**
	*AB_CL_DATA_INVOICE.ISUPLOAD type:CHAR len:1
	*/

	@TableField("ISUPLOAD" ) 
	private  String isupload ;

	/**
	*AB_CL_DATA_INVOICE.ISTRANSSERV type:CHAR len:1
	*/

	@TableField("ISTRANSSERV" ) 
	private  String istransserv ;

	public Long getInvoiceid() {
		return invoiceid;
	}

	public void setInvoiceid(Long invoiceid) {
		this.invoiceid = invoiceid;
	}

	public Long getInvoicetype() {
		return invoicetype;
	}

	public void setInvoicetype(Long invoicetype) {
		this.invoicetype = invoicetype;
	}

	public String getInvoiceno() {
		return invoiceno;
	}

	public void setInvoiceno(String invoiceno) {
		this.invoiceno = invoiceno;
	}

	public Long getChargeid() {
		return chargeid;
	}

	public void setChargeid(Long chargeid) {
		this.chargeid = chargeid;
	}

	 
	 
 
 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPayorid() {
		return payorid;
	}

	public void setPayorid(Long payorid) {
		this.payorid = payorid;
	}

	public Long getPlanid() {
		return planid;
	}

	public void setPlanid(Long planid) {
		this.planid = planid;
	}

	public String getIsspecial() {
		return isspecial;
	}

	public void setIsspecial(String isspecial) {
		this.isspecial = isspecial;
	}

	public Long getChargeoper() {
		return chargeoper;
	}

	public void setChargeoper(Long chargeoper) {
		this.chargeoper = chargeoper;
	}

	public Long getInvoicestatus() {
		return invoicestatus;
	}

	public void setInvoicestatus(Long invoicestatus) {
		this.invoicestatus = invoicestatus;
	}

	 
 
	public Long getCanceloper() {
		return canceloper;
	}

	public void setCanceloper(Long canceloper) {
		this.canceloper = canceloper;
	}

	 

	public Long getRefundmentoper() {
		return refundmentoper;
	}

	public void setRefundmentoper(Long refundmentoper) {
		this.refundmentoper = refundmentoper;
	}

	public BigDecimal getAcctsum() {
		return acctsum;
	}

	public void setAcctsum(BigDecimal acctsum) {
		this.acctsum = acctsum;
	}

	public BigDecimal getSbsum() {
		return sbsum;
	}

	public void setSbsum(BigDecimal sbsum) {
		this.sbsum = sbsum;
	}

	public BigDecimal getSpsum() {
		return spsum;
	}

	public void setSpsum(BigDecimal spsum) {
		this.spsum = spsum;
	}

	public String getIsupload() {
		return isupload;
	}

	public void setIsupload(String isupload) {
		this.isupload = isupload;
	}

	public String getIstransserv() {
		return istransserv;
	}

	public void setIstransserv(String istransserv) {
		this.istransserv = istransserv;
	}

	public ClInvoiceFO() {
		invoicetype=1L ; 
		isspecial="0" ;  
		invoicestatus=1L ;  
		isupload="0" ;
		istransserv="0";  

	}

	public void setChargetime(Date chargetime) {
		this.chargetime = chargetime;
	}

	public void setInvoicetime(Date invoicetime) {
		this.invoicetime = invoicetime;
	}

	public void setCanceltime(Date canceltime) {
		this.canceltime = canceltime;
	}

	public void setRefundmenttime(Date refundmenttime) {
		this.refundmenttime = refundmenttime;
	}

	public Date getChargetime() {
		return chargetime;
	}

	public Date getInvoicetime() {
		return invoicetime;
	}

	public Date getCanceltime() {
		return canceltime;
	}

	public Date getRefundmenttime() {
		return refundmenttime;
	}

}