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

    List<RecentryItem> getRecentry(@Param("oneRecNo")long oneRecNo);

    List<String> getRecipsbyEncounterID(List<Long> recNoListLong);

    List<ClRecentryFO> getClRecentryFOs(List<Long> oneDrRecsList);

    List<ClChrgentryFO> mzCalculateClChrgentryFOs(List<Long> oneDrRecsList);

    List<ClInvoentryFO> mzCalculateClInvoentryFOs(List<Long> oneDrRecsList);

    List<LisRequestFO> getLisRequest(List<Long> oneDrRecsList);
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
    /*
     * 取药口配药优先级
     * */
    String getDrugisPriortyPack(@Param("itemid")Long itemid);
}
