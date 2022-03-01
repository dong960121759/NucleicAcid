package com.julong.nucleicacid.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @className: MobilePayHisPayNoFO
 * @Description: TODO
 * @author: cxd
 * @date: 2022/2/25 15:35
 */
@Data
@TableName(  "MOBILEPAY_HISPAYNO")
public class MobilePayHisPayNoFO implements Serializable {
    
        /**
         *医院订单号 
         */
       @TableId( "HISPAYNO")
        private String hisPayNo;


        /**
         *处方号
         */
       @TableField( "RECNO")
        private String recNo;

        /**
         *病人ID
         */
       @TableField( "PID")
        private Long pid;

        /**
         *结算标志
         */
       @TableField( "ISCHRG")
        private String isChrg;

        /**
         *删除标志
         */
       @TableField( "ISDELETE")
        private String isDelete;

        /**
         *分院标志
         */
       @TableField( "SITE")
        private String site;

        /**
         *日期
         */
       @TableField( "GENDATE")
        private Date genDate;


        public MobilePayHisPayNoFO() {
            isChrg = "0";
            isDelete = "0";
        }

    }
