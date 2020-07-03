package com.samphanie.jxmall.order.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

import com.samphanie.jxmall.order.entity.PmsSpuInfoDesc;
import com.samphanie.jxmall.order.service.IPmsSpuInfoDescService;
import com.samphanie.common.utils.PageUtils;

import javax.annotation.Resource;
import com.samphanie.common.utils.R;

/**
 * spu信息介绍
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:39:31
 */
@RestController
@RequestMapping("order/PmsSpuInfoDesc")
public class PmsSpuInfoDescController {

    @Resource
    private IPmsSpuInfoDescService pmsSpuInfoDescService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsSpuInfoDescService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{spuId}")
    public R info(@PathVariable("spuId") Long spuId){
		PmsSpuInfoDesc pmsSpuInfoDesc = pmsSpuInfoDescService.getById(spuId);

        return R.ok().put("pmsSpuInfoDesc", pmsSpuInfoDesc);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody PmsSpuInfoDesc pmsSpuInfoDesc){
		pmsSpuInfoDescService.save(pmsSpuInfoDesc);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public R update(@RequestBody PmsSpuInfoDesc pmsSpuInfoDesc){
		pmsSpuInfoDescService.updateById(pmsSpuInfoDesc);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public R delete(@RequestBody Long[] spuIds){
		pmsSpuInfoDescService.removeByIds(Arrays.asList(spuIds));

        return R.ok();
    }

}
