package com.samphanie.jxmall.order.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

import com.samphanie.jxmall.order.entity.PmsSkuSaleAttrValue;
import com.samphanie.jxmall.order.service.IPmsSkuSaleAttrValueService;
import com.samphanie.common.utils.PageUtils;

import javax.annotation.Resource;
import com.samphanie.common.utils.R;

/**
 * sku销售属性&值
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:39:31
 */
@RestController
@RequestMapping("order/PmsSkuSaleAttrValue")
public class PmsSkuSaleAttrValueController {

    @Resource
    private IPmsSkuSaleAttrValueService pmsSkuSaleAttrValueService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsSkuSaleAttrValueService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		PmsSkuSaleAttrValue pmsSkuSaleAttrValue = pmsSkuSaleAttrValueService.getById(id);

        return R.ok().put("pmsSkuSaleAttrValue", pmsSkuSaleAttrValue);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody PmsSkuSaleAttrValue pmsSkuSaleAttrValue){
		pmsSkuSaleAttrValueService.save(pmsSkuSaleAttrValue);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public R update(@RequestBody PmsSkuSaleAttrValue pmsSkuSaleAttrValue){
		pmsSkuSaleAttrValueService.updateById(pmsSkuSaleAttrValue);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		pmsSkuSaleAttrValueService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
