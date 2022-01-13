package com.julong.nucleicacid.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.julong.nucleicacid.entity.AbOrderItemFO;
import com.julong.nucleicacid.entity.OrderGroupFO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @className: OrderGroupMapper
 * @date: 2022/1/12 16:45
 */
@Mapper
public interface OrderItemMapper extends BaseMapper<AbOrderItemFO> {
}
