package com.samphanie.jxmall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.order.mapper.PmsSpuCommentMapper;
import com.samphanie.jxmall.order.entity.PmsSpuComment;
import com.samphanie.jxmall.order.service.IPmsSpuCommentService;

@Service
public class PmsSpuCommentServiceImpl extends ServiceImpl<PmsSpuCommentMapper, PmsSpuComment> implements IPmsSpuCommentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSpuComment> page = this.page(
                new Query<PmsSpuComment>().getPage(params),
                new QueryWrapper<PmsSpuComment>()
        );

        return new PageUtils(page);
    }

}