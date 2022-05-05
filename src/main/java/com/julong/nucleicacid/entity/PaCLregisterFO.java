package com.julong.nucleicacid.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName("PA_CL_DATA_REGISTER")
public class PaCLregisterFO  extends Model<>  implements Serializable{


/**
*HYHIS_PA_CL_DATA_REGISTER.ENCOUNTERID type:NUMBER len:22 scale:0  Comments: 
*/


@TableId("ENCOUNTERID")
private  Long encounterid ;


/**
*HYHIS_PA_CL_DATA_REGISTER.PATIENTID type:NUMBER len:22 scale:0  Comments: 
*/

@TableField("PATIENTID") 
private  Long patientid ;


/**
*HYHIS_PA_CL_DATA_REGISTER.HCNO type:VARCHAR2 len:20 Comments: 
*/

@TableField("HCNO" ) 
private  String hcno ;


/**
*HYHIS_PA_CL_DATA_REGISTER.PAYORID type:NUMBER len:22 scale:0  Comments: 
*/

@TableField("PAYORID" ) 
private  Long payorid ;


/**
*HYHIS_PA_CL_DATA_REGISTER.PLANID type:NUMBER len:22 scale:0  Comments: 
*/

@TableField("PLANID" ) 
private  Long planid ;


/**
*HYHIS_PA_CL_DATA_REGISTER.MCNO type:VARCHAR2 len:20 Comments: 
*/

@TableField("MCNO" ) 
private  String mcno ;


/**
*HYHIS_PA_CL_DATA_REGISTER.SINO type:VARCHAR2 len:20 Comments: 
*/

@TableField("SINO" ) 
private  String sino ;


/**
*HYHIS_PA_CL_DATA_REGISTER.NAME type:VARCHAR2 len:50 Comments: 
*/

@TableField("NAME") 
private  String name ;


/**
*HYHIS_PA_CL_DATA_REGISTER.SEX type:NUMBER len:22 scale:0  Comments: 
*/

@TableField("SEX") 
private  Long sex ;


/**
*HYHIS_PA_CL_DATA_REGISTER.AGE type:VARCHAR2 len:10 Comments: 
*/

@TableField("AGE" ) 
private  String age ;


/**
*HYHIS_PA_CL_DATA_REGISTER.BIRTHDAY type:DATE len:7 Comments: 
*/

@TableField("BIRTHDAY" ) 
private  Date birthday ;


/**
*HYHIS_PA_CL_DATA_REGISTER.IDNO type:VARCHAR2 len:18 Comments: 
*/

@TableField("IDNO" ) 
private  String idno ;


/**
*HYHIS_PA_CL_DATA_REGISTER.ADDRESS type:VARCHAR2 len:100 Comments: 
*/

@TableField("ADDRESS" ) 
private  String address ;


/**
*HYHIS_PA_CL_DATA_REGISTER.REGTIME type:DATE len:7 Comments: 
*/

@TableField("REGTIME") 
private  Date regtime ;


/**
*HYHIS_PA_CL_DATA_REGISTER.REGCATALOG type:NUMBER len:22 scale:0  Comments: 
*/

@TableField("REGCATALOG") 
private  Long regcatalog ;


/**
*HYHIS_PA_CL_DATA_REGISTER.REGDEPT type:NUMBER len:22 scale:0  Comments: 
*/

@TableField("REGDEPT" ) 
private  Long regdept ;


/**
*HYHIS_PA_CL_DATA_REGISTER.REGDOCTOR type:NUMBER len:22 scale:0  Comments: 
*/

@TableField("REGDOCTOR" ) 
private  Long regdoctor ;


/**
*HYHIS_PA_CL_DATA_REGISTER.ISADMIT type:CHAR len:1 Comments: 
*/

@TableField("ISADMIT") 
private  String isadmit ;


/**
*HYHIS_PA_CL_DATA_REGISTER.ISBOOK type:CHAR len:1 Comments: 
*/

@TableField("ISBOOK") 
private  String isbook ;


/**
*HYHIS_PA_CL_DATA_REGISTER.BOOKTYPE type:NUMBER len:22 scale:0  Comments: 
*/

@TableField("BOOKTYPE" ) 
private  Long booktype ;


/**
*HYHIS_PA_CL_DATA_REGISTER.BOOKSTATUS type:NUMBER len:22 scale:0  Comments: 
*/

@TableField("BOOKSTATUS" ) 
private  Long bookstatus ;


/**
*HYHIS_PA_CL_DATA_REGISTER.REGTYPE type:NUMBER len:22 scale:0  Comments: 
*/

@TableField("REGTYPE") 
private  Long regtype ;


/**
*HYHIS_PA_CL_DATA_REGISTER.REGSTATUS type:NUMBER len:22 scale:0  Comments: 
*/

@TableField("REGSTATUS") 
private  Long regstatus ;


/**
*HYHIS_PA_CL_DATA_REGISTER.ISCHARGE type:CHAR len:1 Comments: 
*/

@TableField("ISCHARGE") 
private  String ischarge ;


/**
*HYHIS_PA_CL_DATA_REGISTER.ISEMPLOYEE type:CHAR len:1 Comments: 
*/

@TableField("ISEMPLOYEE") 
private  String isemployee ;


/**
*HYHIS_PA_CL_DATA_REGISTER.ISVISITED type:CHAR len:1 Comments: 
*/

@TableField("ISVISITED") 
private  String isvisited ;


/**
*HYHIS_PA_CL_DATA_REGISTER.ISFIRSTVISIT type:CHAR len:1 Comments: 
*/

@TableField("ISFIRSTVISIT") 
private  String isfirstvisit ;


/**
*HYHIS_PA_CL_DATA_REGISTER.ISTRANSIP type:CHAR len:1 Comments: 
*/

@TableField("ISTRANSIP") 
private  String istransip ;


/**
*HYHIS_PA_CL_DATA_REGISTER.ISINFECTION type:CHAR len:1 Comments: 
*/

@TableField("ISINFECTION") 
private  String isinfection ;


/**
*HYHIS_PA_CL_DATA_REGISTER.ISDISCOUNT type:CHAR len:1 Comments: 
*/

@TableField("ISDISCOUNT") 
private  String isdiscount ;


/**
*HYHIS_PA_CL_DATA_REGISTER.ISBODYCHECK type:CHAR len:1 Comments: 
*/

@TableField("ISBODYCHECK") 
private  String isbodycheck ;


/**
*HYHIS_PA_CL_DATA_REGISTER.ENCOUNTERSTATUS type:NUMBER len:22 scale:0  Comments: 
*/

@TableField("ENCOUNTERSTATUS") 
private  Long encounterstatus ;


/**
*HYHIS_PA_CL_DATA_REGISTER.INPUTOPER type:NUMBER len:22 scale:0  Comments: 
*/

@TableField("INPUTOPER") 
private  Long inputoper ;


/**
*HYHIS_PA_CL_DATA_REGISTER.INPUTTIME type:DATE len:7 Comments: 
*/

@TableField("INPUTTIME") 
private  Date inputtime ;


/**
*HYHIS_PA_CL_DATA_REGISTER.ADMITOPER type:NUMBER len:22 scale:0  Comments: 
*/

@TableField("ADMITOPER" ) 
private  Long admitoper ;


/**
*HYHIS_PA_CL_DATA_REGISTER.ADMITTIME type:DATE len:7 Comments: 
*/

@TableField("ADMITTIME" ) 
private  Date admittime ;


/**
*HYHIS_PA_CL_DATA_REGISTER.CANCELOPER type:NUMBER len:22 scale:0  Comments: 
*/

@TableField("CANCELOPER" ) 
private  Long canceloper ;


/**
*HYHIS_PA_CL_DATA_REGISTER.CANCELTIME type:DATE len:7 Comments: 
*/

@TableField("CANCELTIME" ) 
private  Date canceltime ;


/**
*HYHIS_PA_CL_DATA_REGISTER.APPOINTMENTID type:NUMBER len:22 scale:0  Comments: 
*/

@TableField("APPOINTMENTID" ) 
private  Long appointmentid ;


/**
*HYHIS_PA_CL_DATA_REGISTER.NOTE type:VARCHAR2 len:100 Comments: 
*/

@TableField("NOTE" ) 
private  String note ;


/**
*HYHIS_PA_CL_DATA_REGISTER.ISUPLOAD type:CHAR len:1 Comments: 
*/

@TableField("ISUPLOAD") 
private  String isupload ;


/**
*HYHIS_PA_CL_DATA_REGISTER.LOVFLAG type:CHAR len:1 Comments: 
*/

@TableField("LOVFLAG" ) 
private  String lovflag ;


/**
*HYHIS_PA_CL_DATA_REGISTER.LOVENO type:VARCHAR2 len:20 Comments: 
*/

@TableField("LOVENO" ) 
private  String loveno ;


/**
*HYHIS_PA_CL_DATA_REGISTER.MOBILE type:VARCHAR2 len:20 Comments: 
*/

@TableField("MOBILE" ) 
private  String mobile ;


/**
*HYHIS_PA_CL_DATA_REGISTER.DAYDEPTNO type:NUMBER len:22 scale:0  Comments: 
*/

@TableField("DAYDEPTNO" ) 
private  Long daydeptno ;


/**
*HYHIS_PA_CL_DATA_REGISTER.CONTACT type:VARCHAR2 len:20 Comments: 
*/

@TableField("CONTACT" ) 
private  String contact ;


/**
*HYHIS_PA_CL_DATA_REGISTER.WEIGHT type:NUMBER len:22 scale:4  Comments: 
*/

@TableField("WEIGHT" ) 
private  BigDecimal weight ;


/**
*HYHIS_PA_CL_DATA_REGISTER.AGENT type:VARCHAR2 len:20 Comments: 
*/

@TableField("AGENT" ) 
private  String agent ;


/**
*HYHIS_PA_CL_DATA_REGISTER.AGENTIDNO type:VARCHAR2 len:20 Comments: 
*/

@TableField("AGENTIDNO" ) 
private  String agentidno ;


/**
*HYHIS_PA_CL_DATA_REGISTER.GGWSTRANS_FLAG type:CHAR len:1 Comments: 
*/

@TableField("GGWSTRANS_FLAG" ) 
private  String ggwstransFlag ;


/**
*HYHIS_PA_CL_DATA_REGISTER.PATIENTTYPE type:NUMBER len:22 scale:0  Comments: 
*/

@TableField("PATIENTTYPE" ) 
private  Long patienttype ;


/**
*HYHIS_PA_CL_DATA_REGISTER.ISTRANSSERV type:CHAR len:1 Comments: 
*/

@TableField("ISTRANSSERV" ) 
private  String istransserv ;


/**
*HYHIS_PA_CL_DATA_REGISTER.BOOKID type:VARCHAR2 len:50 Comments: 
*/

@TableField("BOOKID" ) 
private  String bookid ;


/**
*HYHIS_PA_CL_DATA_REGISTER.ISCHILD type:CHAR len:1 Comments: 
*/

@TableField("ISCHILD" ) 
private  String ischild ;


/**
*HYHIS_PA_CL_DATA_REGISTER.ISCERTIFICATION type:CHAR len:1 Comments: 
*/

@TableField("ISCERTIFICATION" ) 
private  String iscertification ;


/**
*HYHIS_PA_CL_DATA_REGISTER.IDTYPE type:NUMBER len:22 scale:0  Comments: 
*/

@TableField("IDTYPE" ) 
private  Long idtype ;


/**
*HYHIS_PA_CL_DATA_REGISTER.ISEMERGENCY type:CHAR len:1 Comments: 
*/

@TableField("ISEMERGENCY" ) 
private  String isemergency ;


/**
*HYHIS_PA_CL_DATA_REGISTER.EMERGENCYNAME type:NUMBER len:22 scale:0  Comments: 
*/

@TableField("EMERGENCYNAME" ) 
private  Long emergencyname ;


public PaCLregisterFO(){
	//default value 
	isemergency = "0" ;
	ischild = "0";
	istransserv ="0";
	patienttype = 1L;
	isupload = "0";
	lovflag = "1";
	encounterstatus = 2L ;
	isbodycheck = "0";
	isdiscount = "0";
	isinfection = "0";
	istransip = "0";
	isfirstvisit = "1";
	isvisited = "1" ;
	isemployee = "0";
	ischarge = "0";
	regstatus = 1L;
	regtype = 1L;
	isbook = "0";
	isadmit = "0";

}
	
}