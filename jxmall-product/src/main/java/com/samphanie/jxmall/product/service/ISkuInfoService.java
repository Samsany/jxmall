package com.samphanie.jxmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.product.entity.SkuInfo;

import java.util.Map;

/**
 * sku信息
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:41:16
 */
public interface ISkuInfoService extends IService<SkuInfo> {

    PageUtils queryPage(Map<String, Object> params);
}

