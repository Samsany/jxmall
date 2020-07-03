package com.samphanie.jxmall.order.controller;

import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.R;
import com.samphanie.jxmall.order.entity.PmsCommentReplay;
import com.samphanie.jxmall.order.service.IPmsCommentReplayService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:39:31
 */
@RestController
@RequestMapping("/order/PmsCommentReplay")
public class PmsCommentReplayController {

    @Resource
    private IPmsCommentReplayService pmsCommentReplayService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsCommentReplayService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		PmsCommentReplay pmsCommentReplay = pmsCommentReplayService.getById(id);

        return R.ok().put("pmsCommentReplay", pmsCommentReplay);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody PmsCommentReplay pmsCommentReplay){
		pmsCommentReplayService.save(pmsCommentReplay);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public R update(@RequestBody PmsCommentReplay pmsCommentReplay){
		pmsCommentReplayService.updateById(pmsCommentReplay);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		pmsCommentReplayService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
