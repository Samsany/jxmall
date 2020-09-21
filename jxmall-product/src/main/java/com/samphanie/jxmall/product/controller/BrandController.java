package com.samphanie.jxmall.product.controller;

import java.util.Arrays;
import java.util.Map;

import com.samphanie.common.valid.AddGroup;
import com.samphanie.common.valid.UpdateGroup;
import com.samphanie.common.valid.UpdateStatusGroup;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.samphanie.jxmall.product.entity.Brand;
import com.samphanie.jxmall.product.service.IBrandService;
import com.samphanie.common.utils.PageUtils;

import javax.annotation.Resource;
import javax.validation.Valid;

import com.samphanie.common.utils.R;

/**
 * 品牌
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:41:16
 */
@RestController
@RequestMapping("product/brand")
public class BrandController {

    @Resource
    private IBrandService brandService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public R list(@RequestParam Map<String, Object> params){

        PageUtils page = brandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{brandId}")
    public R info(@PathVariable("brandId") Long brandId){
		Brand brand = brandService.getById(brandId);

        return R.ok().put("brand", brand);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@Validated(AddGroup.class) @RequestBody Brand brand){
		brandService.save(brand);

        return R.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public R update(@Validated(UpdateGroup.class) @RequestBody Brand brand){
		brandService.updateById(brand);

        return R.ok();
    }

    /**
     * 修改状态
     */
    @PostMapping("/update/status")
    public R updateStatus(@Validated(UpdateStatusGroup.class) @RequestBody Brand brand){
        brandService.updateById(brand);

        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public R delete(@RequestBody Long[] brandIds){
		brandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }

}
