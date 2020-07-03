package com.samphanie.jxmall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;
import com.samphanie.jxmall.coupon.entity.CouponHistory;
import com.samphanie.jxmall.coupon.mapper.CouponHistoryMapper;
import com.samphanie.jxmall.coupon.service.ICouponHistoryService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CouponHistoryServiceImpl extends ServiceImpl<CouponHistoryMapper, CouponHistory> implements ICouponHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CouponHistory> page = this.page(
                new Query<CouponHistory>().getPage(params),
                new QueryWrapper<CouponHistory>()
        );

        return new PageUtils(page);
    }

}