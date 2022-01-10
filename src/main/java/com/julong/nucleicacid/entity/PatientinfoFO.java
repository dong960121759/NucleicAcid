package com.julong.nucleicacid.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

;

@Data
@TableName( "PA_DATA_PATIENT")
public class PatientinfoFO implements Serializable{

	    
	/**
	*PA_DATA_PATIENT.PATIENTID type:NUMBER len:22 scale:0
	*/
	@TableId(value ="PATIENTID")
	private  Long patientid ;

	@TableField( "EMPI" ) 
	private  String empi ;

	@TableField( "IDTYPE" ) 
	private  String idtype ;

	@TableField( "ISCERTIFICATION" ) 
	private  String ISCERTIFICATION ;
	
	
	/**
	*PA_DATA_PATIENT.ISWXBIND type:VARCHAR2 len:1
	*/

	@TableField( "ISWXBIND" ) 
	private  String iswxbind ;

	/**
	*PA_DATA_PATIENT.HCNO type:VARCHAR2 len:20
	*/

	@TableField( "HCNO"  ) 
	private  String hcno ;


	/**
	*PA_DATA_PATIENT.IPNO type:VARCHAR2 len:20
	*/

	@TableField( "IPNO" ) 
	private  String ipno ;


	/**
	*PA_DATA_PATIENT.CLNO type:VARCHAR2 len:20
	*/

	@TableField( "CLNO" ) 
	private  String clno ;


	/**
	*PA_DATA_PATIENT.PAYORID type:NUMBER len:22 scale:0
	*/

	@TableField( "PAYORID" ) 
	private  Long payorid ;


	/**
	*PA_DATA_PATIENT.PLANID type:NUMBER len:22 scale:0
	*/

	@TableField( "PLANID" ) 
	private  Long planid ;


	/**
	*PA_DATA_PATIENT.MCNO type:VARCHAR2 len:20
	*/

	@TableField( "MCNO" ) 
	private  String mcno ;


	/**
	*PA_DATA_PATIENT.SINO type:VARCHAR2 len:20
	*/

	@TableField( "SINO" ) 
	private  String sino ;


	/**
	*PA_DATA_PATIENT.GPNO type:VARCHAR2 len:30
	*/

	@TableField( "GPNO" ) 
	private  String gpno ;


	/**
	*PA_DATA_PATIENT.NAME type:VARCHAR2 len:50
	*/

	@TableField( "NAME" ) 
	private  String name ;


	/**
	*PA_DATA_PATIENT.PYCODE type:VARCHAR2 len:8
	*/

	@TableField( "PYCODE" ) 
	private  String pycode ;


	/**
	*PA_DATA_PATIENT.WBCODE type:VARCHAR2 len:8
	*/

	@TableField( "WBCODE" ) 
	private  String wbcode ;


	/**
	*PA_DATA_PATIENT.SEX type:NUMBER len:22 scale:0
	*/

	@TableField( "SEX" ) 
	private  Long sex ;


	/**
	*PA_DATA_PATIENT.BIRTHDAY type:DATE len:7
	*/

	@TableField( "BIRTHDAY" ) 
	private  Date birthday ;


	/**
	*PA_DATA_PATIENT.BLOODTYPE type:NUMBER len:22 scale:0
	*/

	@TableField( "BLOODTYPE" ) 
	private  Long bloodtype ;


	/**
	*PA_DATA_PATIENT.HOMETELE type:VARCHAR2 len:20
	*/

	@TableField( "HOMETELE" ) 
	private  String hometele ;


	/**
	*PA_DATA_PATIENT.MOBILE type:VARCHAR2 len:20
	*/

	@TableField( "MOBILE" ) 
	private  String mobile ;


	/**
	*PA_DATA_PATIENT.EMAIL type:VARCHAR2 len:50
	*/

	@TableField( "EMAIL" ) 
	private  String email ;


	/**
	*PA_DATA_PATIENT.AREA type:NUMBER len:22 scale:0
	*/

	@TableField( "AREA" ) 
	private  Long area ;


	/**
	*PA_DATA_PATIENT.ADDRESS type:VARCHAR2 len:100
	*/

	@TableField( "ADDRESS" ) 
	private  String address ;


	/**
	*PA_DATA_PATIENT.IDNO type:VARCHAR2 len:20
	*/

	@TableField( "IDNO" ) 
	private  String idno ;


	/**
	*PA_DATA_PATIENT.NATIONALITY type:NUMBER len:22 scale:0
	*/

	@TableField( "NATIONALITY" ) 
	private  Long nationality ;


	/**
	*PA_DATA_PATIENT.RACE type:NUMBER len:22 scale:0
	*/

	@TableField( "RACE" ) 
	private  Long race ;


	/**
	*PA_DATA_PATIENT.OCCUPATION type:NUMBER len:22 scale:0
	*/

	@TableField( "OCCUPATION" ) 
	private  Long occupation ;


	/**
	*PA_DATA_PATIENT.MARRY type:NUMBER len:22 scale:0
	*/

	@TableField( "MARRY" ) 
	private  Long marry ;


	/**
	*PA_DATA_PATIENT.BIRTHPLACE type:VARCHAR2 len:50
	*/

	@TableField( "BIRTHPLACE" ) 
	private  String birthplace ;


	/**
	*PA_DATA_PATIENT.COMPANY type:VARCHAR2 len:200
	*/

	@TableField( "COMPANY" ) 
	private  String company ;


	/**
	*PA_DATA_PATIENT.COMPANYTELE type:VARCHAR2 len:20
	*/

	@TableField( "COMPANYTELE" ) 
	private  String companytele ;


	/**
	*PA_DATA_PATIENT.COMPANYPC type:VARCHAR2 len:20
	*/

	@TableField( "COMPANYPC" ) 
	private  String companypc ;


	/**
	*PA_DATA_PATIENT.CENSUSADDR type:VARCHAR2 len:100
	*/

	@TableField( "CENSUSADDR" ) 
	private  String censusaddr ;


	/**
	*PA_DATA_PATIENT.CENSUSTELE type:VARCHAR2 len:20
	*/

	@TableField( "CENSUSTELE" ) 
	private  String censustele ;


	/**
	*PA_DATA_PATIENT.CENSUSPC type:VARCHAR2 len:20
	*/

	@TableField( "CENSUSPC" ) 
	private  String censuspc ;


	/**
	*PA_DATA_PATIENT.CONTACT type:VARCHAR2 len:20
	*/

	@TableField( "CONTACT" ) 
	private  String contact ;


	/**
	*PA_DATA_PATIENT.RELATION type:NUMBER len:22 scale:0
	*/

	@TableField( "RELATION" ) 
	private  Long relation ;


	/**
	*PA_DATA_PATIENT.ISDEATH type:VARCHAR2 len:1
	*/

	@TableField( "ISDEATH"  ) 
	private  String isdeath ;


	/**
	*PA_DATA_PATIENT.DEATHOPER type:NUMBER len:22 scale:0
	*/

	@TableField( "DEATHOPER" ) 
	private  Long deathoper ;


	/**
	*PA_DATA_PATIENT.DEATHTIME type:DATE len:7
	*/

	@TableField( "DEATHTIME" ) 
	private  Date deathtime ;


	/**
	*PA_DATA_PATIENT.ISBLACKLIST type:VARCHAR2 len:1
	*/

	@TableField( "ISBLACKLIST"  ) 
	private  String isblacklist ;


	/**
	*PA_DATA_PATIENT.INPUTOPER type:NUMBER len:22 scale:0
	*/

	@TableField( "INPUTOPER" ) 
	private  Long inputoper ;


	/**
	*PA_DATA_PATIENT.INPUTTIME type:DATE len:7
	*/

	@TableField( "INPUTTIME" ) 
	private  Date inputtime ;


	/**
	*PA_DATA_PATIENT.ISDELETE type:CHAR len:1
	*/

	@TableField( "ISDELETE"  ) 
	private  String isdelete ;


	/**
	*PA_DATA_PATIENT.DELOPER type:NUMBER len:22 scale:0
	*/

	@TableField( "DELOPER" ) 
	private  Long deloper ;


	/**
	*PA_DATA_PATIENT.DELTIME type:DATE len:7
	*/

	@TableField( "DELTIME" ) 
	private  Date deltime ;


	/**
	*PA_DATA_PATIENT.LASTENCOUNTERTIME type:DATE len:7
	*/

	@TableField( "LASTENCOUNTERTIME" ) 
	private  Date lastencountertime ;


	/**
	*PA_DATA_PATIENT.ISEMPLOYEE type:CHAR len:1
	*/

	@TableField( "ISEMPLOYEE"  )
	private  String isemployee ;


	/**
	*PA_DATA_PATIENT.ISHR type:CHAR len:1
	*/

	@TableField( "ISHR" ) 
	private  String ishr ;


	/**
	*PA_DATA_PATIENT.PASSWORD type:VARCHAR2 len:20
	*/

	@TableField( "PASSWORD" ) 
	private  String password ;


	/**
	*PA_DATA_PATIENT.CONTACTADDR type:VARCHAR2 len:100
	*/

	@TableField( "CONTACTADDR" ) 
	private  String contactaddr ;


	/**
	*PA_DATA_PATIENT.CONTACTTELE type:VARCHAR2 len:20
	*/

	@TableField( "CONTACTTELE" ) 
	private  String contacttele ;


 


	/**
	*PA_DATA_PATIENT.VERSIONID type:TIMESTAMP(6) len:11
	*/

	@TableField( "VERSIONID" ) 
	private  Date versionid ;


	/**
	*PA_DATA_PATIENT.ISTRANSSERV type:CHAR len:1
	*/

	@TableField( "ISTRANSSERV" ) 
	private  String istransserv ;


	 
	public PatientinfoFO() {
		 isdeath = "0";
		 isblacklist = "0";
		 isdelete = "0";
		 isemployee = "0";
		 iswxbind = "0";
	}


}