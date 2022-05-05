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
     * 2.1.1.1 获取医院科室信息接口
     * 接口代码	hospital.getDeptInfo
     * 说明	通过本接口获取医院指定分院指定条件的科室列表
     * deptId或deptType不为空时，查询指定的科室列表信息；
     * deptId和deptType均为空时，查询全部科室列表信息；
     * @param xmlToPojo
     * @return
     */
    ResultOut<GetDeptInfoOutSet> getDeptInfo(GetDeptInfoIn xmlToPojo);
    /**
     * 2.1.1.2 获取医生信息接口
     *
     * 接口代码	hospital.getDoctorInfo
     * 说明	通过调用该接口获取指定分院指定条件的医生信息。
     * deptId或doctorId不为空时，查询指定的医生列表信息；
     * deptId和doctorId均为空时，查询全部医生列表信息；
     * @param xmlToPojo
     * @return
     */
    ResultOut<GetDoctorInfoOutSet> getDoctorInfo(GetDoctorInfoIn xmlToPojo);
    /**
     * 2.1.2.1 门诊患者基本信息查询
     * 接口代码	baseinfo.getOutpatientInfo
     * 说明	可以通过本接口查询患者在院内登记的门诊个人基本信息。idCardNo、healthCardNo、patientId不能同时为空。
     * @param outpatientInfoIn
     * @return
     */
    OutpatientInfoOut getOutpatientInfo(OutpatientInfoIn outpatientInfoIn);
    /**
     * 2.1.2.2 住院患者信息查询
     * 接口	baseinfo.getInpatientInfo
     * 说明	通过本接口查询患者历次住院基本信息。
     * healthCardNo、inpatientId两者不会同时为空，至少会有一个。
     * @param xmlToPojo
     * @return
     */
    ResultOut<InPatientInfoOutSet> getInpatientInfo(InpatientInfoIn xmlToPojo);
    /**
     * 2.2.1.1 门诊出诊科室信息查询
     * 接口代码	appointment.getDeptInfo
     * 说明	通过本接口获取指定日期范围内的门诊可预约科室列表信息。
     * deptId和deptType不会同时传值
     * deptId或deptType不为空时，查询指定的科室列表信息；
     * deptId和deptType均为空时，查询全部科室列表信息；
     * @param xmlToPojo
     * @return
     */
    ResultOut<GetDeptInfoAppOutSet> getDeptInfoApp(GetDeptInfoIn xmlToPojo);
    /**
     * 2.2.1.2 医生出诊信息查询
     *
     * 接口代码	appointment.getScheduleInfo
     * 说明	通过本接口获取获取某个科室或者某个医生在某个日期范围内的排班信息以及号源信息。如果传入searchCode，则优先使用searchCode进行搜索；如果searchCode为空，则deptId和doctorId不会同时为空
     * @param xmlToPojo
     * @return
     */
    ResultOut<GetScheduleInfoOutSet> getScheduleInfo(GetScheduleInfoIn xmlToPojo);
    /**
     * 2.2.4.1 在线建卡
     * 接口代码	user.createNewPatient
     * 说明	可以通过本接口在HIS系统中创建新的患者档案
     */
    CreateNewPatientOut createNewPatient(CreateNewPatientIn createNewPatientIn);

    /**
     * 2.2.5.1 挂号记录查询
     * 接口代码	support.getRegisterInfo
     * 说明	可通过调用本接口查询某个指定条件的挂号记录，查询条件不能同时为空，至少要传入一个
     * 注意事项：
     * 1.支持代其他渠道支付挂号费用，新增出参：registerType，paySatus，orderTypeNam，payFee等。
     * 2.如需代付，必须返回的节点包括：hospitalId，regDate，shiftCode，shiftName，bookingNo，orderType，orderTypeName，payStatus，regFee，treatFee，payFee以及医生排班的参数等。
     * 3.请求入参如果只有healthCardNo和patientId，则返回该病人有效的挂号记录，如果传入bookingNo或者orderId或者clinicSeq，则只返回对应的挂号记录
     * @param xmlToPojo
     * @return
     */
    ResultOut<GetRegisterInfoOutSet> getRegisterInfoIn(GetRegisterInfoIn xmlToPojo);
    /**
     * 1.2核酸检测预约项目类型
     * 接口代码	cstmr.nucleic.getItem
     * 说明	通过调用该接口获取可预约的核酸检测项目类型（有部分医院多类项目，不同价钱）
     * @param getItemIn
     * @return
     */
    GetItemOut nucleicGetItem(GetItemIn getItemIn);

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

    /**
     *2.2.8.1 住院预交金缴纳
     * 接口代码	inpatient.doPrepay
     * 说明	患者在完成支付之后，通过调用本接口完成住院预交金缴纳的业务流程。
     * @param doPrepayIn
     * @return
     */
    DoPrepayOut doPrepay(DoPrepayIn doPrepayIn);

    /**
     * 2.2.8.2 预交金查询
     * 接口	inpatient.getPrepayRecord
     * 说明	通过调用本接口查询患者预交金的有效记录（需考虑预交金状态）
     * @param xmlToPojo
     * @return
     */
    ResultOut<GetPrepayRecordOutSet> getPrepayRecord(GetPrepayRecordIn xmlToPojo);

    /**
     * 2.2.8.3 住院费用每日清单查询
     * 接口	inpatient.getDailyBill
     * 说明	通过调用本接口查询患者住院期间指定某一天的费用明细清单
     * @param xmlToPojo
     * @return
     */
    GetDailyBillOut getDailyBill(GetDailyBillIn xmlToPojo);
}
