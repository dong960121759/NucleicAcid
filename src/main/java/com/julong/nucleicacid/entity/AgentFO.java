package com.julong.nucleicacid.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName( "MA_AGENT")
public class AgentFO implements Serializable{

	@TableId("OID" )
	private Long oid;

	/**
	 * 访问类型
	 */
	@TableId("ENCOUNTERTYPE" )
	private Long encounterType;

	/**
	 * 医嘱项ID
	 */
	@TableField("ITEMID" )
	private Long itemID;

	/**
	 * 代发地点
	 */
	@TableField("DEPTID" )
	private Long deptID;



}
