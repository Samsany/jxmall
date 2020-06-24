package com.samphanie.jxmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.product.entity.ProductAttrValue;

import java.util.Map;

/**
 * spu属性值
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-06-25 01:14:34
 */
public interface ProductAttrValueService extends IService<ProductAttrValue> {

    PageUtils queryPage(Map<String, Object> params);
}

