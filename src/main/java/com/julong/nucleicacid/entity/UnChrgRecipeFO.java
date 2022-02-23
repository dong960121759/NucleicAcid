package com.julong.nucleicacid.entity;

import lombok.Data;

/**
 * @className: UnChrgRecipeFO
 * @Description: TODO 未结算处方
 * @author: cxd
 * @date: 2022/2/23 14:02
 */
@Data
public class UnChrgRecipeFO {
    //测试数据hcno: 1190588
    //18945409	1384549	54
    //18945410	1384549	133
    private  Long recipeid ;

    private  Long patientid ;

    private  Long deptid ;
}
