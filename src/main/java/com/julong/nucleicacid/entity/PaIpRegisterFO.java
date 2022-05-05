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
@TableName("PA_IP_DATA_REGISTER")
public class PaIpRegisterFO extends Model<PaIpRegisterFO> implements Serializable{
		

	/**
	*PA_IP_DATA_REGISTER.ENCOUNTERID type:NUMBER len:22 scale:0
	*/

	@TableId( "ENCOUNTERID"  ) 
	private  Long encounterid ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.PATIENTID type:NUMBER len:22 scale:0
	*/

	@TableField( "PATIENTID" ) 
	private  Long patientid ;

	/**
	*PA_IP_DATA_REGISTER_HJYY.HCNO type:VARCHAR2 len:20
	*/

	@TableField( "HCNO" ) 
	private  String hcno ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.IPNO type:VARCHAR2 len:20
	*/

	@TableField( "IPNO" ) 
	private  String ipno ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.IPNOTYPE type:NUMBER len:22 scale:0
	*/

	@TableField( "IPNOTYPE" ) 
	private  Long ipnotype ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.IPCOUNT type:NUMBER len:22 scale:0
	*/

	@TableField( "IPCOUNT" ) 
	private  Long ipcount ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.PAYORID type:NUMBER len:22 scale:0
	*/

	@TableField( "PAYORID" ) 
	private  Long payorid ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.PLANID type:NUMBER len:22 scale:0
	*/

	@TableField( "PLANID" ) 
	private  Long planid ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.MCNO type:VARCHAR2 len:20
	*/

	@TableField( "MCNO" ) 
	private  String mcno ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.SINO type:VARCHAR2 len:20
	*/

	@TableField( "SINO" ) 
	private  String sino ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.SIBALANCE type:NUMBER len:22 scale:2
	*/

	@TableField( "SIBALANCE" ) 
	private  BigDecimal sibalance ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.SIBURDEN type:NUMBER len:22 scale:2
	*/

	@TableField( "SIBURDEN" ) 
	private  BigDecimal siburden ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.DRIVER type:VARCHAR2 len:20
	*/

	@TableField( "DRIVER" ) 
	private  String driver ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.DRIVELICENCE type:VARCHAR2 len:20
	*/

	@TableField( "DRIVELICENCE" ) 
	private  String drivelicence ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.CARLICENCE type:VARCHAR2 len:20
	*/

	@TableField( "CARLICENCE" ) 
	private  String carlicence ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.CARCOMPANY type:VARCHAR2 len:200
	*/

	@TableField( "CARCOMPANY" ) 
	private  String carcompany ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.CARINSURE type:NUMBER len:22 scale:0
	*/

	@TableField( "CARINSURE" ) 
	private  Long carinsure ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.NAME type:VARCHAR2 len:50
	*/

	@TableField( "NAME" ) 
	private  String name ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.SEX type:NUMBER len:22 scale:0
	*/

	@TableField( "SEX" ) 
	private  Long sex ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.BIRTHDAY type:DATE len:7
	*/

	@TableField( "BIRTHDAY" ) 
	private  Date birthday ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.AGE type:VARCHAR2 len:10
	*/

	@TableField( "AGE" ) 
	private  String age ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.MARRY type:NUMBER len:22 scale:0
	*/

	@TableField( "MARRY" ) 
	private  Long marry ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.BIRTHPLACE type:VARCHAR2 len:200
	*/

	@TableField( "BIRTHPLACE" ) 
	private  String birthplace ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.IDNO type:VARCHAR2 len:20
	*/

	@TableField( "IDNO" ) 
	private  String idno ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.NATIONALITY type:NUMBER len:22 scale:0
	*/

	@TableField( "NATIONALITY" ) 
	private  Long nationality ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.RACE type:NUMBER len:22 scale:0
	*/

	@TableField( "RACE" ) 
	private  Long race ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.OCCUPATION type:NUMBER len:22 scale:0
	*/

	@TableField( "OCCUPATION" ) 
	private  Long occupation ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.BLOODTYPE type:NUMBER len:22 scale:0
	*/

	@TableField( "BLOODTYPE" ) 
	private  Long bloodtype ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.MOBILE type:VARCHAR2 len:20
	*/

	@TableField( "MOBILE" ) 
	private  String mobile ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.EMAIL type:VARCHAR2 len:40
	*/

	@TableField( "EMAIL" ) 
	private  String email ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.COMPANY type:VARCHAR2 len:200
	*/

	@TableField( "COMPANY" ) 
	private  String company ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.COMPANYTELE type:VARCHAR2 len:20
	*/

	@TableField( "COMPANYTELE" ) 
	private  String companytele ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.COMPANYPC type:VARCHAR2 len:10
	*/

	@TableField( "COMPANYPC" ) 
	private  String companypc ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.CENSUSADDR type:VARCHAR2 len:200
	*/

	@TableField( "CENSUSADDR" ) 
	private  String censusaddr ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.CENSUSTELE type:VARCHAR2 len:20
	*/

	@TableField( "CENSUSTELE" ) 
	private  String censustele ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.CENSUSPC type:VARCHAR2 len:20
	*/

	@TableField( "CENSUSPC" ) 
	private  String censuspc ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.CONTACT type:VARCHAR2 len:20
	*/

	@TableField( "CONTACT" ) 
	private  String contact ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.CONTACTADDR type:VARCHAR2 len:200
	*/

	@TableField( "CONTACTADDR" ) 
	private  String contactaddr ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.CONTACTTELE type:VARCHAR2 len:20
	*/

	@TableField( "CONTACTTELE" ) 
	private  String contacttele ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.ASSURE type:VARCHAR2 len:20
	*/

	@TableField( "ASSURE" ) 
	private  String assure ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.ASSUREADDR type:VARCHAR2 len:200
	*/

	@TableField( "ASSUREADDR" ) 
	private  String assureaddr ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.ASSURETELE type:VARCHAR2 len:20
	*/

	@TableField( "ASSURETELE" ) 
	private  String assuretele ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.ASSUREBALANCE type:NUMBER len:22 scale:2
	*/

	@TableField( "ASSUREBALANCE" ) 
	private  BigDecimal assurebalance ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.RELATION type:NUMBER len:22 scale:0
	*/

	@TableField( "RELATION" ) 
	private  Long relation ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.HASVISITCARD type:CHAR len:1
	*/

	@TableField( "HASVISITCARD" ) 
	private  String hasvisitcard ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.VISITCARDCOUNT type:NUMBER len:22 scale:0
	*/

	@TableField( "VISITCARDCOUNT" ) 
	private  Long visitcardcount ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.INDATE type:DATE len:7
	*/

	@TableField( "INDATE" ) 
	private  Date indate ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.INDEPT type:NUMBER len:22 scale:0
	*/

	@TableField( "INDEPT" ) 
	private  Long indept ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.INWARD type:NUMBER len:22 scale:0
	*/

	@TableField( "INWARD" ) 
	private  Long inward ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.INDOCTOR type:NUMBER len:22 scale:0
	*/

	@TableField( "INDOCTOR" ) 
	private  Long indoctor ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.INCONDITION type:NUMBER len:22 scale:0
	*/

	@TableField( "INCONDITION" ) 
	private  Long incondition ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.INWAY type:NUMBER len:22 scale:0
	*/

	@TableField( "INWAY" ) 
	private  Long inway ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.INTYPE type:NUMBER len:22 scale:0
	*/

	@TableField( "INTYPE" ) 
	private  Long intype ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.INREASON type:NUMBER len:22 scale:0
	*/

	@TableField( "INREASON" ) 
	private  Long inreason ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.INSOURCE type:NUMBER len:22 scale:0
	*/

	@TableField( "INSOURCE" ) 
	private  Long insource ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.CLDOCTOR type:NUMBER len:22 scale:0
	*/

	@TableField( "CLDOCTOR" ) 
	private  Long cldoctor ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.CLDIAGNOSE type:VARCHAR2 len:500
	*/

	@TableField( "CLDIAGNOSE" ) 
	private  String cldiagnose ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.CLDIAGNOSECN type:VARCHAR2 len:500
	*/

	@TableField( "CLDIAGNOSECN" ) 
	private  String cldiagnosecn ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.FROMHOSPITAL type:NUMBER len:22 scale:0
	*/

	@TableField( "FROMHOSPITAL" ) 
	private  Long fromhospital ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.REFERRALDOCTOR type:NUMBER len:22 scale:0
	*/

	@TableField( "REFERRALDOCTOR" ) 
	private  Long referraldoctor ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.OUTDATE type:DATE len:7
	*/

	@TableField( "OUTDATE" ) 
	private  Date outdate ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.OUTDEPT type:NUMBER len:22 scale:0
	*/

	@TableField( "OUTDEPT" ) 
	private  Long outdept ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.OUTWARD type:NUMBER len:22 scale:0
	*/

	@TableField( "OUTWARD" ) 
	private  Long outward ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.OUTWAY type:NUMBER len:22 scale:0
	*/

	@TableField( "OUTWAY" ) 
	private  Long outway ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.OUTCONDITION type:NUMBER len:22 scale:0
	*/

	@TableField( "OUTCONDITION" ) 
	private  Long outcondition ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.TOHOSPITAL type:NUMBER len:22 scale:0
	*/

	@TableField( "TOHOSPITAL" ) 
	private  Long tohospital ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.ISADMIT type:CHAR len:1
	*/

	@TableField( "ISADMIT"  ) 
	private  String isadmit ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.ISMEDICALCHARGE type:CHAR len:1
	*/

	@TableField( "ISMEDICALCHARGE"  ) 
	private  String ismedicalcharge ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.ISCHARGE type:CHAR len:1
	*/

	@TableField( "ISCHARGE" ) 
	private  String ischarge ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.ISDEBTCHARGE type:CHAR len:1
	*/

	@TableField( "ISDEBTCHARGE"  ) 
	private  String isdebtcharge ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.ISOVERDUECHARGE type:CHAR len:1
	*/

	@TableField( "ISOVERDUECHARGE"  ) 
	private  String isoverduecharge ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.ISDEATH type:CHAR len:1
	*/

	@TableField( "ISDEATH"  ) 
	private  String isdeath ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.DEBTBALANCE type:NUMBER len:22 scale:2
	*/

	@TableField( "DEBTBALANCE" ) 
	private  BigDecimal debtbalance ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.ISNEWBORN type:CHAR len:1
	*/

	@TableField( "ISNEWBORN"  ) 
	private  String isnewborn ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.MOTHERENCOUNTER type:NUMBER len:22 scale:0
	*/

	@TableField( "MOTHERENCOUNTER" ) 
	private  Long motherencounter ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.ISSECRET type:CHAR len:1
	*/

	@TableField( "ISSECRET"  ) 
	private  String issecret ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.ENCOUNTERSTATUS type:NUMBER len:22 scale:0
	*/

	@TableField( "ENCOUNTERSTATUS" ) 
	private  Long encounterstatus ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.INPUTOPER type:NUMBER len:22 scale:0
	*/

	@TableField( "INPUTOPER" ) 
	private  Long inputoper ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.INPUTTIME type:DATE len:7
	*/

	@TableField( "INPUTTIME" ) 
	private  Date inputtime ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.CANCELOPER type:NUMBER len:22 scale:0
	*/

	@TableField( "CANCELOPER" ) 
	private  Long canceloper ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.CANCELTIME type:DATE len:7
	*/

	@TableField( "CANCELTIME" ) 
	private  Date canceltime ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.OUTOPER type:NUMBER len:22 scale:0
	*/

	@TableField( "OUTOPER" ) 
	private  Long outoper ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.OUTTIME type:DATE len:7
	*/

	@TableField( "OUTTIME" ) 
	private  Date outtime ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.CHARGEOPER type:NUMBER len:22 scale:0
	*/

	@TableField( "CHARGEOPER" ) 
	private  Long chargeoper ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.CHARGETIME type:DATE len:7
	*/

	@TableField( "CHARGETIME" ) 
	private  Date chargetime ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.DEBTOPER type:NUMBER len:22 scale:0
	*/

	@TableField( "DEBTOPER" ) 
	private  Long debtoper ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.DEBTTIME type:DATE len:7
	*/

	@TableField( "DEBTTIME" ) 
	private  Date debttime ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.OVERDUEOPER type:NUMBER len:22 scale:0
	*/

	@TableField( "OVERDUEOPER" ) 
	private  Long overdueoper ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.OVERDUETIME type:DATE len:7
	*/

	@TableField( "OVERDUETIME" ) 
	private  Date overduetime ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.ISDELETE type:CHAR len:1
	*/

	@TableField( "ISDELETE"  ) 
	private  String isdelete ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.PYCODE type:VARCHAR2 len:8
	*/

	@TableField( "PYCODE" ) 
	private  String pycode ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.WBCODE type:VARCHAR2 len:8
	*/

	@TableField( "WBCODE" ) 
	private  String wbcode ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.CLDIAGNOSEICD10 type:VARCHAR2 len:500
	*/

	@TableField( "CLDIAGNOSEICD10" ) 
	private  String cldiagnoseicd10 ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.CLDIAGNOSECNICD10 type:VARCHAR2 len:500
	*/

	@TableField( "CLDIAGNOSECNICD10" ) 
	private  String cldiagnosecnicd10 ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.NOTE type:VARCHAR2 len:500
	*/

	@TableField( "NOTE" ) 
	private  String note ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.ISCP type:CHAR len:1
	*/

	@TableField( "ISCP" ) 
	private  String iscp ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.SITRANSFLAG type:CHAR len:1
	*/

	@TableField( "SITRANSFLAG" ) 
	private  String sitransflag ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.CASEDERIVEFLAG type:CHAR len:1
	*/

	@TableField( "CASEDERIVEFLAG" ) 
	private  String casederiveflag ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.VERSIONID type:TIMESTAMP(6) len:11
	*/

	@TableField( "VERSIONID" ) 
	private  Date versionid ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.BAKBOOLEAN1 type:CHAR len:1
	*/

	@TableField( "BAKBOOLEAN1" ) 
	private  String bakboolean1 ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.BAKBOOLEAN2 type:CHAR len:1
	*/

	@TableField( "BAKBOOLEAN2" ) 
	private  String bakboolean2 ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.BAKBOOLEAN3 type:CHAR len:1
	*/

	@TableField( "BAKBOOLEAN3" ) 
	private  String bakboolean3 ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.BAKBOOLEAN4 type:CHAR len:1
	*/

	@TableField( "BAKBOOLEAN4" ) 
	private  String bakboolean4 ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.BAKLONG1 type:NUMBER len:22 scale:0
	*/

	@TableField( "BAKLONG1" ) 
	private  Long baklong1 ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.BAKLONG2 type:NUMBER len:22 scale:0
	*/

	@TableField( "BAKLONG2" ) 
	private  Long baklong2 ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.BAKLONG3 type:NUMBER len:22 scale:0
	*/

	@TableField( "BAKLONG3" ) 
	private  Long baklong3 ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.BAKLONG4 type:NUMBER len:22 scale:0
	*/

	@TableField( "BAKLONG4" ) 
	private  Long baklong4 ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.BAKLONG5 type:NUMBER len:22 scale:0
	*/

	@TableField( "BAKLONG5" ) 
	private  Long baklong5 ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.BAKLONG6 type:NUMBER len:22 scale:0
	*/

	@TableField( "BAKLONG6" ) 
	private  Long baklong6 ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.BAKSTRING1 type:VARCHAR2 len:20
	*/

	@TableField( "BAKSTRING1" ) 
	private  String bakstring1 ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.BAKSTRING2 type:VARCHAR2 len:20
	*/

	@TableField( "BAKSTRING2" ) 
	private  String bakstring2 ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.BAKSTRING3 type:VARCHAR2 len:20
	*/

	@TableField( "BAKSTRING3" ) 
	private  String bakstring3 ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.BAKSTRING4 type:VARCHAR2 len:20
	*/

	@TableField( "BAKSTRING4" ) 
	private  String bakstring4 ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.BAKSTRING5 type:VARCHAR2 len:20
	*/

	@TableField( "BAKSTRING5" ) 
	private  String bakstring5 ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.BAKSTRING6 type:VARCHAR2 len:20
	*/

	@TableField( "BAKSTRING6" ) 
	private  String bakstring6 ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.BAKSTRING7 type:VARCHAR2 len:20
	*/

	@TableField( "BAKSTRING7" ) 
	private  String bakstring7 ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.BAKSTRING8 type:VARCHAR2 len:20
	*/

	@TableField( "BAKSTRING8" ) 
	private  String bakstring8 ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.BAKSTRING9 type:VARCHAR2 len:20
	*/

	@TableField( "BAKSTRING9" ) 
	private  String bakstring9 ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.BAKSTRING10 type:VARCHAR2 len:20
	*/

	@TableField( "BAKSTRING10" ) 
	private  String bakstring10 ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.BABYBIRTHWEIGHT type:NUMBER len:22 scale:2
	*/

	@TableField( "BABYBIRTHWEIGHT" ) 
	private  BigDecimal babybirthweight ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.BABYINWEIGHT type:NUMBER len:22 scale:2
	*/

	@TableField( "BABYINWEIGHT" ) 
	private  BigDecimal babyinweight ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.PARENTAGEPLACE type:VARCHAR2 len:200
	*/

	@TableField( "PARENTAGEPLACE" ) 
	private  String parentageplace ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.PRESENTPLACE type:VARCHAR2 len:200
	*/

	@TableField( "PRESENTPLACE" ) 
	private  String presentplace ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.PRESENTPC type:VARCHAR2 len:20
	*/

	@TableField( "PRESENTPC" ) 
	private  String presentpc ;


	/**
	*PA_IP_DATA_REGISTER_HJYY.GGWSTRANS_FLAG type:CHAR len:1
	*/

	@TableField( "GGWSTRANS_FLAG" ) 
	private  String ggwstransFlag ;




}