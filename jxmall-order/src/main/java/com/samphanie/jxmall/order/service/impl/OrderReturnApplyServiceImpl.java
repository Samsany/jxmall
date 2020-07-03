package com.samphanie.jxmall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.order.mapper.OrderReturnApplyMapper;
import com.samphanie.jxmall.order.entity.OrderReturnApply;
import com.samphanie.jxmall.order.service.IOrderReturnApplyService;

@Service
public class OrderReturnApplyServiceImpl extends ServiceImpl<OrderReturnApplyMapper, OrderReturnApply> implements IOrderReturnApplyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderReturnApply> page = this.page(
                new Query<OrderReturnApply>().getPage(params),
                new QueryWrapper<OrderReturnApply>()
        );

        return new PageUtils(page);
    }

}