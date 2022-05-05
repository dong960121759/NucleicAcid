package com.julong.nucleicacid.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author Administrator
 */
@Data
@TableName( "sm_nogenerator")
public class GeneratorNoFO  extends Model<GeneratorNoFO> implements Serializable{
	/**
	 * Oid 
	 */
	@TableId("oid")
	private Long oid;
	/**
	 * 类型	dicttype = 904
	 */
	@TableField( "noType" )
	private Long noType;
	/**
	 * 当前号
	 */
	@TableField( "currentNo" )
	private Long currentNo;
	/**
	 * 号长度（号格式化长度）
	 */
	@TableField( "noLength" )
	private Long noLength;
	/**
	 * 前缀
	 */
	@TableField( "prefix" )
	private String prefix;

	/**
	 * 版本号
	 */
	@TableField( "VERSIONID" )
	private Date versionID;
}
