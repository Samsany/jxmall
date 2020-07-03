package com.samphanie.jxmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.ware.entity.WareOrderTask;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:45:33
 */
public interface IWareOrderTaskService extends IService<WareOrderTask> {

    PageUtils queryPage(Map<String, Object> params);
}

