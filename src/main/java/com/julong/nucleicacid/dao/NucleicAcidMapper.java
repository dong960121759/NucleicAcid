package com.julong.nucleicacid.dao;

import com.julong.nucleicacid.entity.*;
import com.julong.nucleicacid.model.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * @className: NucleicAcidMapper
 * @date: 2021/11/11 9:21
 */
@Mapper
public interface NucleicAcidMapper {


    /**
     * /**
     * 	 * 生成卡号
     *
     * @param noType
     */
    String getGeneratorNo(@Param("noType")Long noType);
    /**
     * 2.1.2.1 门诊患者基本信息查询
     * 接口代码	baseinfo.getOutpatientInfo
     * 说明	可以通过本接口查询患者在院内登记的门诊个人基本信息。idCardNo、healthCardNo、patientId不能同时为空。
     * @param outpatientInfoIn
     * @return
     */
    OutpatientInfoOut getOutpatientInfo(OutpatientInfoIn outpatientInfoIn);
    /**
     * 1.2核酸检测预约项目类型
     * 接口代码	cstmr.nucleic.getItem
     * 说明	通过调用该接口获取可预约的核酸检测项目类型（有部分医院多类项目，不同价钱）
     * @param groupId
     * @return
     */
    List<GetItemOutSet> nucleicGetItem(@Param("groupId")Long groupId);

    /**
     * 根据组号获得项目id列表
     * @param groupId
     * @return
     */
    List<Long> getGroupItems(@Param("groupId")Long groupId) ;

    /**
     * 获得单价
     * @param groupId
     * @return
     */
    BigDecimal getGroupUnitPrice(@Param("groupId")Long groupId) ;

    /**
     * 获得金额
     * @param groupId
     * @return
     */
     BigDecimal getGroupAmount(@Param("groupId")Long groupId) ;
     Long getOrderItemPretype(@Param("itemId")Long itemId) ;

     List<UnChrgRecipeFO> getUnChrgRecipeFO(@Param("cardNo")String cardNo, @Param("limitDay")Long limitDay, @Param("beginDate")String beginDate, @Param("endDate")String endDate);


    /**
     * 2.2.3.1 待缴费记录查询
     * 接口代码	outpatient.getPayInfo
     * 说明	通过调用该接口获取患者的待缴费就诊记录
     */
    List<GetPayInfoOutSet> getPayInfo(@Param("cardNo")String cardNo, @Param("limitDay")Long limitDay, @Param("beginDate")String beginDate, @Param("endDate")String endDate);


    /**
     * 2.2.3.2 获取待缴费用信息
     * 接口代码	outpatient.getPaybillfee
     * 说明	可以通过调用本接口获取某次就诊中指定处方的待缴费费用信息
     */

    GetPaybillfeeOut getPaybillfee(List<Long> recNos);

    /**
     * 获取处方信息
     * @param recIds
     * @return
     */
    List<UnChrgRecipeBillFO> getRecipsbyRecIds(@Param("recIds")List<Long> recIds);
    /**
     * 跟据处方号取可处方明细
     * @param oneRecNo 处方号
     * @return
     */
    List<RecentryItem> getRecentry(@Param("oneRecNo")long oneRecNo);

    List<String> getRecipsbyEncounterID(@Param("recNoListLong")List<Long> recNoListLong);

    List<ClRecentryFO> getClRecentryFOs(@Param("oneDrRecsList")List<Long> oneDrRecsList);

    List<ClChrgentryFO> mzCalculateClChrgentryFOs(@Param("oneDrRecsList")List<Long> oneDrRecsList);

    List<ClInvoentryFO> mzCalculateClInvoentryFOs(@Param("oneDrRecsList")List<Long> oneDrRecsList);

    List<LisRequestFO> getLisRequest(@Param("oneDrRecsList")List<Long> oneDrRecsList);
    /**
     * 用SQL 来判断 是否需要配药 1

     * @return
     */
    Long getNeedDispMed1(@Param("recipeId")Long recipeId);

    /**
     * 用SQL 来判断 是否需要配药 2
     * @return
     */
    Long getNeedDispMed2(@Param("recipeId")Long cfid);
    /**
     * 取药口配药优先级
     * */
    String getDrugisPriortyPack(@Param("itemid")Long itemid);
    /**
     *  取非药品代发地点
     * */
    AgentFO getAgentFO(@Param("encounterType")Long encounterType, @Param("itemID")Long itemID);
    /**
     * 获取门诊候药队列 候药状态为 1、已接受 或 2、已打印 返回包含PharmacyQueueFO的List
     *
     * 按照queueTime排序
     */
    List<ClMdqueueFO> getPharmacyQueueFOs(@Param("winID")Long winID);
    /**
     * 2.2.3.4 已缴费记录查询
     * 接口代码	outpatient.getCompletedPayInfo
     * 说明	通过调用本接口获取用户已缴费记录。
     *
     */
    List<GetCompletedPayInfoOutSet> getCompletedPayInfo(GetCompletedPayInfoIn getCompletedPayInfoIn);
    /**
     * 2.2.3.5 已缴费记录明细查询
     * 接口代码	outpatient.getCompletedPayDetailInfo
     * 说明	通过调用该接口获取用户已缴费记录的详细信息。
     *
     */
    GetCompletedPayDetailInfoOut getCompletedPayDetailInfo(GetCompletedPayDetailInfoIn getCompletedPayDetailInfoIn);
    /**
     * 2.1.1.2 获取医生信息接口
     * <p>
     * 接口代码	hospital.getDoctorInfo
     * 说明	通过调用该接口获取指定分院指定条件的医生信息。
     * deptId或doctorId不为空时，查询指定的医生列表信息；
     * deptId和doctorId均为空时，查询全部医生列表信息；
     *
     * @param xmlToPojo
     * @return
     */
    List<GetDoctorInfoOutSet> getDoctorInfo(GetDoctorInfoIn xmlToPojo);
    /**
     * 2.1.1.1 获取医院科室信息接口
     * 接口代码	hospital.getDeptInfo
     * 说明	通过本接口获取医院指定分院指定条件的科室列表
     * deptId或deptType不为空时，查询指定的科室列表信息；
     * deptId和deptType均为空时，查询全部科室列表信息；
     *
     * @param xmlToPojo
     * @return
     */
    List<GetDeptInfoOutSet> getDeptInfo(GetDeptInfoIn xmlToPojo);

    /**
     * 2.2.5.1 挂号记录查询
     * 接口代码	support.getRegisterInfo
     * 说明	可通过调用本接口查询某个指定条件的挂号记录，查询条件不能同时为空，至少要传入一个
     * 注意事项：
     * 1.支持代其他渠道支付挂号费用，新增出参：registerType，paySatus，orderTypeNam，payFee等。
     * 2.如需代付，必须返回的节点包括：hospitalId，regDate，shiftCode，shiftName，bookingNo，orderType，orderTypeName，payStatus，regFee，treatFee，payFee以及医生排班的参数等。
     * 3.请求入参如果只有healthCardNo和patientId，则返回该病人有效的挂号记录，如果传入bookingNo或者orderId或者clinicSeq，则只返回对应的挂号记录
     *
     * @param registerInfoIn
     * @return
     */
    List<GetRegisterInfoOutSet> getRegisterInfoIn(GetRegisterInfoIn registerInfoIn);
    /**
     * 2.2.1.1 门诊出诊科室信息查询
     * 接口代码	appointment.getDeptInfo
     * 说明	通过本接口获取指定日期范围内的门诊可预约科室列表信息。
     * deptId和deptType不会同时传值
     * deptId或deptType不为空时，查询指定的科室列表信息；
     * deptId和deptType均为空时，查询全部科室列表信息；
     * @param getDeptInfoIn
     * @return
     */
    List<GetDeptInfoAppOutSet> getDeptInfoApp(GetDeptInfoIn getDeptInfoIn);
    /**
     * 2.2.1.2 医生出诊信息查询
     * <p>
     * 接口代码	appointment.getScheduleInfo
     * 说明	通过本接口获取获取某个科室或者某个医生在某个日期范围内的排班信息以及号源信息。如果传入searchCode，则优先使用searchCode进行搜索；如果searchCode为空，则deptId和doctorId不会同时为空
     *
     * @param scheduleInfoIn
     * @return
     */
    List<GetScheduleInfoOutSet> getScheduleInfo(GetScheduleInfoIn scheduleInfoIn);
}
