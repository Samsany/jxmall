package com.samphanie.jxmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.order.entity.OrderReturnApply;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:39:31
 */
public interface IOrderReturnApplyService extends IService<OrderReturnApply> {

    PageUtils queryPage(Map<String, Object> params);
}

