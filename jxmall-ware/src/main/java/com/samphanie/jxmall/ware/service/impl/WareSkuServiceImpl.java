package com.samphanie.jxmall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.ware.mapper.WareSkuMapper;
import com.samphanie.jxmall.ware.entity.WareSku;
import com.samphanie.jxmall.ware.service.IWareSkuService;

@Service
public class WareSkuServiceImpl extends ServiceImpl<WareSkuMapper, WareSku> implements IWareSkuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WareSku> page = this.page(
                new Query<WareSku>().getPage(params),
                new QueryWrapper<WareSku>()
        );

        return new PageUtils(page);
    }

}