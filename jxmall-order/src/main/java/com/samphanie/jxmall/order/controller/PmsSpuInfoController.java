package com.samphanie.jxmall.order.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

import com.samphanie.jxmall.order.entity.PmsSpuInfo;
import com.samphanie.jxmall.order.service.IPmsSpuInfoService;
import com.samphanie.common.utils.PageUtils;

import javax.annotation.Resource;
import com.samphanie.common.utils.R;

/**
 * spu信息
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:39:31
 */
@RestController
@RequestMapping("order/PmsSpuInfo")
public class PmsSpuInfoController {

    @Resource
    private IPmsSpuInfoService pmsSpuInfoService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsSpuInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		PmsSpuInfo pmsSpuInfo = pmsSpuInfoService.getById(id);

        return R.ok().put("pmsSpuInfo", pmsSpuInfo);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody PmsSpuInfo pmsSpuInfo){
		pmsSpuInfoService.save(pmsSpuInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public R update(@RequestBody PmsSpuInfo pmsSpuInfo){
		pmsSpuInfoService.updateById(pmsSpuInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		pmsSpuInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
