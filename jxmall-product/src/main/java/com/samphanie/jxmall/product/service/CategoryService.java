package com.samphanie.jxmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.product.entity.Category;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-06-25 01:14:34
 */
public interface CategoryService extends IService<Category> {

    PageUtils queryPage(Map<String, Object> params);
}

