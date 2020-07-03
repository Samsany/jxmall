package com.samphanie.jxmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.member.entity.GrowthChangeHistory;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:43:15
 */
public interface IGrowthChangeHistoryService extends IService<GrowthChangeHistory> {

    PageUtils queryPage(Map<String, Object> params);
}

