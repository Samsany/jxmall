package com.samphanie.jxmall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.order.mapper.OrderItemMapper;
import com.samphanie.jxmall.order.entity.OrderItem;
import com.samphanie.jxmall.order.service.IOrderItemService;

@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements IOrderItemService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderItem> page = this.page(
                new Query<OrderItem>().getPage(params),
                new QueryWrapper<OrderItem>()
        );

        return new PageUtils(page);
    }

}