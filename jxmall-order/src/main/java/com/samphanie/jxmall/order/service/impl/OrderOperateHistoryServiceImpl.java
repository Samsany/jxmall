package com.samphanie.jxmall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.order.mapper.OrderOperateHistoryMapper;
import com.samphanie.jxmall.order.entity.OrderOperateHistory;
import com.samphanie.jxmall.order.service.IOrderOperateHistoryService;

@Service
public class OrderOperateHistoryServiceImpl extends ServiceImpl<OrderOperateHistoryMapper, OrderOperateHistory> implements IOrderOperateHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderOperateHistory> page = this.page(
                new Query<OrderOperateHistory>().getPage(params),
                new QueryWrapper<OrderOperateHistory>()
        );

        return new PageUtils(page);
    }

}