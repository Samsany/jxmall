package com.samphanie.jxmall.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.samphanie.jxmall.product.vo.CategoryVo;
import org.springframework.web.bind.annotation.*;

import com.samphanie.jxmall.product.entity.Category;
import com.samphanie.jxmall.product.service.ICategoryService;
import com.samphanie.common.utils.PageUtils;

import javax.annotation.Resource;
import com.samphanie.common.utils.R;

/**
 * 商品三级分类
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:41:16
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {

    @Resource
    private ICategoryService categoryService;

    /**
     * 查出所有的分类以及子分类，以树形结构组装
     * 列表
     */
    @GetMapping("/list/tree")
    public R list(){

        List<CategoryVo> categories = categoryService.listWithTree();

        return R.ok().put("data", categories);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{catId}")
    public R info(@PathVariable("catId") Long catId){
		Category category = categoryService.getById(catId);

        return R.ok().put("data", category);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody Category category){
		categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update/sort")
    public R updateSort(@RequestBody Category[] category){
        categoryService.saveOrUpdateBatch(Arrays.asList(category));

        return R.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public R update(@RequestBody Category category){
		categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    public R delete(@RequestBody Long[] catIds){

        // 1. 检查当前删除的菜单是否被别的引用
		// categoryService.removeByIds(Arrays.asList(catIds));
        categoryService.removeMenuByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
