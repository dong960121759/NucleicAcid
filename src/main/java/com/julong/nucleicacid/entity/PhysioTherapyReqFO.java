package com.julong.nucleicacid.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
@TableName("EX_DATA_PHYSIOTHERAPYREQ")
public class PhysioTherapyReqFO  extends Model<PhysioTherapyReqFO> implements Serializable{



	/**
	*EX_DATA_PHYSIOTHERAPYREQ.OID type:NUMBER len:22 scale:0
	*/
	@TableId("OID" )
	private  Long oid ;
	 

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.ENCOUNTERID type:NUMBER len:22 scale:0
	*/

	@TableField("ENCOUNTERID" ) 
	private  Long encounterid ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.ENCOUNTERTYPE type:NUMBER len:22 scale:0
	*/

	@TableField("ENCOUNTERTYPE" ) 
	private  Long encountertype ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.PATIENTID type:NUMBER len:22 scale:0
	*/

	@TableField("PATIENTID" ) 
	private  Long patientid ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.NAME type:VARCHAR2 len:20
	*/

	@TableField("NAME" ) 
	private  String name ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.SEX type:NUMBER len:22 scale:0
	*/

	@TableField("SEX" ) 
	private  Long sex ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.AGE type:VARCHAR2 len:20
	*/

	@TableField("AGE" ) 
	private  String age ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.HCNO type:VARCHAR2 len:20
	*/

	@TableField("HCNO" ) 
	private  String hcno ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.IPNO type:VARCHAR2 len:20
	*/

	@TableField("IPNO" ) 
	private  String ipno ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.ORDERDEPT type:NUMBER len:22 scale:0
	*/

	@TableField("ORDERDEPT" ) 
	private  Long orderdept ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.PATIENTDEPT type:NUMBER len:22 scale:0
	*/

	@TableField("PATIENTDEPT" ) 
	private  Long patientdept ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.PATIENTWARD type:NUMBER len:22 scale:0
	*/

	@TableField("PATIENTWARD" )
	private  Long patientward ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.INPUTOPER type:NUMBER len:22 scale:0
	*/

	@TableField("INPUTOPER" ) 
	private  Long inputoper ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.INPUTTIME type:DATE len:7
	*/

	@TableField("INPUTTIME" ) 
	private  Date inputtime ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.ISACCEPT type:CHAR len:1
	*/

	@TableField("ISACCEPT" ) 
	private  String isaccept ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.ACCEPTOPER type:NUMBER len:22 scale:0
	*/

	@TableField("ACCEPTOPER" ) 
	private  Long acceptoper ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.ACCEPTTIME type:DATE len:7
	*/

	@TableField("ACCEPTTIME" ) 
	private  Date accepttime ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.ISDELETE type:CHAR len:1
	*/

	@TableField("ISDELETE" ) 
	private  String isdelete ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.DELETETIME type:DATE len:7
	*/

	@TableField("DELETETIME" ) 
	private  Date deletetime ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.DELETEOPER type:NUMBER len:22 scale:0
	*/

	@TableField("DELETEOPER" ) 
	private  Long deleteoper ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.ISBILL type:CHAR len:1
	*/

	@TableField("ISBILL" ) 
	private  String isbill ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.ISCHARGE type:CHAR len:1
	*/

	@TableField("ISCHARGE" ) 
	private  String ischarge ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.VERSIONID type:TIMESTAMP(6) len:11
	*/

	@TableField("VERSIONID" ) 
	private  Date versionid ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.CHILDID type:NUMBER len:22 scale:0
	*/

	@TableField("CHILDID" ) 
	private  Long childid ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.ORDERID type:NUMBER len:22 scale:0
	*/

	@TableField("ORDERID" ) 
	private  Long orderid ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.DEVICETYPE type:NUMBER len:22 scale:0
	*/

	@TableField("DEVICETYPE" ) 
	private  Long devicetype ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.NOTE1 type:VARCHAR2 len:500
	*/

	@TableField("NOTE1" ) 
	private  String note1 ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.NOTE2 type:VARCHAR2 len:500
	*/

	@TableField("NOTE2" ) 
	private  String note2 ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.NOTE3 type:VARCHAR2 len:500
	*/

	@TableField("NOTE3" ) 
	private  String note3 ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.DIAGNOSE type:VARCHAR2 len:500
	*/

	@TableField("DIAGNOSE" ) 
	private  String diagnose ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.DIAGNOSEICD type:VARCHAR2 len:500
	*/

	@TableField("DIAGNOSEICD" ) 
	private  String diagnoseicd ;

	/**
	*EX_DATA_PHYSIOTHERAPYREQ.NOTE type:VARCHAR2 len:200
	*/

	@TableField("NOTE" ) 
	private  String note ;


}
