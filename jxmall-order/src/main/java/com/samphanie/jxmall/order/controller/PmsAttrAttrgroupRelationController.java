package com.samphanie.jxmall.order.controller;

import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.R;
import com.samphanie.jxmall.order.entity.PmsAttrAttrgroupRelation;
import com.samphanie.jxmall.order.service.IPmsAttrAttrgroupRelationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:39:31
 */
@RestController
@RequestMapping("/order/PmsAttrAttrgroupRelation")
public class PmsAttrAttrgroupRelationController {

    @Resource
    private IPmsAttrAttrgroupRelationService pmsAttrAttrgroupRelationService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsAttrAttrgroupRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation = pmsAttrAttrgroupRelationService.getById(id);

        return R.ok().put("pmsAttrAttrgroupRelation", pmsAttrAttrgroupRelation);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation){
		pmsAttrAttrgroupRelationService.save(pmsAttrAttrgroupRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public R update(@RequestBody PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation){
		pmsAttrAttrgroupRelationService.updateById(pmsAttrAttrgroupRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		pmsAttrAttrgroupRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
