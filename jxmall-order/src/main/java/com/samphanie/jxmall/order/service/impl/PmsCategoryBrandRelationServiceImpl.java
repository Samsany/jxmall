package com.samphanie.jxmall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.order.mapper.PmsCategoryBrandRelationMapper;
import com.samphanie.jxmall.order.entity.PmsCategoryBrandRelation;
import com.samphanie.jxmall.order.service.IPmsCategoryBrandRelationService;

@Service
public class PmsCategoryBrandRelationServiceImpl extends ServiceImpl<PmsCategoryBrandRelationMapper, PmsCategoryBrandRelation> implements IPmsCategoryBrandRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsCategoryBrandRelation> page = this.page(
                new Query<PmsCategoryBrandRelation>().getPage(params),
                new QueryWrapper<PmsCategoryBrandRelation>()
        );

        return new PageUtils(page);
    }

}