package com.samphanie.jxmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.product.entity.CommentReplay;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-06-25 01:14:34
 */
public interface CommentReplayService extends IService<CommentReplay> {

    PageUtils queryPage(Map<String, Object> params);
}

