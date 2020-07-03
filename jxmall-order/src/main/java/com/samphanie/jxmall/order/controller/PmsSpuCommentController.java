package com.samphanie.jxmall.order.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

import com.samphanie.jxmall.order.entity.PmsSpuComment;
import com.samphanie.jxmall.order.service.IPmsSpuCommentService;
import com.samphanie.common.utils.PageUtils;

import javax.annotation.Resource;
import com.samphanie.common.utils.R;

/**
 * 商品评价
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:39:31
 */
@RestController
@RequestMapping("order/PmsSpuComment")
public class PmsSpuCommentController {

    @Resource
    private IPmsSpuCommentService pmsSpuCommentService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsSpuCommentService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		PmsSpuComment pmsSpuComment = pmsSpuCommentService.getById(id);

        return R.ok().put("pmsSpuComment", pmsSpuComment);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody PmsSpuComment pmsSpuComment){
		pmsSpuCommentService.save(pmsSpuComment);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public R update(@RequestBody PmsSpuComment pmsSpuComment){
		pmsSpuCommentService.updateById(pmsSpuComment);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		pmsSpuCommentService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
