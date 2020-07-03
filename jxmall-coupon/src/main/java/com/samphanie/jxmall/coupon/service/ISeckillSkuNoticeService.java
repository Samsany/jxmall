package com.samphanie.jxmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.coupon.entity.SeckillSkuNotice;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:42:28
 */
public interface ISeckillSkuNoticeService extends IService<SeckillSkuNotice> {

    PageUtils queryPage(Map<String, Object> params);
}

