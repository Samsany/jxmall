package com.samphanie.jxmall.coupon.controller;

import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.R;
import com.samphanie.jxmall.coupon.entity.Coupon;
import com.samphanie.jxmall.coupon.service.ICouponService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Map;

/**
 * 优惠券信息
 * @RefreshScope 动态刷新配置
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:42:28
 */
@RefreshScope
@RestController
@RequestMapping("/coupon")
public class CouponController {

    @Resource
    private ICouponService couponService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/test")
    public R username() {
        return R.ok().put("port", port);
    }

    @GetMapping("/member/list")
    public R coupons() {

        Coupon coupon = new Coupon();
        coupon.setCouponName("满100减10");

        return R.ok().put("coupons",Arrays.asList(coupon));
    }

    /**
     * 列表
     */
    @GetMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		Coupon coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody Coupon coupon){
		couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public R update(@RequestBody Coupon coupon){
		couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
