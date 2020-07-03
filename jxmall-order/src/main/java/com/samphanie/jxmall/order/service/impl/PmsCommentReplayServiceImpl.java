package com.samphanie.jxmall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.order.mapper.PmsCommentReplayMapper;
import com.samphanie.jxmall.order.entity.PmsCommentReplay;
import com.samphanie.jxmall.order.service.IPmsCommentReplayService;

@Service
public class PmsCommentReplayServiceImpl extends ServiceImpl<PmsCommentReplayMapper, PmsCommentReplay> implements IPmsCommentReplayService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsCommentReplay> page = this.page(
                new Query<PmsCommentReplay>().getPage(params),
                new QueryWrapper<PmsCommentReplay>()
        );

        return new PageUtils(page);
    }

}