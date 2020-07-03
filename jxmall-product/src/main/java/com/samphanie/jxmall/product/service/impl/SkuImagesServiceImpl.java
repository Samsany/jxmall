package com.samphanie.jxmall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.product.mapper.SkuImagesMapper;
import com.samphanie.jxmall.product.entity.SkuImages;
import com.samphanie.jxmall.product.service.ISkuImagesService;

@Service
public class SkuImagesServiceImpl extends ServiceImpl<SkuImagesMapper, SkuImages> implements ISkuImagesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuImages> page = this.page(
                new Query<SkuImages>().getPage(params),
                new QueryWrapper<SkuImages>()
        );

        return new PageUtils(page);
    }

}