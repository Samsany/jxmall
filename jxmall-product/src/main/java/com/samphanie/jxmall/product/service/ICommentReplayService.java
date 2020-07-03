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
 * @date 2020-07-03 22:41:16
 */
public interface ICommentReplayService extends IService<CommentReplay> {

    PageUtils queryPage(Map<String, Object> params);
}

