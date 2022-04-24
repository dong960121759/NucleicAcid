package com.julong.nucleicacid.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @className: GetItemOutSet
 * @date: 2022/1/10 15:23
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "feeInfo")
public class GetScheduleInfo {
    /**deptId	scheduleInfo	String	是	科室代码*/
    private String deptId;
    /**deptName	scheduleInfo	String	是	科室名称*/
    private String deptName;
    /**roomAddress	scheduleInfo	String	否	出诊位置*/
    private String roomAddress;
    /**clinicUnitName	scheduleInfo	String	否	诊疗单元名称*/
    private String clinicUnitName;
    /**clinicUnitId	scheduleInfo	String	否	诊疗单元代码*/
    private String clinicUnitId;
    /**regDate	scheduleInfo	String	是	出诊日期，格式：YYYY-MM-DD*/
    private String regDate;
    /**shiftCode	scheduleInfo	String	是	班别代码*/
    private String shiftCode;
    /**shiftName	scheduleInfo	String	是	班别名称，如上午、下午*/
    private String shiftName;
    /**startTime	scheduleInfo	String	否	班别开始时间，格式：HH:MI*/
    private String startTime;
    /**endTime	scheduleInfo	String	否	班别结束时间，格式：HH:MI*/
    private String endTime;
    /**scheduleId	scheduleInfo	String	否	排班号*/
    private String scheduleId;
    /**regStatus	scheduleInfo	String	是	出诊状态
     * 0-停诊
     * 1-出诊
     * 2-暂未开放
     * */
    private String regStatus;
    /**regTotalCount	scheduleInfo	String	是	该时段可预约的总号源数*/
    private String regTotalCount;
    /**regLeaveCount	scheduleInfo	String	是	该时段剩余号源数*/
    private String regLeaveCount;
    /**regFee	scheduleInfo	String	是	挂号费(单位“分”)*/
    private String regFee;
    /**treatFee	scheduleInfo	String	是	诊疗费(单位“分”)*/
    private String treatFee;
    /**isTimeReg	scheduleInfo	String	是	是否有分时
     * 0-	否
     * 1-	是
     * */
    private String isTimeReg;
    /**hasRegisterType	scheduleInfo	String	否	是否有班别类型选择，空表示否
     *0-否
     *1-是
     * */
    private String hasRegisterType;

}
