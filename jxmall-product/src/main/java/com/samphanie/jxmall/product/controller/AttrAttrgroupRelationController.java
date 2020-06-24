package com.samphanie.jxmall.product.controller;

import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.R;
import com.samphanie.jxmall.product.entity.AttrAttrgroupRelation;
import com.samphanie.jxmall.product.service.AttrAttrgroupRelationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Map;



/**
 * 属性&属性分组关联
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-06-25 01:14:34
 */
@RestController
@RequestMapping("product")
public class AttrAttrgroupRelationController {

    @Resource
    private AttrAttrgroupRelationService attrAttrgroupRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = attrAttrgroupRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		AttrAttrgroupRelation attrAttrgroupRelation = attrAttrgroupRelationService.getById(id);

        return R.ok().put("attrAttrgroupRelation", attrAttrgroupRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody AttrAttrgroupRelation attrAttrgroupRelation){
		attrAttrgroupRelationService.save(attrAttrgroupRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody AttrAttrgroupRelation attrAttrgroupRelation){
		attrAttrgroupRelationService.updateById(attrAttrgroupRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		attrAttrgroupRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
