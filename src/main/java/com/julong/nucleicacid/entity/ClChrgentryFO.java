package com.julong.nucleicacid.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName("AB_CL_DATA_CHARGEENTRY")
public class ClChrgentryFO implements Serializable{
	
	public ClChrgentryFO() {
		isrefundment =  "0" ;
		totalsum = new BigDecimal(  0)  ;
		acctsum =  new BigDecimal(  0) ; 
		sbsum =  new BigDecimal(  0) ;
		spsum =  new BigDecimal(  0) ;
		isupload =  "0" ;
		istransserv =  "0" ;

	}
	/**
	*AB_CL_DATA_CHARGEENTRY.ENTRYID type:NUMBER len:22 scale:0
	*/
	
	@TableId("ENTRYID" )
		private  Long entryid ;

	/**
	*AB_CL_DATA_CHARGEENTRY.CHARGEID type:NUMBER len:22 scale:0
	*/

	@TableField("CHARGEID" ) 
	private  Long chargeid ;

	/**
	*AB_CL_DATA_CHARGEENTRY.ISREFUNDMENT type:CHAR len:1
	*/

	@TableField("ISREFUNDMENT" ) 
	private  String isrefundment ;

	/**
	*AB_CL_DATA_CHARGEENTRY.CATAID type:NUMBER len:22 scale:0
	*/

	@TableField("CATAID" ) 
	private  Long cataid ;

	/**
	*AB_CL_DATA_CHARGEENTRY.DISCOUNTRATE type:NUMBER len:22 scale:4
	*/

	@TableField("DISCOUNTRATE" ) 
	private  BigDecimal discountrate ;

	/**
	*AB_CL_DATA_CHARGEENTRY.DEPTID type:NUMBER len:22 scale:0
	*/

	@TableField("DEPTID" ) 
	private  Long deptid ;

	/**
	*AB_CL_DATA_CHARGEENTRY.DOCID type:NUMBER len:22 scale:0
	*/

	@TableField("DOCID" ) 
	private  Long docid ;

	/**
	*AB_CL_DATA_CHARGEENTRY.TOTALSUM type:NUMBER len:22 scale:2
	*/

	@TableField("TOTALSUM" ) 
	private  BigDecimal totalsum ;

	/**
	*AB_CL_DATA_CHARGEENTRY.ACCTSUM type:NUMBER len:22 scale:2
	*/

	@TableField("ACCTSUM" ) 
	private  BigDecimal acctsum ;

	/**
	*AB_CL_DATA_CHARGEENTRY.SBSUM type:NUMBER len:22 scale:2
	*/

	@TableField("SBSUM" ) 
	private  BigDecimal sbsum ;

	/**
	*AB_CL_DATA_CHARGEENTRY.DISCOUNTSUM type:NUMBER len:22 scale:2
	*/

	@TableField("DISCOUNTSUM" ) 
	private  BigDecimal discountsum ;

	/**
	*AB_CL_DATA_CHARGEENTRY.SPSUM type:NUMBER len:22 scale:2
	*/

	@TableField("SPSUM" ) 
	private  BigDecimal spsum ;

	/**
	*AB_CL_DATA_CHARGEENTRY.ISUPLOAD type:CHAR len:1
	*/

	@TableField("ISUPLOAD" ) 
	private  String isupload ;

	/**
	*AB_CL_DATA_CHARGEENTRY.ISTRANSSERV type:CHAR len:1
	*/

	@TableField("ISTRANSSERV" ) 
	private  String istransserv ;

	@TableField("IMMTOTALSUM" ) 
	private  BigDecimal immtotalsum ;

	@TableField("INPUTTIME" ) 
	private Date inputtime ;

	    

	
}