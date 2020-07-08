package com.samphanie.jxmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.order.entity.PmsAttr;

import java.util.Map;

/**
 * 商品属性
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:39:31
 */
public interface IPmsAttrService extends IService<PmsAttr> {

    PageUtils queryPage(Map<String, Object> params);
}
