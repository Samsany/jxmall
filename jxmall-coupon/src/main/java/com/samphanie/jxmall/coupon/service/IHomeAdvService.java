package com.samphanie.jxmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.coupon.entity.HomeAdv;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:42:28
 */
public interface IHomeAdvService extends IService<HomeAdv> {

    PageUtils queryPage(Map<String, Object> params);
}

