package com.julong.nucleicacid.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
@TableName( "PA_DATA_PATIENTCARD")
public class PatientCardFO extends Model<PatientCardFO>  implements Serializable{
	
	/**
	*PA_DATA_PATIENTCARD.OID type:NUMBER len:22 scale:0
	*/
	@TableId( "oid" )
	private  Long oid ;

	/**
	*PA_DATA_PATIENTCARD.PATIENTID type:NUMBER len:22 scale:0
	*/

	@TableField( "PATIENTID" ) 
	private  Long patientid ;

	/**
	*PA_DATA_PATIENTCARD.CARDTYPE type:NUMBER len:22 scale:0
	*/

	@TableField( "CARDTYPE" ) 
	private  Long cardtype ;

	/**
	*PA_DATA_PATIENTCARD.CARDNO type:VARCHAR2 len:20
	*/

	@TableField( "CARDNO" ) 
	private  String cardno ;

	/**
	*PA_DATA_PATIENTCARD.INPUTOPER type:NUMBER len:22 scale:0
	*/

	@TableField( "INPUTOPER" ) 
	private  Long inputoper ;

	/**
	*PA_DATA_PATIENTCARD.INPUTTIME type:DATE len:7
	*/

	@TableField( "INPUTTIME" ) 
	private  Date inputtime ;

	/**
	*PA_DATA_PATIENTCARD.ISDELETE type:VARCHAR2 len:1
	*/

	@TableField( "ISDELETE" ) 
	private  String isdelete ;

	/**
	*PA_DATA_PATIENTCARD.DELOPER type:NUMBER len:22 scale:0
	*/

	@TableField( "DELOPER" ) 
	private  Long deloper ;

	/**
	*PA_DATA_PATIENTCARD.DELTIME type:DATE len:7
	*/

	@TableField( "DELTIME" ) 
	private  Date deltime ;

	/**
	*PA_DATA_PATIENTCARD.ISTRANSSERV type:CHAR len:1
	*/

	@TableField( "ISTRANSSERV" ) 
	private  String istransserv ;

	public PatientCardFO() {

		 isdelete = "0";
		 cardtype = 1L;
	}


}