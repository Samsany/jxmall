package com.samphanie.jxmall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.order.mapper.PmsProductAttrValueMapper;
import com.samphanie.jxmall.order.entity.PmsProductAttrValue;
import com.samphanie.jxmall.order.service.IPmsProductAttrValueService;

@Service
public class PmsProductAttrValueServiceImpl extends ServiceImpl<PmsProductAttrValueMapper, PmsProductAttrValue> implements IPmsProductAttrValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsProductAttrValue> page = this.page(
                new Query<PmsProductAttrValue>().getPage(params),
                new QueryWrapper<PmsProductAttrValue>()
        );

        return new PageUtils(page);
    }

}