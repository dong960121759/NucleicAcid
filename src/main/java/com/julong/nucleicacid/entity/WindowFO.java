/*
 * Created on 2006-07-19
 */
package com.julong.nucleicacid.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
@TableName( "Om_Window")
public class WindowFO extends Model<WindowFO> implements Serializable
{

	/**
	 窗口ID 
	 */

	@TableId("WINID" )
	private Long winID;

	/**
	 窗口代码	
	 */
	@TableField("WINCODE" )
	private String winCode;

	/**
	 窗口名称
	 */
	@TableField("WINNAME" )
	private String winName;

	/**
	 窗口类型	(dicttype=60,lovid = 138)
	 1 挂号窗口 2 收费窗口 3 配药窗口 4 发药窗口 5 配发药窗口
	 */
	@TableField("WINTYPE" )
	private Long winType;

	/**
	 窗口状态(dicttype=61,lovid = 139)
	 1 工作 2 挂起 3 关闭
	 */
	@TableField("WINSTATUS" )
	private Long winStatus;

	/**
	 地点
	 */
	@TableField("ADDRESS" )
	private String address;

	/**
	 医院代码
	 */
	@TableField("HOSID" )
	private Long hosID;

	/**
	 * 所属药房	
	 */
	@TableField("DEPTID" )
	private Long deptID;

	/**
	 * 优先窗口
	 */
	@TableField("ISFIRST" )
	private Boolean isFirst;

	/**
	 * 儿科窗口
	 */
	@TableField("ISCHILD" )
	private Boolean isChild;

	/**
	 删除标识
	 */
	@TableField("ISDELETE" )
	private Boolean isDelete;


	/**
	 * 版本号
	 */
	@TableField("VERSIONID" )
	private Date versionID;


	public WindowFO()
	{

	}


}
