/*
 * Created on 2006-07-19
 */
package com.julong.nucleicacid.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;


@Data
@TableName("Om_WindowLink")
public class WindowLinkFO implements Serializable {


	@TableId("OID" )
	private Long Oid;

	@TableField("WINID" )
	private Long winID;


	@TableField("LINKTYPE" )
	private Long linkType;

	@TableField("REGCATAID" )
	private Long regCataID;


	@TableField("REGDEPTID" )
	private Long regDeptID;

	/**
	 * 处方类型(lovid = 140)
	 */
	@TableField("RECTYPE" )
	private Long recType;

	/**
	 * 是否大输液
	 */
	@TableField("ISDRIP" )
	private Boolean isDrip;

	/**
	 * 手写处方标识
	 */
	@TableField("ISWRITE" )
	private Boolean isWrite;

	/**
	 * 可分配窗口(lovid = 170)
	 */
	@TableField("TOWINID" )
	private Long toWinID;

	/**
	 * 发药地点(lovid = 1)
	 */
	@TableField("PHALOCID" )
	private Long phaLocID;

	public WindowLinkFO() {

	}

	
}
