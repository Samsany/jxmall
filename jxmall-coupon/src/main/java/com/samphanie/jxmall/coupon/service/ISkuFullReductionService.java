package com.samphanie.jxmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.coupon.entity.SkuFullReduction;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:42:28
 */
public interface ISkuFullReductionService extends IService<SkuFullReduction> {

    PageUtils queryPage(Map<String, Object> params);
}

