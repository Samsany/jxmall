package com.samphanie.jxmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.product.entity.SpuImages;

import java.util.Map;

/**
 * spu图片
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-06-25 01:14:34
 */
public interface SpuImagesService extends IService<SpuImages> {

    PageUtils queryPage(Map<String, Object> params);
}

