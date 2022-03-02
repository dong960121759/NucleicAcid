package com.julong.nucleicacid.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
@TableName( "MA_CL_DATA_PHARMACYQUEUE")
public class ClMdqueueFO implements Serializable {
	
	public ClMdqueueFO() {
		isincludedrip =  "0" ;
		isoutdisplay =  "0" ;
		isprioritypack =  "0" ;
		isnotdrug =  "0" ;
		istransserv =  "0" ;
		queuestatus = 1L ;
	}
	/**
	*MA_CL_DATA_PHARMACYQUEUE.QUEUEID type:NUMBER len:22 scale:0
	*/
	@TableId("QUEUEID")
	private  Long queueid ;

	/**
	*MA_CL_DATA_PHARMACYQUEUE.PATIENTID type:NUMBER len:22 scale:0
	*/

	@TableField("PATIENTID") 
	private  Long patientid ;

	/**
	*MA_CL_DATA_PHARMACYQUEUE.ENCOUNTERID type:NUMBER len:22 scale:0
	*/

	@TableField("ENCOUNTERID") 
	private  Long encounterid ;

	/**
	*MA_CL_DATA_PHARMACYQUEUE.NAME type:VARCHAR2 len:50
	*/

	@TableField("NAME") 
	private  String name ;

	/**
	*MA_CL_DATA_PHARMACYQUEUE.SEX type:NUMBER len:22 scale:0
	*/

	@TableField("SEX") 
	private  Long sex ;

	/**
	*MA_CL_DATA_PHARMACYQUEUE.AGE type:VARCHAR2 len:10
	*/

	@TableField("AGE" ) 
	private  String age ;

	/**
	*MA_CL_DATA_PHARMACYQUEUE.RECIPEID type:NUMBER len:22 scale:0
	*/

	@TableField("RECIPEID")
	private  Long recipeid ;

	/**
	*MA_CL_DATA_PHARMACYQUEUE.DEPTID type:NUMBER len:22 scale:0
	*/

	@TableField("DEPTID" ) 
	private  Long deptid ;

	/**
	*MA_CL_DATA_PHARMACYQUEUE.DOCID type:NUMBER len:22 scale:0
	*/

	@TableField("DOCID" ) 
	private  Long docid ;

	/**
	*MA_CL_DATA_PHARMACYQUEUE.RECIPETIME type:DATE len:7
	*/

	@TableField("RECIPETIME" ) 
	private  Date recipetime ;

	/**
	*MA_CL_DATA_PHARMACYQUEUE.QUEUETIME type:DATE len:7
	*/

	@TableField("QUEUETIME") 
	private  Date queuetime ;

	/**
	*MA_CL_DATA_PHARMACYQUEUE.CHARGEOPER type:NUMBER len:22 scale:0
	*/

	@TableField("CHARGEOPER" ) 
	private  Long chargeoper ;

	/**
	*MA_CL_DATA_PHARMACYQUEUE.ISINCLUDEDRIP type:CHAR len:1
	*/

	@TableField("ISINCLUDEDRIP") 
	private  String isincludedrip ;

	/**
	*MA_CL_DATA_PHARMACYQUEUE.QUEUESTATUS type:NUMBER len:22 scale:0
	*/

	@TableField("QUEUESTATUS") 
	private  Long queuestatus ;

	/**
	*MA_CL_DATA_PHARMACYQUEUE.WINDOWID type:NUMBER len:22 scale:0
	*/

	@TableField("WINDOWID") 
	private  Long windowid ;

	/**
	*MA_CL_DATA_PHARMACYQUEUE.VERSIONID type:TIMESTAMP(6) len:11
	*/

	@TableField("VERSIONID") 
	private  Date versionid ;

	/**
	*MA_CL_DATA_PHARMACYQUEUE.NOTE type:VARCHAR2 len:200
	*/

	@TableField("NOTE" ) 
	private  String note ;

	/**
	*MA_CL_DATA_PHARMACYQUEUE.ISOUTDISPLAY type:CHAR len:1
	*/

	@TableField("ISOUTDISPLAY" ) 
	private  String isoutdisplay ;

	/**
	*MA_CL_DATA_PHARMACYQUEUE.ISPRIORITYPACK type:CHAR len:1
	*/

	@TableField("ISPRIORITYPACK" ) 
	private  String isprioritypack ;

	/**
	*MA_CL_DATA_PHARMACYQUEUE.PACKTIME type:DATE len:7
	*/

	@TableField("PACKTIME" ) 
	private  Date packtime ;

	/**
	*MA_CL_DATA_PHARMACYQUEUE.PACKOPER type:NUMBER len:22 scale:0
	*/

	@TableField("PACKOPER" ) 
	private  Long packoper ;

	/**
	*MA_CL_DATA_PHARMACYQUEUE.CHARGEID type:NUMBER len:22 scale:0
	*/

	@TableField("CHARGEID" ) 
	private  Long chargeid ;

	/**
	*MA_CL_DATA_PHARMACYQUEUE.ISNOTDRUG type:CHAR len:1
	*/

	@TableField("ISNOTDRUG" ) 
	private  String isnotdrug ;

	/**
	*MA_CL_DATA_PHARMACYQUEUE.DISPLAYWINDOW type:NUMBER len:22 scale:0
	*/

	@TableField("DISPLAYWINDOW" ) 
	private  Long displaywindow ;

	/**
	*MA_CL_DATA_PHARMACYQUEUE.ISTRANSSERV type:CHAR len:1
	*/

	@TableField("ISTRANSSERV" ) 
	private  String istransserv ;



	
}