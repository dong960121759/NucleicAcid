package com.julong.nucleicacid.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;

/**
 * @className: KingDeeNucleicLogFO
 * @date: 2022/1/12 17:47
 */
@Data
@TableName("CL_NUCLEICLOG_KINGDEE")

public class KingDeeNucleicLogFO implements Serializable {

    @TableId(value = "OID")
    private Long oid;
    /**healthCardNo	req	String	是	健康卡号*/
    @TableField("HEALTHCARDNO")
    private String healthCardNo;
    /**idCardNo	req	String	否	身份证号*/
    @TableField("IDCARDNO")
    private String idCardNo;
    /**patientName	req	String	否	姓名*/
    @TableField("PATIENTNAME")
    private String patientName;
    /**patientId	req	String	否	患者唯一ID*/
    @TableField("PATIENTID")
    private String patientId;
    /**phone	req	String	否	电话号码*/
    @TableField("PHONE")
    private String phone;
    /**itemId	req	string	是	核酸检测项目ID（部分医院分多种类型检测项目，需选择）*/
    @TableField("ITEMID")
    private String itemId;
    /**hospitalId	req	String	是	医院代码*/
    @TableField("HOSPITALID")
    private String hospitalId;
    /**nucleicAddressId	req	String	否	检测地址代码*/
    @TableField("NUCLEICADDRESSID")
    private String nucleicAddressId;
    /**regDate	req	String	否	检测日期*/
    @TableField("REGDATE")
    private String regDate;
    /**orderTime	req	String	否	下单时间，格式：YYYY-MM-DD HH:MI:SS*/
    @TableField("ORDERTIME")
    private String orderTime;

}
