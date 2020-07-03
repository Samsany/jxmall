package com.samphanie.jxmall.order.controller;

import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.R;
import com.samphanie.jxmall.order.entity.OrderItem;
import com.samphanie.jxmall.order.service.IOrderItemService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Map;

/**
 * 订单项信息
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:39:31
 */
@RestController
@RequestMapping("/order/item")
public class OrderItemController {

    @Resource
    private IOrderItemService orderItemService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = orderItemService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		OrderItem orderItem = orderItemService.getById(id);

        return R.ok().put("orderItem", orderItem);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody OrderItem orderItem){
		orderItemService.save(orderItem);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public R update(@RequestBody OrderItem orderItem){
		orderItemService.updateById(orderItem);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		orderItemService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
