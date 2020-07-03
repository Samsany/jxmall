package com.samphanie.jxmall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.order.mapper.OrderSettingMapper;
import com.samphanie.jxmall.order.entity.OrderSetting;
import com.samphanie.jxmall.order.service.IOrderSettingService;

@Service
public class OrderSettingServiceImpl extends ServiceImpl<OrderSettingMapper, OrderSetting> implements IOrderSettingService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderSetting> page = this.page(
                new Query<OrderSetting>().getPage(params),
                new QueryWrapper<OrderSetting>()
        );

        return new PageUtils(page);
    }

}