package com.samphanie.jxmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.order.entity.PmsSpuInfoDesc;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:39:31
 */
public interface IPmsSpuInfoDescService extends IService<PmsSpuInfoDesc> {

    PageUtils queryPage(Map<String, Object> params);
}

