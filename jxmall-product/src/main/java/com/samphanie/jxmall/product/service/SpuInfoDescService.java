package com.samphanie.jxmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.product.entity.SpuInfoDesc;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-06-25 01:14:34
 */
public interface SpuInfoDescService extends IService<SpuInfoDesc> {

    PageUtils queryPage(Map<String, Object> params);
}

