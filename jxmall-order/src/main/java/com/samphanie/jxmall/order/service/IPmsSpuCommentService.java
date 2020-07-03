package com.samphanie.jxmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.order.entity.PmsSpuComment;

import java.util.Map;

/**
 * 商品评价
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:39:31
 */
public interface IPmsSpuCommentService extends IService<PmsSpuComment> {

    PageUtils queryPage(Map<String, Object> params);
}

