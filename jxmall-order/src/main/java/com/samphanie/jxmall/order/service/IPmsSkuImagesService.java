package com.samphanie.jxmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.order.entity.PmsSkuImages;

import java.util.Map;

/**
 * sku图片
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:39:31
 */
public interface IPmsSkuImagesService extends IService<PmsSkuImages> {

    PageUtils queryPage(Map<String, Object> params);
}

