package com.samphanie.jxmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.product.entity.Brand;

import java.util.Map;

/**
 * 品牌
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-06-25 01:14:34
 */
public interface BrandService extends IService<Brand> {

    PageUtils queryPage(Map<String, Object> params);
}

