package com.samphanie.jxmall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.samphanie.jxmall.product.entity.SkuSaleAttrValue;
import com.samphanie.jxmall.product.service.SkuSaleAttrValueService;
import com.samphanie.common.utils.PageUtils;

import javax.annotation.Resource;
import com.samphanie.common.utils.R;



/**
 * sku销售属性&值
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-06-25 01:14:34
 */
@RestController
@RequestMapping("product")
public class SkuSaleAttrValueController {

    @Resource
    private SkuSaleAttrValueService skuSaleAttrValueService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = skuSaleAttrValueService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SkuSaleAttrValue skuSaleAttrValue = skuSaleAttrValueService.getById(id);

        return R.ok().put("skuSaleAttrValue", skuSaleAttrValue);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SkuSaleAttrValue skuSaleAttrValue){
		skuSaleAttrValueService.save(skuSaleAttrValue);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SkuSaleAttrValue skuSaleAttrValue){
		skuSaleAttrValueService.updateById(skuSaleAttrValue);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		skuSaleAttrValueService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
