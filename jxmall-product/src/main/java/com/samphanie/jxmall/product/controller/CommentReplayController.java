package com.samphanie.jxmall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.samphanie.jxmall.product.entity.CommentReplay;
import com.samphanie.jxmall.product.service.CommentReplayService;
import com.samphanie.common.utils.PageUtils;

import javax.annotation.Resource;
import com.samphanie.common.utils.R;



/**
 * 商品评价回复关系
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-06-25 01:14:34
 */
@RestController
@RequestMapping("product")
public class CommentReplayController {

    @Resource
    private CommentReplayService commentReplayService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = commentReplayService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		CommentReplay commentReplay = commentReplayService.getById(id);

        return R.ok().put("commentReplay", commentReplay);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CommentReplay commentReplay){
		commentReplayService.save(commentReplay);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CommentReplay commentReplay){
		commentReplayService.updateById(commentReplay);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		commentReplayService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
