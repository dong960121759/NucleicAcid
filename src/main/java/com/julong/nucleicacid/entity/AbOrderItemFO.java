package com.julong.nucleicacid.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName("AB_ORDERITEM")
public class AbOrderItemFO  extends Model<AbOrderItemFO> {
    public AbOrderItemFO() {

    }

    /**
     * HYHIS_AB_ORDERITEM.ITEMID type:NUMBER len:22 scale:0  Comments:
     */
    @TableId("ITEMID")
    private Long itemid;

    /**
     * HYHIS_AB_ORDERITEM.ITEMCODE type:VARCHAR2 len:20 Comments:
     */

    @TableField("ITEMCODE")
    private String itemcode;


    /**
     * HYHIS_AB_ORDERITEM.ITEMNAME type:VARCHAR2 len:200 Comments:
     */

    @TableField("ITEMNAME")
    private String itemname;


    /**
     * HYHIS_AB_ORDERITEM.STANDARD type:VARCHAR2 len:100 Comments:
     */

    @TableField("STANDARD")
    private String standard;


    /**
     * HYHIS_AB_ORDERITEM.PYCODE type:VARCHAR2 len:8 Comments:
     */

    @TableField("PYCODE")
    private String pycode;


    /**
     * HYHIS_AB_ORDERITEM.WBCODE type:VARCHAR2 len:8 Comments:
     */

    @TableField("WBCODE")
    private String wbcode;


    /**
     * HYHIS_AB_ORDERITEM.GBCODE type:VARCHAR2 len:20 Comments:
     */

    @TableField("GBCODE")
    private String gbcode;


    /**
     * HYHIS_AB_ORDERITEM.BEGINDATE type:DATE len:7 Comments:
     */

    @TableField("BEGINDATE")
    private Date begindate;


    /**
     * HYHIS_AB_ORDERITEM.ENDDATE type:DATE len:7 Comments:
     */

    @TableField("ENDDATE")
    private Date enddate;


    /**
     * HYHIS_AB_ORDERITEM.UNITID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("UNITID")
    private Long unitid;


    /**
     * HYHIS_AB_ORDERITEM.PRICE type:NUMBER len:22 scale:4  Comments:
     */

    @TableField("PRICE")
    private BigDecimal price;


    /**
     * HYHIS_AB_ORDERITEM.CATALOGID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("CATALOGID")
    private Long catalogid;


    /**
     * HYHIS_AB_ORDERITEM.PRIORID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("PRIORID")
    private Long priorid;


    /**
     * HYHIS_AB_ORDERITEM.TEMPLATEID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("TEMPLATEID")
    private Long templateid;


    /**
     * HYHIS_AB_ORDERITEM.ISDRUGITEM type:CHAR len:1 Comments:
     */

    @TableField("ISDRUGITEM")
    private String isdrugitem;


    /**
     * HYHIS_AB_ORDERITEM.DRUGITEMID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("DRUGITEMID")
    private Long drugitemid;


    /**
     * HYHIS_AB_ORDERITEM.ISSTUFFITEM type:CHAR len:1 Comments:
     */

    @TableField("ISSTUFFITEM")
    private String isstuffitem;


    /**
     * HYHIS_AB_ORDERITEM.STUFFITEMID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("STUFFITEMID")
    private Long stuffitemid;


    /**
     * HYHIS_AB_ORDERITEM.ORDERNOTE type:VARCHAR2 len:200 Comments:
     */

    @TableField("ORDERNOTE")
    private String ordernote;


    /**
     * HYHIS_AB_ORDERITEM.BOOKNOTE type:VARCHAR2 len:200 Comments:
     */

    @TableField("BOOKNOTE")
    private String booknote;


    /**
     * HYHIS_AB_ORDERITEM.ISALLOWDUPLICATE type:CHAR len:1 Comments:
     */

    @TableField("ISALLOWDUPLICATE")
    private String isallowduplicate;


    /**
     * HYHIS_AB_ORDERITEM.DUPLICATEDAYS type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("DUPLICATEDAYS")
    private Long duplicatedays;


    /**
     * HYHIS_AB_ORDERITEM.CONSULTDEPTID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("CONSULTDEPTID")
    private Long consultdeptid;


    /**
     * HYHIS_AB_ORDERITEM.FOODCONSISTENCYID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("FOODCONSISTENCYID")
    private Long foodconsistencyid;


    /**
     * HYHIS_AB_ORDERITEM.MEALTIMEID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("MEALTIMEID")
    private Long mealtimeid;


    /**
     * HYHIS_AB_ORDERITEM.SERVICEGROUPID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("SERVICEGROUPID")
    private Long servicegroupid;


    /**
     * HYHIS_AB_ORDERITEM.CONSISTTIME type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("CONSISTTIME")
    private Long consisttime;


    /**
     * HYHIS_AB_ORDERITEM.CASEDAYS type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("CASEDAYS")
    private Long casedays;


    /**
     * HYHIS_AB_ORDERITEM.ISCLITEM type:CHAR len:1 Comments:
     */

    @TableField("ISCLITEM")
    private String isclitem;


    /**
     * HYHIS_AB_ORDERITEM.CLCATALOGID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("CLCATALOGID")
    private Long clcatalogid;


    /**
     * HYHIS_AB_ORDERITEM.ISIPITEM type:CHAR len:1 Comments:
     */

    @TableField("ISIPITEM")
    private String isipitem;


    /**
     * HYHIS_AB_ORDERITEM.IPCATALOGID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("IPCATALOGID")
    private Long ipcatalogid;


    /**
     * HYHIS_AB_ORDERITEM.SOURCEID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("SOURCEID")
    private Long sourceid;


    /**
     * HYHIS_AB_ORDERITEM.FICATALOGID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("FICATALOGID")
    private Long ficatalogid;


    /**
     * HYHIS_AB_ORDERITEM.SERVICEID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("SERVICEID")
    private Long serviceid;


    /**
     * HYHIS_AB_ORDERITEM.ISALLOWPARTCHARGE type:CHAR len:1 Comments:
     */

    @TableField("ISALLOWPARTCHARGE")
    private String isallowpartcharge;


    /**
     * HYHIS_AB_ORDERITEM.ISDELETE type:CHAR len:1 Comments:
     */

    @TableField("ISDELETE")
    private String isdelete;


    /**
     * HYHIS_AB_ORDERITEM.VERSIONID type:TIMESTAMP(6) len:11 Comments:
     */

    @TableField("VERSIONID")
    private Date versionid;


    /**
     * HYHIS_AB_ORDERITEM.CLINVOICECATAID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("CLINVOICECATAID")
    private Long clinvoicecataid;


    /**
     * HYHIS_AB_ORDERITEM.IPINVOICECATAID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("IPINVOICECATAID")
    private Long ipinvoicecataid;


    /**
     * HYHIS_AB_ORDERITEM.MUTEXTYPE type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("MUTEXTYPE")
    private Long mutextype;


    /**
     * HYHIS_AB_ORDERITEM.CLUNITID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("CLUNITID")
    private Long clunitid;


    /**
     * HYHIS_AB_ORDERITEM.CLPRICE type:NUMBER len:22 scale:4  Comments:
     */

    @TableField("CLPRICE")
    private BigDecimal clprice;


    /**
     * HYHIS_AB_ORDERITEM.MDUNITID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("MDUNITID")
    private Long mdunitid;


    /**
     * HYHIS_AB_ORDERITEM.MDPRICE type:NUMBER len:22 scale:4  Comments:
     */

    @TableField("MDPRICE")
    private BigDecimal mdprice;


    /**
     * HYHIS_AB_ORDERITEM.ITEM_CLS type:CHAR len:1 Comments:
     */

    @TableField("ITEM_CLS")
    private String itemCls;


    /**
     * HYHIS_AB_ORDERITEM.ISAPPLICABILITY type:CHAR len:1 Comments:
     */

    @TableField("ISAPPLICABILITY")
    private String isapplicability;


    /**
     * HYHIS_AB_ORDERITEM.APPLICABILITYNOTE type:VARCHAR2 len:500 Comments:
     */

    @TableField("APPLICABILITYNOTE")
    private String applicabilitynote;


    /**
     * HYHIS_AB_ORDERITEM.MUTEXNOTE type:VARCHAR2 len:100 Comments:
     */

    @TableField("MUTEXNOTE")
    private String mutexnote;


    /**
     * HYHIS_AB_ORDERITEM.CHARGECLS type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("CHARGECLS")
    private Long chargecls;


    /**
     * HYHIS_AB_ORDERITEM.GGWSITEMID type:NUMBER len:22 scale:0  Comments:
     */

    @TableField("GGWSITEMID")
    private Long ggwsitemid;


    /**
     * HYHIS_AB_ORDERITEM.ISFAIRPRICE type:CHAR len:1 Comments:
     */

    @TableField("ISFAIRPRICE")
    private String isfairprice;


    /**
     * HYHIS_AB_ORDERITEM.IMMCLPRICE type:NUMBER len:22 scale:4  Comments:
     */

    @TableField("IMMCLPRICE")
    private BigDecimal immclprice;


    /**
     * HYHIS_AB_ORDERITEM.IMMIPPRICE type:NUMBER len:22 scale:4  Comments:
     */

    @TableField("IMMIPPRICE")
    private BigDecimal immipprice;


    /**
     * HYHIS_AB_ORDERITEM.IMMMDPRICE type:NUMBER len:22 scale:4  Comments:
     */

    @TableField("IMMMDPRICE")
    private BigDecimal immmdprice;


    /**
     * HYHIS_AB_ORDERITEM.ISCLSHOW type:CHAR len:1 Comments:
     */

    @TableField("ISCLSHOW")
    private String isclshow;


    /**
     * HYHIS_AB_ORDERITEM.ISIPSHOW type:CHAR len:1 Comments:
     */

    @TableField("ISIPSHOW")
    private String isipshow;


    /**
     * HYHIS_AB_ORDERITEM.ISSPECIALSERVICE type:CHAR len:1 Comments:
     */

    @TableField("ISSPECIALSERVICE")
    private String isspecialservice;


    /**
     * HYHIS_AB_ORDERITEM.ISCHILDPLUS type:CHAR len:1 Comments:
     */

    @TableField("ISCHILDPLUS")
    private String ischildplus;


    /**
     * HYHIS_AB_ORDERITEM.CHILDPLUSPRICE type:NUMBER len:22 scale:4  Comments:
     */

    @TableField("CHILDPLUSPRICE")
    private BigDecimal childplusprice;


}