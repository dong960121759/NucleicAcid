package com.julong.nucleicacid.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@TableName("AB_CL_DATA_INVOICEENTRY")
public class ClInvoentryFO implements Serializable{
	
	public ClInvoentryFO(){
		isupload =  "0" ;
		istransserv = "0" ;
	
	}
	/**
	*AB_CL_DATA_INVOICEENTRY.ENTRYID type:NUMBER len:22 scale:0
	*/

	@TableId("ENTRYID"  )
	private  Long entryid ;

	/**
	*AB_CL_DATA_INVOICEENTRY.INVOICEID type:NUMBER len:22 scale:0
	*/

	@TableField("INVOICEID"  )
	private  Long invoiceid ;

	/**
	*AB_CL_DATA_INVOICEENTRY.CATAID type:NUMBER len:22 scale:0
	*/

	@TableField("CATAID"  ) 
	private  Long cataid ;

	/**
	*AB_CL_DATA_INVOICEENTRY.AMOUNT type:NUMBER len:22 scale:2
	*/

	@TableField("AMOUNT"  ) 
	private  BigDecimal amount ;

	/**
	*AB_CL_DATA_INVOICEENTRY.IMMAMOUNT type:NUMBER len:22 scale:2
	*/

	@TableField("IMMAMOUNT"  ) 
	private  BigDecimal immamount ;
	
	/**
	*AB_CL_DATA_INVOICEENTRY.ISUPLOAD type:CHAR len:1
	*/

	@TableField("ISUPLOAD"  ) 
	private  String isupload ;

	/**
	*AB_CL_DATA_INVOICEENTRY.ISTRANSSERV type:CHAR len:1
	*/

	@TableField("ISTRANSSERV" ) 
	private  String istransserv ;

	
	
}