package com.samphanie.jxmall.order.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

import com.samphanie.jxmall.order.entity.PmsSkuImages;
import com.samphanie.jxmall.order.service.IPmsSkuImagesService;
import com.samphanie.common.utils.PageUtils;

import javax.annotation.Resource;
import com.samphanie.common.utils.R;

/**
 * sku图片
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:39:31
 */
@RestController
@RequestMapping("order/PmsSkuImages")
public class PmsSkuImagesController {

    @Resource
    private IPmsSkuImagesService pmsSkuImagesService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsSkuImagesService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		PmsSkuImages pmsSkuImages = pmsSkuImagesService.getById(id);

        return R.ok().put("pmsSkuImages", pmsSkuImages);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody PmsSkuImages pmsSkuImages){
		pmsSkuImagesService.save(pmsSkuImages);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public R update(@RequestBody PmsSkuImages pmsSkuImages){
		pmsSkuImagesService.updateById(pmsSkuImages);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		pmsSkuImagesService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
