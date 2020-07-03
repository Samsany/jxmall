package com.samphanie.jxmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.coupon.entity.SeckillPromotion;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:42:28
 */
public interface ISeckillPromotionService extends IService<SeckillPromotion> {

    PageUtils queryPage(Map<String, Object> params);
}

