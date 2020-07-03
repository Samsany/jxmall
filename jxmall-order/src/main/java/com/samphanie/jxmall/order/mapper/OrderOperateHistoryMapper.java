package com.samphanie.jxmall.order.mapper;

import com.samphanie.jxmall.order.entity.OrderOperateHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:39:31
 */
@Mapper
public interface OrderOperateHistoryMapper extends BaseMapper<OrderOperateHistory> {
	
}
