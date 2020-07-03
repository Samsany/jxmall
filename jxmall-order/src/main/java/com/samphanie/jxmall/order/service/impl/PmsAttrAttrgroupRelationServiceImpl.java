package com.samphanie.jxmall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.order.mapper.PmsAttrAttrgroupRelationMapper;
import com.samphanie.jxmall.order.entity.PmsAttrAttrgroupRelation;
import com.samphanie.jxmall.order.service.IPmsAttrAttrgroupRelationService;

@Service
public class PmsAttrAttrgroupRelationServiceImpl extends ServiceImpl<PmsAttrAttrgroupRelationMapper, PmsAttrAttrgroupRelation> implements IPmsAttrAttrgroupRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsAttrAttrgroupRelation> page = this.page(
                new Query<PmsAttrAttrgroupRelation>().getPage(params),
                new QueryWrapper<PmsAttrAttrgroupRelation>()
        );

        return new PageUtils(page);
    }

}