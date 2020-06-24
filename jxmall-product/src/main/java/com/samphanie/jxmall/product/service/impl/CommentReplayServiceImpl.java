package com.samphanie.jxmall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.product.mapper.CommentReplayMapper;
import com.samphanie.jxmall.product.entity.CommentReplay;
import com.samphanie.jxmall.product.service.CommentReplayService;


@Service("commentReplayService")
public class CommentReplayServiceImpl extends ServiceImpl<CommentReplayMapper, CommentReplay> implements CommentReplayService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CommentReplay> page = this.page(
                new Query<CommentReplay>().getPage(params),
                new QueryWrapper<CommentReplay>()
        );

        return new PageUtils(page);
    }

}