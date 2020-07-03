package com.samphanie.jxmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.order.entity.OrderOperateHistory;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:39:31
 */
public interface IOrderOperateHistoryService extends IService<OrderOperateHistory> {

    PageUtils queryPage(Map<String, Object> params);
}

