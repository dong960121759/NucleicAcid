package com.julong.nucleicacid.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("SC_DATA_APPOINTMENT")
public class AppointmentFO implements Serializable {
	public AppointmentFO(){
 
		 
	}
	 
	/**
	*SC_DATA_APPOINTMENT.BOOKID type:NUMBER len:22 scale:0
	*/
	@TableId("BOOKID")
			 
	private  Long bookid ;

	/**
	*SC_DATA_APPOINTMENT.PATIENTID type:NUMBER len:22 scale:0
	*/

	@TableField("PATIENTID") 
	private  Long patientid ;

	/**
	*SC_DATA_APPOINTMENT.ENCOUNTERID type:NUMBER len:22 scale:0
	*/

	@TableField("ENCOUNTERID" ) 
	private  Long encounterid ;

	/**
	*SC_DATA_APPOINTMENT.ENCOUNTERTYPE type:NUMBER len:22 scale:0
	*/

	@TableField("ENCOUNTERTYPE" ) 
	private  Long encountertype ;

	/**
	*SC_DATA_APPOINTMENT.NAME type:VARCHAR2 len:50
	*/

	@TableField("NAME") 
	private  String name ;

	/**
	*SC_DATA_APPOINTMENT.SEX type:NUMBER len:22 scale:0
	*/

	@TableField("SEX") 
	private  Long sex ;

	/**
	*SC_DATA_APPOINTMENT.AGE type:VARCHAR2 len:10
	*/

	@TableField("AGE" ) 
	private  String age ;

	/**
	*SC_DATA_APPOINTMENT.PATIENTDEPT type:NUMBER len:22 scale:0
	*/

	@TableField("PATIENTDEPT" ) 
	private  Long patientdept ;

	/**
	*SC_DATA_APPOINTMENT.BOOKDEPT type:NUMBER len:22 scale:0
	*/

	@TableField("BOOKDEPT" ) 
	private  Long bookdept ;

	/**
	*SC_DATA_APPOINTMENT.BOOKWAY type:NUMBER len:22 scale:0
	*/

	@TableField("BOOKWAY" ) 
	private  Long bookway ;

	/**
	*SC_DATA_APPOINTMENT.SERVICEDEPT type:NUMBER len:22 scale:0
	*/

	@TableField("SERVICEDEPT" ) 
	private  Long servicedept ;

	/**
	*SC_DATA_APPOINTMENT.RESOURCEID type:NUMBER len:22 scale:0
	*/

	@TableField("RESOURCEID" ) 
	private  Long resourceid ;

	/**
	*SC_DATA_APPOINTMENT.SERVICEID type:NUMBER len:22 scale:0
	*/

	@TableField("SERVICEID") 
	private  Long serviceid ;

	/**
	*SC_DATA_APPOINTMENT.SCHEDULEID type:NUMBER len:22 scale:0
	*/

	@TableField("SCHEDULEID" ) 
	private  Long scheduleid ;

	/**
	*SC_DATA_APPOINTMENT.SCHEDULETIME type:DATE len:7
	*/

	@TableField("SCHEDULETIME" ) 
	private  Date scheduletime ;

	/**
	*SC_DATA_APPOINTMENT.BOOKSTATUS type:NUMBER len:22 scale:0
	*/

	@TableField("BOOKSTATUS") 
	private  Long bookstatus ;

	/**
	*SC_DATA_APPOINTMENT.ISGENERATEORDER type:CHAR len:1
	*/

	@TableField("ISGENERATEORDER") 
	private  String isgenerateorder ;

	/**
	*SC_DATA_APPOINTMENT.ORDERID type:NUMBER len:22 scale:0
	*/

	@TableField("ORDERID" ) 
	private  Long orderid ;

	/**
	*SC_DATA_APPOINTMENT.ISADHOC type:CHAR len:1
	*/

	@TableField("ISADHOC") 
	private  String isadhoc ;

	/**
	*SC_DATA_APPOINTMENT.ADHOCTIME type:DATE len:7
	*/

	@TableField("ADHOCTIME" ) 
	private  Date adhoctime ;

	/**
	*SC_DATA_APPOINTMENT.ARRIVETIME type:DATE len:7
	*/

	@TableField("ARRIVETIME" ) 
	private  Date arrivetime ;

	/**
	*SC_DATA_APPOINTMENT.DOCTORID type:NUMBER len:22 scale:0
	*/

	@TableField("DOCTORID" ) 
	private  Long doctorid ;

	/**
	*SC_DATA_APPOINTMENT.RESULTID type:NUMBER len:22 scale:0
	*/

	@TableField("RESULTID" ) 
	private  Long resultid ;

	/**
	*SC_DATA_APPOINTMENT.INPUTOPER type:NUMBER len:22 scale:0
	*/

	@TableField("INPUTOPER") 
	private  Long inputoper ;

	/**
	*SC_DATA_APPOINTMENT.INPUTTIME type:DATE len:7
	*/

	@TableField("INPUTTIME") 
	private  Date inputtime ;

	/**
	*SC_DATA_APPOINTMENT.TRANSID type:NUMBER len:22 scale:0
	*/

	@TableField("TRANSID" ) 
	private  Long transid ;

	/**
	*SC_DATA_APPOINTMENT.TRANSOPER type:NUMBER len:22 scale:0
	*/

	@TableField("TRANSOPER" ) 
	private  Long transoper ;

	/**
	*SC_DATA_APPOINTMENT.TRANSTIME type:DATE len:7
	*/

	@TableField("TRANSTIME" ) 
	private  Date transtime ;

	/**
	*SC_DATA_APPOINTMENT.BLOCKDATE type:DATE len:7
	*/

	@TableField("BLOCKDATE" ) 
	private  Date blockdate ;

	/**
	*SC_DATA_APPOINTMENT.BLOCKREASON type:NUMBER len:22 scale:0
	*/

	@TableField("BLOCKREASON" ) 
	private  Long blockreason ;

	/**
	*SC_DATA_APPOINTMENT.BLOCKOPER type:NUMBER len:22 scale:0
	*/

	@TableField("BLOCKOPER" ) 
	private  Long blockoper ;

	/**
	*SC_DATA_APPOINTMENT.BLOCKTIME type:DATE len:7
	*/

	@TableField("BLOCKTIME" ) 
	private  Date blocktime ;

	/**
	*SC_DATA_APPOINTMENT.UNBLOCKDATE type:DATE len:7
	*/

	@TableField("UNBLOCKDATE" ) 
	private  Date unblockdate ;

	/**
	*SC_DATA_APPOINTMENT.UNBLOCKOPER type:NUMBER len:22 scale:0
	*/

	@TableField("UNBLOCKOPER" ) 
	private  Long unblockoper ;

	/**
	*SC_DATA_APPOINTMENT.UNBLOCKTIME type:DATE len:7
	*/

	@TableField("UNBLOCKTIME" ) 
	private  Date unblocktime ;

	/**
	*SC_DATA_APPOINTMENT.CANCELREASON type:NUMBER len:22 scale:0
	*/

	@TableField("CANCELREASON" ) 
	private  Long cancelreason ;

	/**
	*SC_DATA_APPOINTMENT.CANCELOPER type:NUMBER len:22 scale:0
	*/

	@TableField("CANCELOPER" ) 
	private  Long canceloper ;

	/**
	*SC_DATA_APPOINTMENT.CANCELTIME type:DATE len:7
	*/

	@TableField("CANCELTIME" ) 
	private  Date canceltime ;

	/**
	*SC_DATA_APPOINTMENT.VERSIONID type:TIMESTAMP(6) len:11
	*/

	@TableField("VERSIONID" ) 
	private  Date versionid ;

	/**
	*SC_DATA_APPOINTMENT.PACSITEMID type:NUMBER len:22 scale:0
	*/

	@TableField("PACSITEMID" ) 
	private  Long pacsitemid ;

	/**
	*SC_DATA_APPOINTMENT.NOTE1 type:VARCHAR2 len:100
	*/

	@TableField("NOTE1" ) 
	private  String note1 ;

	/**
	*SC_DATA_APPOINTMENT.NOTE2 type:VARCHAR2 len:100
	*/

	@TableField("NOTE2" ) 
	private  String note2 ;

	/**
	*SC_DATA_APPOINTMENT.REQUISITIONID type:NUMBER len:22 scale:0
	*/

	@TableField("REQUISITIONID" ) 
	private  Long requisitionid ;

	/**
	*SC_DATA_APPOINTMENT.BODYPART type:NUMBER len:22 scale:0
	*/

	@TableField("BODYPART" ) 
	private  Long bodypart ;

	/**
	*SC_DATA_APPOINTMENT.BODYPOSITION type:NUMBER len:22 scale:0
	*/

	@TableField("BODYPOSITION" ) 
	private  Long bodyposition ;

	/**
	*SC_DATA_APPOINTMENT.ISBEDSIDE type:CHAR len:1
	*/

	@TableField("ISBEDSIDE" ) 
	private  String isbedside ;

	/**
	*SC_DATA_APPOINTMENT.ISURGENT type:CHAR len:1
	*/

	@TableField("ISURGENT" ) 
	private  String isurgent ;

	/**
	*SC_DATA_APPOINTMENT.CHILDID type:NUMBER len:22 scale:0
	*/

	@TableField("CHILDID" ) 
	private  Long childid ;


}