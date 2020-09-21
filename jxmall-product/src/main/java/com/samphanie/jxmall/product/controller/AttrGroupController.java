package com.samphanie.jxmall.product.controller;

import java.util.Arrays;
import java.util.Map;

import com.samphanie.jxmall.product.service.ICategoryService;
import org.springframework.web.bind.annotation.*;

import com.samphanie.jxmall.product.entity.AttrGroup;
import com.samphanie.jxmall.product.service.IAttrGroupService;
import com.samphanie.common.utils.PageUtils;

import javax.annotation.Resource;
import com.samphanie.common.utils.R;

/**
 * 属性分组
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:41:16
 */
@RestController
@RequestMapping("product/attrgroup")
public class AttrGroupController {

    @Resource
    private IAttrGroupService attrGroupService;
    @Resource
    private ICategoryService categoryService;

    /**
     * 列表
     */
    @GetMapping("/list/{catelogId}")
    public R list(@RequestParam Map<String, Object> params,
                  @PathVariable("catelogId") Long catelogId){
        // PageUtils page = attrGroupService.queryPage(params);

        PageUtils page = attrGroupService.queryPage(params, catelogId);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{attrGroupId}")
    public R info(@PathVariable("attrGroupId") Long attrGroupId){

		AttrGroup attrGroup = attrGroupService.getById(attrGroupId);
		Long[] path = categoryService.findCatelogPath(attrGroup.getCatelogId());
		attrGroup.setCatelogPath(path);

        return R.ok().put("attrGroup", attrGroup);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody AttrGroup attrGroup){
		attrGroupService.save(attrGroup);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public R update(@RequestBody AttrGroup attrGroup){
		attrGroupService.updateById(attrGroup);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public R delete(@RequestBody Long[] attrGroupIds){
		attrGroupService.removeByIds(Arrays.asList(attrGroupIds));

        return R.ok();
    }

}
