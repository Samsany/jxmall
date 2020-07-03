package com.samphanie.jxmall.member.fegin;

import com.samphanie.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author ZSY
 * @createTime 2020/5/13 23:00
 */
@FeignClient("jxmall-coupon")
public interface ICouponFeignService {

    @GetMapping("/coupon/member/list")
    public R membercoupons();

}
