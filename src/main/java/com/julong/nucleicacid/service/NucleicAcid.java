package com.julong.nucleicacid.service;

import com.julong.nucleicacid.model.CreateNewPatientIn;
import com.julong.nucleicacid.model.CreateNewPatientOut;
import com.julong.nucleicacid.model.OutpatientInfoIn;
import com.julong.nucleicacid.model.OutpatientInfoOut;
import org.springframework.stereotype.Service;

import java.io.OutputStream;

/**
 * @className: NucleicAcid 核酸预约接口
 * @date: 2021/11/11 9:19
 */
@Service
public interface NucleicAcid {
    /**
     * 2.1.2.1 门诊患者基本信息查询
     * 接口代码	baseinfo.getOutpatientInfo
     * 说明	可以通过本接口查询患者在院内登记的门诊个人基本信息。idCardNo、healthCardNo、patientId不能同时为空。
     * @param outpatientInfoIn
     * @return
     */
    OutpatientInfoOut getOutpatientInfo(OutpatientInfoIn outpatientInfoIn);

    /**
     * 2.2.4.1 在线建卡
     * 接口代码	user.createNewPatient
     * 说明	可以通过本接口在HIS系统中创建新的患者档案
     */
    CreateNewPatientOut createNewPatient(CreateNewPatientIn createNewPatientIn);
}
