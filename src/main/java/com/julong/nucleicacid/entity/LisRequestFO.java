package com.julong.nucleicacid.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName("LIS_SYS_INPUT_REQUEST")
public class LisRequestFO  extends Model<LisRequestFO> implements Serializable{
	
	public LisRequestFO(){
		
	}
	/**
	*LIS_SYS_INPUT_REQUEST.HIS_REQUEST_ID type:NUMBER len:22 scale:0
	*/
	@TableField("HIS_REQUEST_ID" )
	private  Long hisRequestId ;

//	/**
//	*LIS_SYS_INPUT_REQUEST_HJYY.HIS_REQUEST_ID type:NUMBER len:22 scale:0
//	*/
//
//	@TableField("HIS_REQUEST_ID" ) 
	

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.TRUST_ID type:NUMBER len:22 scale:0
	*/

	@TableField("TRUST_ID" ) 
	private  Long trustId ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.REQUEST_NO type:VARCHAR2 len:20
	*/

	@TableField("REQUEST_NO" ) 
	private  String requestNo ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.RX_NO type:VARCHAR2 len:20
	*/

	@TableField("RX_NO" ) 
	private  String rxNo ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.HIS_ID type:VARCHAR2 len:20
	*/

	@TableField("HIS_ID" ) 
	private  String hisId ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.PATIENT_NO type:VARCHAR2 len:20
	*/

	@TableField("PATIENT_NO" ) 
	private  String patientNo ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.PATIENT_TYPE type:VARCHAR2 len:1
	*/

	@TableField("PATIENT_TYPE" ) 
	private  String patientType ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.PATIENT_NAME type:VARCHAR2 len:40
	*/

	@TableField("PATIENT_NAME" ) 
	private  String patientName ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.PATIENT_SEX type:VARCHAR2 len:1
	*/

	@TableField("PATIENT_SEX" ) 
	private  String patientSex ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.PATIENT_ID_CARD type:VARCHAR2 len:20
	*/

	@TableField("PATIENT_ID_CARD" ) 
	private  String patientIdCard ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.MOBILE_TELEPHONE type:VARCHAR2 len:20
	*/

	@TableField("MOBILE_TELEPHONE" ) 
	private  String mobileTelephone ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.PATIENT_BIRTHDAY type:DATE len:7
	*/

	@TableField("PATIENT_BIRTHDAY" ) 
	private  Date patientBirthday ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.PATIENT_AGE_YEAR type:NUMBER len:22 scale:0
	*/

	@TableField("PATIENT_AGE_YEAR" ) 
	private  Long patientAgeYear ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.PATIENT_AGE_MONTH type:NUMBER len:22 scale:0
	*/

	@TableField("PATIENT_AGE_MONTH" ) 
	private  Long patientAgeMonth ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.PATIENT_AGE_DAY type:NUMBER len:22 scale:0
	*/

	@TableField("PATIENT_AGE_DAY" ) 
	private  Long patientAgeDay ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.PATIENT_AGE_HOUR type:NUMBER len:22 scale:0
	*/

	@TableField("PATIENT_AGE_HOUR" ) 
	private  Long patientAgeHour ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.DEPT_CODE type:VARCHAR2 len:20
	*/

	@TableField("DEPT_CODE" ) 
	private  String deptCode ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.DEPT_NAME type:VARCHAR2 len:20
	*/

	@TableField("DEPT_NAME" ) 
	private  String deptName ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.BEDNO type:VARCHAR2 len:20
	*/

	@TableField("BEDNO" ) 
	private  String bedno ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.DR_CODE type:VARCHAR2 len:20
	*/

	@TableField("DR_CODE" ) 
	private  String drCode ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.DR_NAME type:VARCHAR2 len:20
	*/

	@TableField("DR_NAME" ) 
	private  String drName ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.DIAGNAME type:VARCHAR2 len:200
	*/

	@TableField("DIAGNAME" ) 
	private  String diagname ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.REQUEST_AIM type:VARCHAR2 len:50
	*/

	@TableField("REQUEST_AIM" ) 
	private  String requestAim ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.ITEM_CODE type:VARCHAR2 len:20
	*/

	@TableField("ITEM_CODE" ) 
	private  String itemCode ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.ITEM_NAME type:VARCHAR2 len:100
	*/

	@TableField("ITEM_NAME" ) 
	private  String itemName ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.ITEM_PRICE type:NUMBER len:22 scale:2
	*/

	@TableField("ITEM_PRICE" ) 
	private  BigDecimal itemPrice ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.SAMPLE_NAME type:VARCHAR2 len:50
	*/

	@TableField("SAMPLE_NAME" ) 
	private  String sampleName ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.TRANST_TAG type:VARCHAR2 len:1
	*/

	@TableField("TRANST_TAG" ) 
	private  String transtTag ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.TRANST_TIME type:DATE len:7
	*/

	@TableField("TRANST_TIME" ) 
	private  Date transtTime ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.PRI type:VARCHAR2 len:1
	*/

	@TableField("PRI" ) 
	private  String pri ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.SEND_DR_MESSAGE type:VARCHAR2 len:1
	*/

	@TableField("SEND_DR_MESSAGE" ) 
	private  String sendDrMessage ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.SEND_PATIENT_MESSAGE type:VARCHAR2 len:1
	*/

	@TableField("SEND_PATIENT_MESSAGE" ) 
	private  String sendPatientMessage ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.SEND_LAB_MESSAGE type:VARCHAR2 len:1
	*/

	@TableField("SEND_LAB_MESSAGE" ) 
	private  String sendLabMessage ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.REQUESTTIME type:DATE len:7
	*/

	@TableField("REQUESTTIME" ) 
	private  Date requesttime ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.REQUEST_ID type:NUMBER len:22 scale:0
	*/

	@TableField("REQUEST_ID" ) 
	private  Long requestId ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.REQUEST_LIST_ID type:NUMBER len:22 scale:0
	*/

	@TableField("REQUEST_LIST_ID" ) 
	private  Long requestListId ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.REPORT_ID type:NUMBER len:22 scale:0
	*/

	@TableField("REPORT_ID" ) 
	private  Long reportId ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.CHARGEID type:VARCHAR2 len:10
	*/

	@TableField("CHARGEID" ) 
	private  String chargeid ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.NOTE type:VARCHAR2 len:200
	*/

	@TableField("NOTE" ) 
	private  String note ;

	/**
	*LIS_SYS_INPUT_REQUEST_HJYY.CHILDID type:NUMBER len:22 scale:0
	*/

	@TableField("CHILDID" ) 
	private  Long childid ;

	

}