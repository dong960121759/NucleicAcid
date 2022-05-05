package com.julong.nucleicacid.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
@TableName("SC_DATA_APPOINTMENTREQ")
public class AppointmentReqFO extends Model<AppointmentReqFO>  implements Serializable{


	/**
	*SC_DATA_APPOINTMENTREQ.OID type:NUMBER len:22 scale:0
	*/
	@TableId("OID")
	private  Long oid ;


	/**
	*SC_DATA_APPOINTMENTREQ.PATIENTID type:NUMBER len:22 scale:0
	*/

	@TableField("PATIENTID") 
	private  Long patientid ;


	/**
	*SC_DATA_APPOINTMENTREQ.ENCOUNTERID type:NUMBER len:22 scale:0
	*/

	@TableField("ENCOUNTERID") 
	private  Long encounterid ;


	/**
	*SC_DATA_APPOINTMENTREQ.ENCOUNTERTYPE type:NUMBER len:22 scale:0
	*/

	@TableField("ENCOUNTERTYPE") 
	private  Long encountertype ;


	/**
	*SC_DATA_APPOINTMENTREQ.NAME type:VARCHAR2 len:50
	*/

	@TableField("NAME" ) 
	private  String name ;


	/**
	*SC_DATA_APPOINTMENTREQ.SEX type:NUMBER len:22 scale:0
	*/

	@TableField("SEX" ) 
	private  Long sex ;


	/**
	*SC_DATA_APPOINTMENTREQ.AGE type:VARCHAR2 len:10
	*/

	@TableField("AGE" ) 
	private  String age ;


	/**
	*SC_DATA_APPOINTMENTREQ.BOOKSTATUS type:NUMBER len:22 scale:0
	*/

	@TableField("BOOKSTATUS") 
	private  Long bookstatus ;


	/**
	*SC_DATA_APPOINTMENTREQ.BOOKDEPT type:NUMBER len:22 scale:0
	*/

	@TableField("BOOKDEPT") 
	private  Long bookdept ;


	/**
	*SC_DATA_APPOINTMENTREQ.SERVICEDEPT type:NUMBER len:22 scale:0
	*/

	@TableField("SERVICEDEPT") 
	private  Long servicedept ;


	/**
	*SC_DATA_APPOINTMENTREQ.DEVICETYPE type:NUMBER len:22 scale:0
	*/

	@TableField("DEVICETYPE" ) 
	private  Long devicetype ;


	/**
	*SC_DATA_APPOINTMENTREQ.INPUTOPER type:NUMBER len:22 scale:0
	*/

	@TableField("INPUTOPER") 
	private  Long inputoper ;


	/**
	*SC_DATA_APPOINTMENTREQ.INPUTTIME type:DATE len:7
	*/

	@TableField("INPUTTIME" ) 
	private  Date inputtime ;


	/**
	*SC_DATA_APPOINTMENTREQ.ISDELETE type:CHAR len:1
	*/

	@TableField("ISDELETE" ) 
	private  String isdelete ;


	/**
	*SC_DATA_APPOINTMENTREQ.VERSIONID type:TIMESTAMP(6) len:11
	*/

	@TableField("VERSIONID" ) 
	private  Date versionid ;


	/**
	*SC_DATA_APPOINTMENTREQ.NOTE1 type:VARCHAR2 len:500
	*/

	@TableField("NOTE1" ) 
	private  String note1 ;


	/**
	*SC_DATA_APPOINTMENTREQ.NOTE2 type:VARCHAR2 len:500
	*/

	@TableField("NOTE2" ) 
	private  String note2 ;


	/**
	*SC_DATA_APPOINTMENTREQ.NOTE3 type:VARCHAR2 len:500
	*/

	@TableField("NOTE3" ) 
	private  String note3 ;


	/**
	*SC_DATA_APPOINTMENTREQ.DIAGNOSE type:VARCHAR2 len:500
	*/

	@TableField("DIAGNOSE" ) 
	private  String diagnose ;


	/**
	*SC_DATA_APPOINTMENTREQ.DIAGNOSEICD type:VARCHAR2 len:500
	*/

	@TableField("DIAGNOSEICD" ) 
	private  String diagnoseicd ;


	/**
	*SC_DATA_APPOINTMENTREQ.HCNO type:VARCHAR2 len:20
	*/

	@TableField("HCNO" ) 
	private  String hcno ;


	/**
	*SC_DATA_APPOINTMENTREQ.ADDONID type:NUMBER len:22 scale:0
	*/

	@TableField("ADDONID" ) 
	private  Long addonid ;


	/**
	*SC_DATA_APPOINTMENTREQ.IPNO type:VARCHAR2 len:20
	*/

	@TableField("IPNO" ) 
	private  String ipno ;


	/**
	*SC_DATA_APPOINTMENTREQ.BEDID type:NUMBER len:22 scale:0
	*/

	@TableField("BEDID" ) 
	private  Long bedid ;


	/**
	*SC_DATA_APPOINTMENTREQ.NOTE type:VARCHAR2 len:200
	*/

	@TableField("NOTE" ) 
	private  String note ;


	/**
	*SC_DATA_APPOINTMENTREQ.ARRIVETIME type:DATE len:7
	*/

	@TableField("ARRIVETIME" )
	private  Date arrivetime ;


	/**
	*SC_DATA_APPOINTMENTREQ.ARRIVEOPER type:NUMBER len:22 scale:0
	*/

	@TableField("ARRIVEOPER" ) 
	private  Long arriveoper ;


	/**
	*SC_DATA_APPOINTMENTREQ.EXECUTETIME type:DATE len:7
	*/

	@TableField("EXECUTETIME" ) 
	private  Date executetime ;


	/**
	*SC_DATA_APPOINTMENTREQ.EXECUTEOPER type:NUMBER len:22 scale:0
	*/

	@TableField("EXECUTEOPER" ) 
	private  Long executeoper ;


	/**
	*SC_DATA_APPOINTMENTREQ.CHILDID type:NUMBER len:22 scale:0
	*/

	@TableField("CHILDID" ) 
	private  Long childid ;


	/**
	*SC_DATA_APPOINTMENTREQ.ISURGENT type:CHAR len:1
	*/

	@TableField("ISURGENT" ) 
	private  String isurgent ;



}
