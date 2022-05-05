package com.julong.nucleicacid.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;



@Data
@TableName("PC_CL_DATA_RECIPEENTRY")
public class ClRecentryFO  extends Model<ClRecentryFO> implements Serializable {

    public ClRecentryFO() {
        isupload = "0";
        istransserv = "0";
        isconfirm = "1";


        isrequireresult = "0";
        isarrange = "0";
        isreport = "0";
        isexecute = "0";
        isrequireaudit = "0";
        isselfpay = "1";
        isbaby = "0";
        isemergency = "0";
        isoperation = "0";
        isapplicability = "0";

        isaudit = "0";

        versionid = Calendar.getInstance().getTime();


    }

    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ENTRYID type:NUMBER len:22 scale:0  Comments:
     */

    @TableId("ENTRYID")
    private Long entryid;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ENTRYTYPE type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("ENTRYTYPE")
    private Long entrytype;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.RECIPEID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("RECIPEID")
    private Long recipeid;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.GROUPNO type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("GROUPNO")
    private Long groupno;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ROWNO type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("ROWNO")
    private Long rowno;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ROWSTATUS type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("ROWSTATUS")
    private Long rowstatus;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ISITEM type:CHAR len:1 Comments:
     */

    @TableField("ISITEM")
    private String isitem;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ALIASID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("ALIASID")
    private Long aliasid;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ITEMID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("ITEMID")
    private Long itemid;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ISDISPLAY type:CHAR len:1 Comments:
     */

    @TableField("ISDISPLAY")
    private String isdisplay;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ISCHARGE type:CHAR len:1 Comments:
     */

    @TableField("ISCHARGE")
    private String ischarge;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ISCONFIRM type:CHAR len:1 Comments:
     */

    @TableField("ISCONFIRM")
    private String isconfirm;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.CONFIRMOPER type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("CONFIRMOPER")
    private Long confirmoper;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.CONFIRMTIME type:DATE len:7 Comments:
     */

    @TableField("CONFIRMTIME")
    private Date confirmtime;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.DOSAGE type:NUMBER len:22 scale:4  Comments:
     */

    @TableField("DOSAGE")
    private BigDecimal dosage;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.DIRECTIONID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("DIRECTIONID")
    private Long directionid;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.FREQUENCYID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("FREQUENCYID")
    private Long frequencyid;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.FRYID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("FRYID")
    private Long fryid;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.DAYS type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("DAYS")
    private Long days;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.QUANTITY type:NUMBER len:22 scale:2  Comments:
     */

    @TableField("QUANTITY")
    private BigDecimal quantity;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.UNITID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("UNITID")
    private Long unitid;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.TOTAL type:NUMBER len:22 scale:2  Comments:
     */

    @TableField("TOTAL")
    private BigDecimal total;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.PRICE type:NUMBER len:22 scale:4  Comments:
     */

    @TableField("PRICE")
    private BigDecimal price;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.DISCOUNTRATE type:NUMBER len:22 scale:4  Comments:
     */

    @TableField("DISCOUNTRATE")
    private BigDecimal discountrate;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.AMOUNT type:NUMBER len:22 scale:2  Comments:
     */

    @TableField("AMOUNT")
    private BigDecimal amount;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ACTUALAMOUNT type:NUMBER len:22 scale:2  Comments:
     */

    @TableField("ACTUALAMOUNT")
    private BigDecimal actualamount;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ISREQUIRETEST type:CHAR len:1 Comments:
     */

    @TableField("ISREQUIRETEST")
    private String isrequiretest;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ISEXEMPTTEST type:CHAR len:1 Comments:
     */

    @TableField("ISEXEMPTTEST")
    private String isexempttest;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ISTESTED type:CHAR len:1 Comments:
     */

    @TableField("ISTESTED")
    private String istested;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.TESTRESULTID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("TESTRESULTID")
    private Long testresultid;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ISREQUIREBLOOD type:CHAR len:1 Comments:
     */

    @TableField("ISREQUIREBLOOD")
    private String isrequireblood;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ITEMSOURCE type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("ITEMSOURCE")
    private Long itemsource;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ISFIRSTDOUBLE type:CHAR len:1 Comments:
     */

    @TableField("ISFIRSTDOUBLE")
    private String isfirstdouble;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ISPROVIDE type:CHAR len:1 Comments:
     */

    @TableField("ISPROVIDE")
    private String isprovide;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ISTAKE type:CHAR len:1 Comments:
     */

    @TableField("ISTAKE")
    private String istake;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ISSOLVENT type:CHAR len:1 Comments:
     */

    @TableField("ISSOLVENT")
    private String issolvent;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.INJECTNEEDLE type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("INJECTNEEDLE")
    private Long injectneedle;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.INJECTPOS type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("INJECTPOS")
    private Long injectpos;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.INJECTINTERVAL type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("INJECTINTERVAL")
    private Long injectinterval;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.DRIPRATE type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("DRIPRATE")
    private Long driprate;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.SPEEDID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("SPEEDID")
    private Long speedid;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.DENTALPOSID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("DENTALPOSID")
    private Long dentalposid;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.DENTALNO type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("DENTALNO")
    private Long dentalno;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ROOMID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("ROOMID")
    private Long roomid;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.SPECIMENID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("SPECIMENID")
    private Long specimenid;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.SPECIMENNO type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("SPECIMENNO")
    private Long specimenno;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.REQUISITIONTIME type:DATE len:7 Comments:
     */

    @TableField("REQUISITIONTIME")
    private Date requisitiontime;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ISREQUIRERESULT type:CHAR len:1 Comments:
     */

    @TableField("ISREQUIRERESULT")
    private String isrequireresult;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ISARRANGE type:CHAR len:1 Comments:
     */

    @TableField("ISARRANGE")
    private String isarrange;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ARRANGEID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("ARRANGEID")
    private Long arrangeid;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ISEXECUTE type:CHAR len:1 Comments:
     */

    @TableField("ISEXECUTE")
    private String isexecute;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.EXEUTEDEPT type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("EXEUTEDEPT")
    private Long exeutedept;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.EXECUTERES type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("EXECUTERES")
    private Long executeres;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.EXECUTEOPER type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("EXECUTEOPER")
    private Long executeoper;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.EXECUTETIME type:DATE len:7 Comments:
     */

    @TableField("EXECUTETIME")
    private Date executetime;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.RESULTTYPE type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("RESULTTYPE")
    private Long resulttype;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ISREPORT type:CHAR len:1 Comments:
     */

    @TableField("ISREPORT")
    private String isreport;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.REPORTTIME type:DATE len:7 Comments:
     */

    @TableField("REPORTTIME")
    private Date reporttime;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.RESULTID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("RESULTID")
    private Long resultid;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ISREQUIREAUDIT type:CHAR len:1 Comments:
     */

    @TableField("ISREQUIREAUDIT")
    private String isrequireaudit;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ISSELFPAY type:CHAR len:1 Comments:
     */

    @TableField("ISSELFPAY")
    private String isselfpay;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ISBABY type:CHAR len:1 Comments:
     */

    @TableField("ISBABY")
    private String isbaby;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ISEMERGENCY type:CHAR len:1 Comments:
     */

    @TableField("ISEMERGENCY")
    private String isemergency;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ISOPERATION type:CHAR len:1 Comments:
     */

    @TableField("ISOPERATION")
    private String isoperation;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ISAPPLICABILITY type:CHAR len:1 Comments:
     */

    @TableField("ISAPPLICABILITY")
    private String isapplicability;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.NOTE type:VARCHAR2 len:100 Comments:
     */

    @TableField("NOTE")
    private String note;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ISAUDIT type:CHAR len:1 Comments:
     */

    @TableField("ISAUDIT")
    private String isaudit;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.AUDITOPER type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("AUDITOPER")
    private Long auditoper;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.AUDITTIME type:DATE len:7 Comments:
     */

    @TableField("AUDITTIME")
    private Date audittime;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.RELENTRYID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("RELENTRYID")
    private Long relentryid;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.WORKFLOWID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("WORKFLOWID")
    private Long workflowid;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ISUPLOAD type:CHAR len:1 Comments:
     */

    @TableField("ISUPLOAD")
    private String isupload;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.VERSIONID type:TIMESTAMP(6) len:11 Comments:
     */

    @TableField("VERSIONID")
    private Date versionid;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.INJECTDAYS type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("INJECTDAYS")
    private Long injectdays;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.FREQNOTEID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("FREQNOTEID")
    private Long freqnoteid;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ISREJECT type:CHAR len:1 Comments:
     */

    @TableField("ISREJECT")
    private String isreject;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ISMILL type:CHAR len:1 Comments:
     */

    @TableField("ISMILL")
    private String ismill;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.NWARN type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("NWARN")
    private Long nwarn;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.ISTRANSSERV type:CHAR len:1 Comments:
     */

    @TableField("ISTRANSSERV")
    private String istransserv;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.IMMPRICE type:NUMBER len:22 scale:4  Comments:
     */

    @TableField("IMMPRICE")
    private BigDecimal immprice;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.IMMAMOUNT type:NUMBER len:22 scale:2  Comments:
     */

    @TableField("IMMAMOUNT")
    private BigDecimal immamount;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.QUANUNITID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("QUANUNITID")
    private Long quanunitid;


    /**
     * HYHIS_PC_CL_DATA_RECIPEENTRY.INPUTTIME type:DATE len:7 Comments:
     */

    @TableField("INPUTTIME")
    private Date inputtime;


}