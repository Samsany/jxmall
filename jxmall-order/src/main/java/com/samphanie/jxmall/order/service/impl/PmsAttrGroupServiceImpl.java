package com.samphanie.jxmall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.order.mapper.PmsAttrGroupMapper;
import com.samphanie.jxmall.order.entity.PmsAttrGroup;
import com.samphanie.jxmall.order.service.IPmsAttrGroupService;

@Service
public class PmsAttrGroupServiceImpl extends ServiceImpl<PmsAttrGroupMapper, PmsAttrGroup> implements IPmsAttrGroupService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsAttrGroup> page = this.page(
                new Query<PmsAttrGroup>().getPage(params),
                new QueryWrapper<PmsAttrGroup>()
        );

        return new PageUtils(page);
    }

}