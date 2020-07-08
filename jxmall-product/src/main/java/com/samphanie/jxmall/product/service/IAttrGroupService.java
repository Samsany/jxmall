package com.samphanie.jxmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.product.entity.AttrGroup;

import java.util.Map;

/**
 * 属性分组
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:41:16
 */
public interface IAttrGroupService extends IService<AttrGroup> {

    PageUtils queryPage(Map<String, Object> params);
}
