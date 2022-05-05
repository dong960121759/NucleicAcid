package com.julong.nucleicacid.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

;

@Data
@TableName("PC_CL_DATA_RECIPE")
public class PcClrecipeFO  extends Model<>  implements Serializable {

    /**
     * HYHIS_PC_CL_DATA_RECIPE.RECIPEID type:NUMBER len:22 scale:0  Comments:
     */

    @TableId("RECIPEID")
    private Long recipeid;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.RECIPECLASS type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("RECIPECLASS")
    private Long recipeclass;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.RECIPETYPE type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("RECIPETYPE")
    private Long recipetype;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.ENCOUNTERID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("ENCOUNTERID")
    private Long encounterid;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.PATIENTID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("PATIENTID")
    private Long patientid;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.CATAID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("CATAID")
    private Long cataid;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.NAME type:VARCHAR2 len:50 Comments:
     */

    @TableField("NAME")
    private String name;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.SEX type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("SEX")
    private Long sex;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.AGE type:VARCHAR2 len:10 Comments:
     */

    @TableField("AGE")
    private String age;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.ADDRESS type:VARCHAR2 len:100 Comments:
     */

    @TableField("ADDRESS")
    private String address;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.HERTOTALAMOUNT type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("HERTOTALAMOUNT")
    private Long hertotalamount;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.HERDAYAMOUNT type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("HERDAYAMOUNT")
    private Long herdayamount;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.HERDAYS type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("HERDAYS")
    private Long herdays;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.HERFRY type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("HERFRY")
    private Long herfry;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.HERORAL type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("HERORAL")
    private Long heroral;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.HERDIRECTION type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("HERDIRECTION")
    private Long herdirection;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.ISHERFRY type:CHAR len:1 Comments:
     */

    @TableField("ISHERFRY")
    private String isherfry;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.DEPTID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("DEPTID")
    private Long deptid;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.DOCID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("DOCID")
    private Long docid;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.ISREQUISITION type:CHAR len:1 Comments:
     */

    @TableField("ISREQUISITION")
    private String isrequisition;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.REQUISITIONID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("REQUISITIONID")
    private Long requisitionid;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.ISMANUAL type:CHAR len:1 Comments:
     */

    @TableField("ISMANUAL")
    private String ismanual;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.ISMAIN type:CHAR len:1 Comments:
     */

    @TableField("ISMAIN")
    private String ismain;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.ISSPECIAL type:CHAR len:1 Comments:
     */

    @TableField("ISSPECIAL")
    private String isspecial;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.INPUTOPER type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("INPUTOPER")
    private Long inputoper;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.INPUTTIME type:DATE len:7 Comments:
     */

    @TableField("INPUTTIME")
    private Date inputtime;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.ISCHARGE type:CHAR len:1 Comments:
     */

    @TableField("ISCHARGE")
    private String ischarge;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.CHARGEID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("CHARGEID")
    private Long chargeid;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.CHARGEOPER type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("CHARGEOPER")
    private Long chargeoper;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.CHARGETIME type:DATE len:7 Comments:
     */

    @TableField("CHARGETIME")
    private Date chargetime;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.ISACCOUNT type:CHAR len:1 Comments:
     */

    @TableField("ISACCOUNT")
    private String isaccount;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.BILLID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("BILLID")
    private Long billid;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.ACCOUNTOPER type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("ACCOUNTOPER")
    private Long accountoper;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.ACCOUNTTIME type:DATE len:7 Comments:
     */

    @TableField("ACCOUNTTIME")
    private Date accounttime;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.ISDELETE type:CHAR len:1 Comments:
     */

    @TableField("ISDELETE")
    private String isdelete;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.DELETEOPER type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("DELETEOPER")
    private Long deleteoper;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.DELETETIME type:DATE len:7 Comments:
     */

    @TableField("DELETETIME")
    private Date deletetime;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.NOTE type:VARCHAR2 len:200 Comments:
     */

    @TableField("NOTE")
    private String note;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.VERSIONID type:TIMESTAMP(6) len:11 Comments:
     */

    @TableField("VERSIONID")
    private Date versionid;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.ISUPLOAD type:CHAR len:1 Comments:
     */

    @TableField("ISUPLOAD")
    private String isupload;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.DIAGID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("DIAGID")
    private Long diagid;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.ZYQK type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("ZYQK")
    private Long zyqk;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.ISPRIORITYPACK type:CHAR len:1 Comments:
     */

    @TableField("ISPRIORITYPACK")
    private String isprioritypack;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.ISSUBSEQUENTVISIT type:CHAR len:1 Comments:
     */

    @TableField("ISSUBSEQUENTVISIT")
    private String issubsequentvisit;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.ISSELFPAYRECIPE type:CHAR len:1 Comments:
     */

    @TableField("ISSELFPAYRECIPE")
    private String isselfpayrecipe;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.ISREJECT type:CHAR len:1 Comments:
     */

    @TableField("ISREJECT")
    private String isreject;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.REJECTOPER type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("REJECTOPER")
    private Long rejectoper;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.REJECTTIME type:DATE len:7 Comments:
     */

    @TableField("REJECTTIME")
    private Date rejecttime;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.REJECTNOTE type:VARCHAR2 len:200 Comments:
     */

    @TableField("REJECTNOTE")
    private String rejectnote;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.SOCIALTYPE type:VARCHAR2 len:6 Comments:
     */

    @TableField("SOCIALTYPE")
    private String socialtype;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.DIAGID2 type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("DIAGID2")
    private Long diagid2;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.HERFRYTIME type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("HERFRYTIME")
    private Long herfrytime;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.GGWSTRANS_FLAG type:CHAR len:1 Comments:
     */

    @TableField("GGWSTRANS_FLAG")
    private String ggwstransFlag;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.ISTRANSSERV type:CHAR len:1 Comments:
     */

    @TableField("ISTRANSSERV")
    private String istransserv;


    /**
     * HYHIS_PC_CL_DATA_RECIPE.DRIPNOTE type:VARCHAR2 len:200 Comments:
     */

    @TableField("DRIPNOTE")
    private String dripnote;

    public PcClrecipeFO() {

    	isherfry = "0";
		isrequisition = "0";
		ismanual = "0";
		ismain = "1";
		isspecial = "0";
		ischarge = "0";
		isaccount = "0";
        isdelete = "0";
        isupload = "0";
        isprioritypack = "0";
        issubsequentvisit = "0";
		isselfpayrecipe = "0";
		isreject = "0";

    }

}