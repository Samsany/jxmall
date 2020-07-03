package com.samphanie.jxmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.order.entity.PmsCategoryBrandRelation;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:39:31
 */
public interface IPmsCategoryBrandRelationService extends IService<PmsCategoryBrandRelation> {

    PageUtils queryPage(Map<String, Object> params);
}

