package com.samphanie.jxmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.product.entity.AttrAttrgroupRelation;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-06-25 01:14:34
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelation> {

    PageUtils queryPage(Map<String, Object> params);
}

