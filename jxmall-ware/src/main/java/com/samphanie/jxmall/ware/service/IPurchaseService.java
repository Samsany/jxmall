package com.samphanie.jxmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.ware.entity.Purchase;

import java.util.Map;

/**
 * 采购信息
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:45:33
 */
public interface IPurchaseService extends IService<Purchase> {

    PageUtils queryPage(Map<String, Object> params);
}

