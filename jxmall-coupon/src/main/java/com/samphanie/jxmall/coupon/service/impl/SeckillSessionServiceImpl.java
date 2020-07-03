package com.samphanie.jxmall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.coupon.mapper.SeckillSessionMapper;
import com.samphanie.jxmall.coupon.entity.SeckillSession;
import com.samphanie.jxmall.coupon.service.ISeckillSessionService;

@Service
public class SeckillSessionServiceImpl extends ServiceImpl<SeckillSessionMapper, SeckillSession> implements ISeckillSessionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SeckillSession> page = this.page(
                new Query<SeckillSession>().getPage(params),
                new QueryWrapper<SeckillSession>()
        );

        return new PageUtils(page);
    }

}