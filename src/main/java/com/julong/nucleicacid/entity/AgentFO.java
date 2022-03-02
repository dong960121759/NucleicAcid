package com.julong.nucleicacid.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
 
@Entity
@Table(name = "MA_AGENT")
public class AgentFO implements Serializable{
    @Id
    @GeneratedValue(generator = "idGenerator")	
	@GenericGenerator(name = "idGenerator", strategy = "com.julong.ejbs.HisV60IdGen",
		parameters = { @Parameter(name = "table", value = "SM_OID_GENERATOR") ,@Parameter(name = "objid", value = "MA_AGENT")})	
	 
	@Column(name = "OID" ) 
	private Long oid;
	
	/**
	 * ��������
	 */
	  @Column(name = "ENCOUNTERTYPE" ) 
	private Long encounterType;
	
	/**
	 * ҽ����ID
	 */
	  @Column(name = "ITEMID" ) 
	private Long itemID;
	
	/**
	 * �����ص�
	 */
	  @Column(name = "DEPTID" ) 
	private Long deptID;
	
	
	public Long getOid() {
		return oid;
	}
	/**
	 * @param aOid
	 */
	public void setOid(Long aOid) {
		oid = aOid;
	}
	
	/**
	 * Access method for the encounterType property.
	 * @hibernate.property column="encounterType"
	 * @return   the current value of the encounterType property
	 */
	public Long getEncounterType() {
		return encounterType;
	}
	/**
	 * @param encounterType
	 */
	public void setEncounterType(Long encounterType) {
		this.encounterType = encounterType;
	}
	
	/**
	 * Access method for the itemID property.
	 * @hibernate.property column="itemID"
	 * @return   the current value of the itemID property
	 */
	public Long getItemID() {
		return itemID;
	}
	/**
	 * @param itemID
	 */
	public void setItemID(Long itemID) {
		this.itemID = itemID;
	}
	
	/**
	 * Access method for the deptID property.
	 * @hibernate.property column="deptID"
	 * @return   the current value of the deptID property
	 */
	public Long getDeptID() {
		return deptID;
	}
	/**
	 * @param deptID
	 */
	public void setDeptID(Long deptID) {
		this.deptID = deptID;
	}
}
