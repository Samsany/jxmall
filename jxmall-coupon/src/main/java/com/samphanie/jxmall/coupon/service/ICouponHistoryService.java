package com.samphanie.jxmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.coupon.entity.CouponHistory;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:42:28
 */
public interface ICouponHistoryService extends IService<CouponHistory> {

    PageUtils queryPage(Map<String, Object> params);
}

