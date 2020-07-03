package com.samphanie.jxmall.coupon.controller;

import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.R;
import com.samphanie.jxmall.coupon.entity.CouponHistory;
import com.samphanie.jxmall.coupon.service.ICouponHistoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:42:28
 */
@RestController
@RequestMapping("/coupon/history")
public class CouponHistoryController {

    @Resource
    private ICouponHistoryService couponHistoryService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponHistoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		CouponHistory couponHistory = couponHistoryService.getById(id);

        return R.ok().put("couponHistory", couponHistory);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody CouponHistory couponHistory){
		couponHistoryService.save(couponHistory);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public R update(@RequestBody CouponHistory couponHistory){
		couponHistoryService.updateById(couponHistory);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		couponHistoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
