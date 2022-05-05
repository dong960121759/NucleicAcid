package com.julong.nucleicacid.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName("AB_CL_DATA_CHARGE")
public class ClChargeFO extends Model<ClChargeFO> implements Serializable {
	public ClChargeFO(){
		chargetype = 1L ;
		isrefundment =  "0" ;
		totalsum =  new BigDecimal(0) ;
		acctsum =  new BigDecimal(0) ;
		sbsum =  new BigDecimal(0) ;
		spsum =  new BigDecimal(0) ;
		discountsum = new BigDecimal(0) ;
		isbalance = "0" ;
		isdelete = "0" ;
		isupload =  "0" ;
		isberefunded =  "0" ;
		istransserv =  "0" ;

		 
	}
	

	@TableId("CHARGEID" )
	private  Long chargeid ;

	/**
	*AB_CL_DATA_CHARGE.CHARGETYPE type:NUMBER len:22 scale:0
	*/

	@TableField("CHARGETYPE" ) 
	private  Long chargetype ;

	/**
	*AB_CL_DATA_CHARGE.PAYORID type:NUMBER len:22 scale:0
	*/

	@TableField("PAYORID" ) 
	private  Long payorid ;

	/**
	*AB_CL_DATA_CHARGE.PLANID type:NUMBER len:22 scale:0
	*/

	@TableField("PLANID" ) 
	private  Long planid ;

	/**
	*AB_CL_DATA_CHARGE.MCNO type:VARCHAR2 len:20
	*/

	@TableField("MCNO" ) 
	private  String mcno ;

	/**
	*AB_CL_DATA_CHARGE.SINO type:VARCHAR2 len:20
	*/

	@TableField("SINO" ) 
	private  String sino ;

	/**
	*AB_CL_DATA_CHARGE.ISREFUNDMENT type:CHAR len:1
	*/

	@TableField("ISREFUNDMENT" ) 
	private  String isrefundment ;

	/**
	*AB_CL_DATA_CHARGE.CHARGEOPER type:NUMBER len:22 scale:0
	*/

	@TableField("CHARGEOPER" ) 
	private  Long chargeoper ;

	/**
	*AB_CL_DATA_CHARGE.CHARGETIME type:DATE len:7
	*/

	@TableField("CHARGETIME" ) 
	private  Date chargetime ;

	/**
	*AB_CL_DATA_CHARGE.TOTALSUM type:NUMBER len:22 scale:2
	*/

	@TableField("TOTALSUM" ) 
	private  BigDecimal totalsum ;

	/**
	*AB_CL_DATA_CHARGE.ACCTSUM type:NUMBER len:22 scale:2
	*/

	@TableField("ACCTSUM" ) 
	private  BigDecimal acctsum ;

	/**
	*AB_CL_DATA_CHARGE.SBSUM type:NUMBER len:22 scale:2
	*/

	@TableField("SBSUM" ) 
	private  BigDecimal sbsum ;

	/**
	*AB_CL_DATA_CHARGE.DISCOUNTSUM type:NUMBER len:22 scale:2
	*/

	@TableField("DISCOUNTSUM" ) 
	private  BigDecimal discountsum ;

	/**
	*AB_CL_DATA_CHARGE.SPSUM type:NUMBER len:22 scale:2
	*/

	@TableField("SPSUM" ) 
	private  BigDecimal spsum ;

	/**
	*AB_CL_DATA_CHARGE.ISBALANCE type:CHAR len:1
	*/

	@TableField("ISBALANCE" ) 
	private  String isbalance ;

	/**
	*AB_CL_DATA_CHARGE.BALANCEID type:NUMBER len:22 scale:0
	*/

	@TableField("BALANCEID" ) 
	private  Long balanceid ;

	/**
	*AB_CL_DATA_CHARGE.ISDELETE type:CHAR len:1
	*/

	@TableField("ISDELETE" ) 
	private  String isdelete ;

	/**
	*AB_CL_DATA_CHARGE.ISUPLOAD type:CHAR len:1
	*/

	@TableField("ISUPLOAD" ) 
	private  String isupload ;

	/**
	*AB_CL_DATA_CHARGE.HCNO type:VARCHAR2 len:20
	*/

	@TableField("HCNO" ) 
	private  String hcno ;

	/**
	*AB_CL_DATA_CHARGE.ISBEREFUNDED type:CHAR len:1
	*/

	@TableField("ISBEREFUNDED" ) 
	private  String isberefunded ;

	/**
	*AB_CL_DATA_CHARGE.ENCOUNTERSB type:VARCHAR2 len:30
	*/

	@TableField("ENCOUNTERSB" ) 
	private  String encountersb ;

	/**
	*AB_CL_DATA_CHARGE.ISTRANSSERV type:CHAR len:1
	*/

	@TableField("ISTRANSSERV" ) 
	private  String istransserv ;


}