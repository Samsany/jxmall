package com.samphanie.jxmall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.order.mapper.PmsSpuImagesMapper;
import com.samphanie.jxmall.order.entity.PmsSpuImages;
import com.samphanie.jxmall.order.service.IPmsSpuImagesService;

@Service
public class PmsSpuImagesServiceImpl extends ServiceImpl<PmsSpuImagesMapper, PmsSpuImages> implements IPmsSpuImagesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSpuImages> page = this.page(
                new Query<PmsSpuImages>().getPage(params),
                new QueryWrapper<PmsSpuImages>()
        );

        return new PageUtils(page);
    }

}