package com.samphanie.jxmall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;
import com.samphanie.jxmall.coupon.entity.Coupon;
import com.samphanie.jxmall.coupon.mapper.CouponMapper;
import com.samphanie.jxmall.coupon.service.ICouponService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CouponServiceImpl extends ServiceImpl<CouponMapper, Coupon> implements ICouponService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Coupon> page = this.page(
                new Query<Coupon>().getPage(params),
                new QueryWrapper<Coupon>()
        );

        return new PageUtils(page);
    }

}