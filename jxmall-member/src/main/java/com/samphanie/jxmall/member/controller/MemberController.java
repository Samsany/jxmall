package com.samphanie.jxmall.member.controller;

import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.R;
import com.samphanie.jxmall.member.entity.Member;
import com.samphanie.jxmall.member.fegin.ICouponFeignService;
import com.samphanie.jxmall.member.service.IMemberService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/**
 * 会员
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:43:15
 */
@RestController
@RequestMapping("/member")
public class MemberController {

    @Resource
    private IMemberService memberService;
    @Resource
    private ICouponFeignService couponFeignService;

    @GetMapping("/coupons")
    public R coupons(){
        Member member = new Member();

        member.setNickname("张三");

        R membercoupons = couponFeignService.membercoupons();

        return Objects.requireNonNull(R.ok().put("member" , member)).put("coupons",membercoupons.get("coupons"));
    }

    /**
     * 列表
     */
    @GetMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		Member member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody Member member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public R update(@RequestBody Member member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
