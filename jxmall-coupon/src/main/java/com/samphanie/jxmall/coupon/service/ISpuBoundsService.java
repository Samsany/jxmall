package com.samphanie.jxmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.coupon.entity.SpuBounds;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:42:28
 */
public interface ISpuBoundsService extends IService<SpuBounds> {

    PageUtils queryPage(Map<String, Object> params);
}

