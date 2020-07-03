package com.samphanie.jxmall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.product.mapper.SpuCommentMapper;
import com.samphanie.jxmall.product.entity.SpuComment;
import com.samphanie.jxmall.product.service.ISpuCommentService;

@Service
public class SpuCommentServiceImpl extends ServiceImpl<SpuCommentMapper, SpuComment> implements ISpuCommentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuComment> page = this.page(
                new Query<SpuComment>().getPage(params),
                new QueryWrapper<SpuComment>()
        );

        return new PageUtils(page);
    }

}