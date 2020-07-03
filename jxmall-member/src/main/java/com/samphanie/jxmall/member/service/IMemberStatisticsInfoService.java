package com.samphanie.jxmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.member.entity.MemberStatisticsInfo;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:43:15
 */
public interface IMemberStatisticsInfoService extends IService<MemberStatisticsInfo> {

    PageUtils queryPage(Map<String, Object> params);
}

