package com.samphanie.jxmall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.order.mapper.PmsSkuSaleAttrValueMapper;
import com.samphanie.jxmall.order.entity.PmsSkuSaleAttrValue;
import com.samphanie.jxmall.order.service.IPmsSkuSaleAttrValueService;

@Service
public class PmsSkuSaleAttrValueServiceImpl extends ServiceImpl<PmsSkuSaleAttrValueMapper, PmsSkuSaleAttrValue> implements IPmsSkuSaleAttrValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSkuSaleAttrValue> page = this.page(
                new Query<PmsSkuSaleAttrValue>().getPage(params),
                new QueryWrapper<PmsSkuSaleAttrValue>()
        );

        return new PageUtils(page);
    }

}