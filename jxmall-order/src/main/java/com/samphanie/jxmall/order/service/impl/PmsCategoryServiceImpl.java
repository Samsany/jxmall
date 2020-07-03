package com.samphanie.jxmall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.order.mapper.PmsCategoryMapper;
import com.samphanie.jxmall.order.entity.PmsCategory;
import com.samphanie.jxmall.order.service.IPmsCategoryService;

@Service
public class PmsCategoryServiceImpl extends ServiceImpl<PmsCategoryMapper, PmsCategory> implements IPmsCategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsCategory> page = this.page(
                new Query<PmsCategory>().getPage(params),
                new QueryWrapper<PmsCategory>()
        );

        return new PageUtils(page);
    }

}