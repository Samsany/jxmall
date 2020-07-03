package com.samphanie.jxmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.coupon.entity.CouponSpuCategoryRelation;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:42:28
 */
public interface ICouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelation> {

    PageUtils queryPage(Map<String, Object> params);
}

