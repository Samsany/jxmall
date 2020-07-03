package com.samphanie.jxmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.member.entity.MemberCollectSubject;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:43:15
 */
public interface IMemberCollectSubjectService extends IService<MemberCollectSubject> {

    PageUtils queryPage(Map<String, Object> params);
}

