package com.julong.nucleicacid.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @className: SmOidGeneratorFO
 * @date: 2022/1/10 9:40
 */
@Data
@TableName( "SM_OID_GENERATOR")
public class SmOidGeneratorFO {
    @TableId( "FID" )
    private String fid;
    @TableField("FCURROID")
    private Long fcurrOid;
}
