package com.samphanie.jxmall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.order.mapper.PmsBrandMapper;
import com.samphanie.jxmall.order.entity.PmsBrand;
import com.samphanie.jxmall.order.service.IPmsBrandService;

@Service
public class PmsBrandServiceImpl extends ServiceImpl<PmsBrandMapper, PmsBrand> implements IPmsBrandService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsBrand> page = this.page(
                new Query<PmsBrand>().getPage(params),
                new QueryWrapper<PmsBrand>()
        );

        return new PageUtils(page);
    }

}