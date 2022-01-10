package com.julong.nucleicacid.dao;

import com.julong.nucleicacid.model.OutpatientInfoIn;
import com.julong.nucleicacid.model.OutpatientInfoOut;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @className: NucleicAcidMapper
 * @date: 2021/11/11 9:21
 */
@Mapper
public interface NucleicAcidMapper {


    void updateGenerator(@Param("fid")String fid);
    Long getGenerator(@Param("fid")String fid);
    /**
     * 2.1.2.1 门诊患者基本信息查询
     * 接口代码	baseinfo.getOutpatientInfo
     * 说明	可以通过本接口查询患者在院内登记的门诊个人基本信息。idCardNo、healthCardNo、patientId不能同时为空。
     * @param outpatientInfoIn
     * @return
     */
    OutpatientInfoOut getOutpatientInfo(OutpatientInfoIn outpatientInfoIn);
}
