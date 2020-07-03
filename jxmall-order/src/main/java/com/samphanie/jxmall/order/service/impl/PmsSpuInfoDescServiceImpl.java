package com.samphanie.jxmall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.order.mapper.PmsSpuInfoDescMapper;
import com.samphanie.jxmall.order.entity.PmsSpuInfoDesc;
import com.samphanie.jxmall.order.service.IPmsSpuInfoDescService;

@Service
public class PmsSpuInfoDescServiceImpl extends ServiceImpl<PmsSpuInfoDescMapper, PmsSpuInfoDesc> implements IPmsSpuInfoDescService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSpuInfoDesc> page = this.page(
                new Query<PmsSpuInfoDesc>().getPage(params),
                new QueryWrapper<PmsSpuInfoDesc>()
        );

        return new PageUtils(page);
    }

}