package com.samphanie.jxmall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.order.mapper.PmsSpuInfoMapper;
import com.samphanie.jxmall.order.entity.PmsSpuInfo;
import com.samphanie.jxmall.order.service.IPmsSpuInfoService;

@Service
public class PmsSpuInfoServiceImpl extends ServiceImpl<PmsSpuInfoMapper, PmsSpuInfo> implements IPmsSpuInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSpuInfo> page = this.page(
                new Query<PmsSpuInfo>().getPage(params),
                new QueryWrapper<PmsSpuInfo>()
        );

        return new PageUtils(page);
    }

}