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
@TableName("AB_IP_DATA_DEPOSIT")
public class AbIpDepositFO extends Model<AbIpDepositFO> implements Serializable {
	
	public AbIpDepositFO() {
//		depositid =  0 ;	DEPOSITID		N
//		depositno =  0 ;	DEPOSITNO		N
//		patientid =  0 ;	PATIENTID		N
//		encounterid =  0 ;	ENCOUNTERID		N
//		paymentid =  0 ;	PAYMENTID		N
//		rate =  0 ;	RATE	'1' 	N
//		amount =  0 ;	AMOUNT		N
//		deposittime =  0 ;	DEPOSITTIME		N
//		depositoper =  0 ;	DEPOSITOPER		N
//		depositstatus =  0 ;	DEPOSITSTATUS	1 	N
//		isgernerate =  0 ;	ISGERNERATE	'0' 	N
//		isbalance =  0 ;	ISBALANCE	'0' 	N
//		isrefundbalance =  0 ;	ISREFUNDBALANCE	'0' 	N
//		versionid =  0 ;	VERSIONID		N


		
		isbalance = "0";
		isgernerate = "0";
		isrefundbalance = "0";
	}
	/**
	*AB_IP_DATA_DEPOSIT.DEPOSITID type:NUMBER len:22 scale:0
	*/
	@TableId("DEPOSITID"  )
	private  Long depositid ;


	/**
	*AB_IP_DATA_DEPOSIT.DEPOSITNO type:VARCHAR2 len:30
	*/

	@TableField("DEPOSITNO"  ) 
	private  String depositno ;


	/**
	*AB_IP_DATA_DEPOSIT.PATIENTID type:NUMBER len:22 scale:0
	*/

	@TableField("PATIENTID"  ) 
	private  Long patientid ;


	/**
	*AB_IP_DATA_DEPOSIT.ENCOUNTERID type:NUMBER len:22 scale:0
	*/

	@TableField("ENCOUNTERID"  ) 
	private  Long encounterid ;


	/**
	*AB_IP_DATA_DEPOSIT.PAYMENTID type:NUMBER len:22 scale:0
	*/

	@TableField("PAYMENTID"  ) 
	private  Long paymentid ;


	/**
	*AB_IP_DATA_DEPOSIT.RATE type:NUMBER len:22 scale:4
	*/

	@TableField("RATE"  ) 
	private  BigDecimal rate ;


	/**
	*AB_IP_DATA_DEPOSIT.AMOUNT type:NUMBER len:22 scale:2
	*/

	@TableField("AMOUNT"  ) 
	private  BigDecimal amount ;


	/**
	*AB_IP_DATA_DEPOSIT.CHECKNO type:VARCHAR2 len:30
	*/

	@TableField("CHECKNO" ) 
	private  String checkno ;


	/**
	*AB_IP_DATA_DEPOSIT.DEPOSITTIME type:DATE len:7
	*/

	@TableField("DEPOSITTIME"  ) 
	private  Date deposittime ;


	/**
	*AB_IP_DATA_DEPOSIT.DEPOSITOPER type:NUMBER len:22 scale:0
	*/

	@TableField("DEPOSITOPER"  ) 
	private  Long depositoper ;


	/**
	*AB_IP_DATA_DEPOSIT.DEPOSITLOC type:NUMBER len:22 scale:0
	*/

	@TableField("DEPOSITLOC" ) 
	private  Long depositloc ;


	/**
	*AB_IP_DATA_DEPOSIT.DEPOSITSTATUS type:NUMBER len:22 scale:0
	*/

	@TableField("DEPOSITSTATUS"  ) 
	private  Long depositstatus ;


	/**
	*AB_IP_DATA_DEPOSIT.CANCELTIME type:DATE len:7
	*/

	@TableField("CANCELTIME" ) 
	private  Date canceltime ;


	/**
	*AB_IP_DATA_DEPOSIT.CANCELOPER type:NUMBER len:22 scale:0
	*/

	@TableField("CANCELOPER" ) 
	private  Long canceloper ;


	/**
	*AB_IP_DATA_DEPOSIT.REFUNDMENTTIME type:DATE len:7
	*/

	@TableField("REFUNDMENTTIME" ) 
	private  Date refundmenttime ;


	/**
	*AB_IP_DATA_DEPOSIT.REFUNDMENTOPER type:NUMBER len:22 scale:0
	*/

	@TableField("REFUNDMENTOPER" ) 
	private  Long refundmentoper ;


	/**
	*AB_IP_DATA_DEPOSIT.CHARGETIME type:DATE len:7
	*/

	@TableField("CHARGETIME" ) 
	private  Date chargetime ;


	/**
	*AB_IP_DATA_DEPOSIT.CHARGEOPER type:NUMBER len:22 scale:0
	*/

	@TableField("CHARGEOPER" ) 
	private  Long chargeoper ;


	/**
	*AB_IP_DATA_DEPOSIT.CHARGEID type:NUMBER len:22 scale:0
	*/

	@TableField("CHARGEID" ) 
	private  Long chargeid ;


	/**
	*AB_IP_DATA_DEPOSIT.ISGERNERATE type:CHAR len:1
	*/

	@TableField("ISGERNERATE"  ) 
	private  String isgernerate ;


	/**
	*AB_IP_DATA_DEPOSIT.ISBALANCE type:CHAR len:1
	*/

	@TableField("ISBALANCE"  ) 
	private  String isbalance ;


	/**
	*AB_IP_DATA_DEPOSIT.BALANCEID type:NUMBER len:22 scale:0
	*/

	@TableField("BALANCEID" ) 
	private  Long balanceid ;


	/**
	*AB_IP_DATA_DEPOSIT.ISREFUNDBALANCE type:CHAR len:1
	*/

	@TableField("ISREFUNDBALANCE"  ) 
	private  String isrefundbalance ;


	/**
	*AB_IP_DATA_DEPOSIT.REFUNDBALANCEID type:NUMBER len:22 scale:0
	*/

	@TableField("REFUNDBALANCEID" ) 
	private  Long refundbalanceid ;


	/**
	*AB_IP_DATA_DEPOSIT.VERSIONID type:TIMESTAMP(6) len:11
	*/

	@TableField("VERSIONID"  ) 
	private  Date versionid ;


	/**
	*AB_IP_DATA_DEPOSIT.IPNO type:VARCHAR2 len:20
	*/

	@TableField("IPNO" ) 
	private  String ipno ;


	/**
	*AB_IP_DATA_DEPOSIT.NOTE type:VARCHAR2 len:50
	*/

	@TableField("NOTE" ) 
	private  String note ;


	/**
	*AB_IP_DATA_DEPOSIT.REFUNDMENTPAYMENTID type:NUMBER len:22 scale:0
	*/

	@TableField("REFUNDMENTPAYMENTID" ) 
	private  Long refundmentpaymentid ;


	/**
	*AB_IP_DATA_DEPOSIT.JKR type:VARCHAR2 len:50
	*/

	@TableField("JKR" ) 
	private  String jkr ;






}