package com.samphanie.jxmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.product.entity.SkuSaleAttrValue;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-06-25 01:14:34
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValue> {

    PageUtils queryPage(Map<String, Object> params);
}

