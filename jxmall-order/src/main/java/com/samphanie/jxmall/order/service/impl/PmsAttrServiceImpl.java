package com.samphanie.jxmall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.order.mapper.PmsAttrMapper;
import com.samphanie.jxmall.order.entity.PmsAttr;
import com.samphanie.jxmall.order.service.IPmsAttrService;

@Service
public class PmsAttrServiceImpl extends ServiceImpl<PmsAttrMapper, PmsAttr> implements IPmsAttrService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsAttr> page = this.page(
                new Query<PmsAttr>().getPage(params),
                new QueryWrapper<PmsAttr>()
        );

        return new PageUtils(page);
    }

}