package com.julong.nucleicacid.service;

import com.julong.nucleicacid.model.*;
import org.springframework.stereotype.Service;

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

    /**
     * 1.2核酸检测预约项目类型
     * 接口代码	cstmr.nucleic.getItem
     * 说明	通过调用该接口获取可预约的核酸检测项目类型（有部分医院多类项目，不同价钱）
     * @param getItemIn
     * @return
     */
    GetItemOut<GetItemOutSet> nucleicGetItem(GetItemIn getItemIn);

    /**
     * 1.4核酸检测预约下单
     * 接口代码	cstmr. nucleic.addOrder
     * 说明	通过调用该接口预约申请核酸检测项目开单
     * @param addOrderIn
     * @return
     */
    AddOrderOut nucleicAddOrder(AddOrderIn addOrderIn);


    /**
     * 2.2.3.1 待缴费记录查询
     * 接口代码	outpatient.getPayInfo
     * 说明	通过调用该接口获取患者的待缴费就诊记录
     */
    ResultOut<GetPayInfoOutSet> getPayInfo(GetPayInfoIn getPayInfoIn);
    /**
     * 2.2.3.2 获取待缴费用信息
     * 接口代码	outpatient.getPaybillfee
     * 说明	可以通过调用本接口获取某次就诊中指定处方的待缴费费用信息
     */
    GetPaybillfeeOut getPaybillfee(GetPaybillfeeIn getPaybillfeeIn);
    /**
     * 2.2.3.3 待缴费记录支付
     * 接口代码	outpatient.pay
     * 说明	通过调用本接口，将门诊处方的支付结果同步到HIS，并且执行相应的收费逻辑处理。
     */
    PayOut pay(PayIn payIn);
    /**
     * 2.2.3.4 已缴费记录查询
     * 接口代码	outpatient.getCompletedPayInfo
     * 说明	通过调用本接口获取用户已缴费记录。
     */
    ResultOut<GetCompletedPayInfoOutSet> getCompletedPayInfo(GetCompletedPayInfoIn getCompletedPayInfoIn);
    /**
     * 2.2.3.5 已缴费记录明细查询
     * 接口代码	outpatient.getCompletedPayDetailInfo
     * 说明	通过调用该接口获取用户已缴费记录的详细信息。
     */
    GetCompletedPayDetailInfoOut getCompletedPayDetailInfo(GetCompletedPayDetailInfoIn getCompletedPayDetailInfoIn);
}
