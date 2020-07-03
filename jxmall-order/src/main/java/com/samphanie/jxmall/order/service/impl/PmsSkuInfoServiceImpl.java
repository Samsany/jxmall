package com.samphanie.jxmall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.order.mapper.PmsSkuInfoMapper;
import com.samphanie.jxmall.order.entity.PmsSkuInfo;
import com.samphanie.jxmall.order.service.IPmsSkuInfoService;

@Service
public class PmsSkuInfoServiceImpl extends ServiceImpl<PmsSkuInfoMapper, PmsSkuInfo> implements IPmsSkuInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSkuInfo> page = this.page(
                new Query<PmsSkuInfo>().getPage(params),
                new QueryWrapper<PmsSkuInfo>()
        );

        return new PageUtils(page);
    }

}