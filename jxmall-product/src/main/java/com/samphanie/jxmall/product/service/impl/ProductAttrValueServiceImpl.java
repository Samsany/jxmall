package com.samphanie.jxmall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.product.mapper.ProductAttrValueMapper;
import com.samphanie.jxmall.product.entity.ProductAttrValue;
import com.samphanie.jxmall.product.service.ProductAttrValueService;


@Service("productAttrValueService")
public class ProductAttrValueServiceImpl extends ServiceImpl<ProductAttrValueMapper, ProductAttrValue> implements ProductAttrValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProductAttrValue> page = this.page(
                new Query<ProductAttrValue>().getPage(params),
                new QueryWrapper<ProductAttrValue>()
        );

        return new PageUtils(page);
    }

}