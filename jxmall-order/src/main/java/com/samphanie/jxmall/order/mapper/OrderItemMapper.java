package com.samphanie.jxmall.order.mapper;

import com.samphanie.jxmall.order.entity.OrderItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:39:31
 */
@Mapper
public interface OrderItemMapper extends BaseMapper<OrderItem> {
	
}
