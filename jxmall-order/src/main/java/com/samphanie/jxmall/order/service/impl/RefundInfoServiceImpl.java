package com.samphanie.jxmall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.order.mapper.RefundInfoMapper;
import com.samphanie.jxmall.order.entity.RefundInfo;
import com.samphanie.jxmall.order.service.IRefundInfoService;

@Service
public class RefundInfoServiceImpl extends ServiceImpl<RefundInfoMapper, RefundInfo> implements IRefundInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<RefundInfo> page = this.page(
                new Query<RefundInfo>().getPage(params),
                new QueryWrapper<RefundInfo>()
        );

        return new PageUtils(page);
    }

}