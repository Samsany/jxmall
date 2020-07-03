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
 * @date 2020-07-03 22:41:16
 */
public interface ICategoryService extends IService<Category> {

    PageUtils queryPage(Map<String, Object> params);
}

