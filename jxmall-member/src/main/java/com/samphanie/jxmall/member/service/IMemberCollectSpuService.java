package com.samphanie.jxmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.member.entity.MemberCollectSpu;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:43:15
 */
public interface IMemberCollectSpuService extends IService<MemberCollectSpu> {

    PageUtils queryPage(Map<String, Object> params);
}

