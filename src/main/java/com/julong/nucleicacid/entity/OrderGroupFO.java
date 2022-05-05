package com.julong.nucleicacid.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName( "AB_ORDERGROUP")
public class OrderGroupFO  extends Model<OrderGroupFO> {
	public OrderGroupFO(){
	
	}
	 


/**
*AB_ORDERGROUP.GROUPID type:NUMBER len:22 scale:0  Comments: 
*/
@TableId( "GROUPID" )
private  Long groupid ;


/**
*AB_ORDERGROUP.CATALOGID type:NUMBER len:22 scale:0  Comments: 
*/

@TableField( "CATALOGID" ) 
private  Long catalogid ;


/**
*AB_ORDERGROUP.GROUPCODE type:VARCHAR2 len:20 Comments: 
*/

@TableField( "GROUPCODE" )
private  String groupcode ;


/**
*AB_ORDERGROUP.GROUPNAME type:VARCHAR2 len:100 Comments: 
*/

@TableField( "GROUPNAME" ) 
private  String groupname ;


/**
*AB_ORDERGROUP.BEGINDATE type:DATE len:7 Comments: 
*/

@TableField( "BEGINDATE" ) 
private  Date begindate ;


/**
*AB_ORDERGROUP.ENDDATE type:DATE len:7 Comments: 
*/

@TableField( "ENDDATE" ) 
private  Date enddate ;


/**
*AB_ORDERGROUP.ISFIXEDITEM type:CHAR len:1 Comments: 
*/

@TableField( "ISFIXEDITEM" ) 
private  String isfixeditem ;


/**
*AB_ORDERGROUP.ISFIXEDPRICE type:CHAR len:1 Comments: 
*/

@TableField( "ISFIXEDPRICE" ) 
private  String isfixedprice ;


/**
*AB_ORDERGROUP.ISDISPLAYGROUP type:CHAR len:1 Comments: 
*/

@TableField( "ISDISPLAYGROUP" ) 
private  String isdisplaygroup ;


/**
*AB_ORDERGROUP.PYCODE type:VARCHAR2 len:8 Comments: 
*/

@TableField( "PYCODE" ) 
private  String pycode ;


/**
*AB_ORDERGROUP.WBCODE type:VARCHAR2 len:8 Comments: 
*/

@TableField( "WBCODE" ) 
private  String wbcode ;


/**
*AB_ORDERGROUP.PRICE type:NUMBER len:22 scale:4  Comments: 
*/

@TableField( "PRICE" ) 
private  BigDecimal price ;


/**
*AB_ORDERGROUP.SERVICEGROUPID type:NUMBER len:22 scale:0  Comments: 
*/

@TableField( "SERVICEGROUPID" ) 
private  Long servicegroupid ;


/**
*AB_ORDERGROUP.CLCATALOGID type:NUMBER len:22 scale:0  Comments: 
*/

@TableField( "CLCATALOGID" ) 
private  Long clcatalogid ;


/**
*AB_ORDERGROUP.IPCATALOGID type:NUMBER len:22 scale:0  Comments: 
*/

@TableField( "IPCATALOGID" ) 
private  Long ipcatalogid ;


/**
*AB_ORDERGROUP.CLINVOICECATAID type:NUMBER len:22 scale:0  Comments: 
*/

@TableField( "CLINVOICECATAID" ) 
private  Long clinvoicecataid ;


/**
*AB_ORDERGROUP.IPINVOICECATAID type:NUMBER len:22 scale:0  Comments: 
*/

@TableField( "IPINVOICECATAID" ) 
private  Long ipinvoicecataid ;


/**
*AB_ORDERGROUP.ISDELETE type:CHAR len:1 Comments: 
*/

@TableField( "ISDELETE" ) 
private  String isdelete ;


/**
*AB_ORDERGROUP.TYPE type:NUMBER len:22 scale:0  Comments:ģ������:1ȫԺ 2���� 3����
*/

@TableField( "TYPE" ) 
private  Long type ;


/**
*AB_ORDERGROUP.SCOPE type:NUMBER len:22 scale:0  Comments: 
*/

@TableField( "SCOPE" ) 
private  Long scope ;


/**
*AB_ORDERGROUP.DEPTID type:NUMBER len:22 scale:0  Comments: 
*/

@TableField( "DEPTID" ) 
private  Long deptid ;


/**
*AB_ORDERGROUP.DOCID type:NUMBER len:22 scale:0  Comments: 
*/

@TableField( "DOCID" ) 
private  Long docid ;


/**
*AB_ORDERGROUP.NOTE type:VARCHAR2 len:100 Comments:��ע
*/

@TableField( "NOTE" ) 
private  String note ;


/**
*AB_ORDERGROUP.NOTE2 type:NUMBER len:22 scale:0  Comments:��ע2
*/

@TableField( "NOTE2" ) 
private  Long note2 ;

	
}