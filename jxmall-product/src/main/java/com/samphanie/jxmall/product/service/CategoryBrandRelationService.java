package com.samphanie.jxmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.product.entity.CategoryBrandRelation;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-06-25 01:14:34
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelation> {

    PageUtils queryPage(Map<String, Object> params);
}

