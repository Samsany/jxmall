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
 * @date 2020-07-03 22:41:16
 */
public interface IProductAttrValueService extends IService<ProductAttrValue> {

    PageUtils queryPage(Map<String, Object> params);
}

