package com.julong.nucleicacid.entity;

import lombok.Data;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "item")
@Data
public class RecentryItem {

	/**
	 * 病人id
	 */
	private Long patientID ;

	/**
	 * 总金额 ：各明细项目金额的汇总
	 */
	private BigDecimal amountAll  ;
	/**
	 * 结算标志
	 */
	private String isCharge  ;
	/**
	 * 有效标志
	 */
	private String isDelete  ;

	/**
	 * 项目编码
	 */
	private String fitemcode  ;

	/**
	 * 项目名称
	 */
	private String fitemname  ;

	/**
	 * 类别
	 */
	private String ftypecode  ;

	/**
	 * 规格
	 */
	private String std  ;

	/**
	 * 单位
	 */
	private String faunitname  ;

	/**
	 * 单价
	 */
	private BigDecimal fprice  ;

	/**
	 * 数量
	 */
	private BigDecimal famount  ;

	/**
	 * 金额
	 */
	private BigDecimal fsum  ;

	/**
	 * ??
	 */
	private String fisappend  ;

	/**
	 * ??
	 */
	private String ffjf  ;

	/**
	 * 执行地点
	 */
	private Long executeDept;

	/**
	 * 处方类型
	 */
	private Long entryType;

}
