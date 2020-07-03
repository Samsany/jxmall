package com.samphanie.jxmall.order.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

import com.samphanie.jxmall.order.entity.PmsSpuImages;
import com.samphanie.jxmall.order.service.IPmsSpuImagesService;
import com.samphanie.common.utils.PageUtils;

import javax.annotation.Resource;
import com.samphanie.common.utils.R;

/**
 * spu图片
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:39:31
 */
@RestController
@RequestMapping("order/PmsSpuImages")
public class PmsSpuImagesController {

    @Resource
    private IPmsSpuImagesService pmsSpuImagesService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsSpuImagesService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		PmsSpuImages pmsSpuImages = pmsSpuImagesService.getById(id);

        return R.ok().put("pmsSpuImages", pmsSpuImages);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody PmsSpuImages pmsSpuImages){
		pmsSpuImagesService.save(pmsSpuImages);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public R update(@RequestBody PmsSpuImages pmsSpuImages){
		pmsSpuImagesService.updateById(pmsSpuImages);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		pmsSpuImagesService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
