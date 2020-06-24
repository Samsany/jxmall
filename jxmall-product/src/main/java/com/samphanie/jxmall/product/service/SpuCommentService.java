package com.samphanie.jxmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.product.entity.SpuComment;

import java.util.Map;

/**
 * 商品评价
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-06-25 01:14:34
 */
public interface SpuCommentService extends IService<SpuComment> {

    PageUtils queryPage(Map<String, Object> params);
}

