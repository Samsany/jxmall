package com.samphanie.jxmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.member.entity.MemberLevel;

import java.util.Map;

/**
 * 会员等级
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:43:15
 */
public interface IMemberLevelService extends IService<MemberLevel> {

    PageUtils queryPage(Map<String, Object> params);
}

