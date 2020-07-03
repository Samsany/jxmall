package com.samphanie.jxmall.member.controller;

import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.R;
import com.samphanie.jxmall.member.entity.MemberStatisticsInfo;
import com.samphanie.jxmall.member.service.IMemberStatisticsInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Map;

/**
 * 会员统计信息
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:43:15
 */
@RestController
@RequestMapping("/member/info")
public class MemberStatisticsInfoController {

    @Resource
    private IMemberStatisticsInfoService memberStatisticsInfoService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberStatisticsInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberStatisticsInfo memberStatisticsInfo = memberStatisticsInfoService.getById(id);

        return R.ok().put("memberStatisticsInfo", memberStatisticsInfo);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody MemberStatisticsInfo memberStatisticsInfo){
		memberStatisticsInfoService.save(memberStatisticsInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public R update(@RequestBody MemberStatisticsInfo memberStatisticsInfo){
		memberStatisticsInfoService.updateById(memberStatisticsInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberStatisticsInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
