package com.samphanie.jxmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.coupon.entity.MemberPrice;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:42:28
 */
public interface IMemberPriceService extends IService<MemberPrice> {

    PageUtils queryPage(Map<String, Object> params);
}

