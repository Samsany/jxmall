package com.samphanie.jxmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.coupon.entity.SeckillSkuRelation;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:42:28
 */
public interface ISeckillSkuRelationService extends IService<SeckillSkuRelation> {

    PageUtils queryPage(Map<String, Object> params);
}

