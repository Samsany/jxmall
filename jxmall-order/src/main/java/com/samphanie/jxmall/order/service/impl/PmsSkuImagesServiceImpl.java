package com.samphanie.jxmall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.order.mapper.PmsSkuImagesMapper;
import com.samphanie.jxmall.order.entity.PmsSkuImages;
import com.samphanie.jxmall.order.service.IPmsSkuImagesService;

@Service
public class PmsSkuImagesServiceImpl extends ServiceImpl<PmsSkuImagesMapper, PmsSkuImages> implements IPmsSkuImagesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSkuImages> page = this.page(
                new Query<PmsSkuImages>().getPage(params),
                new QueryWrapper<PmsSkuImages>()
        );

        return new PageUtils(page);
    }

}