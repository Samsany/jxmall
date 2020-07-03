package com.samphanie.jxmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.coupon.entity.SkuLadder;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:42:28
 */
public interface ISkuLadderService extends IService<SkuLadder> {

    PageUtils queryPage(Map<String, Object> params);
}

