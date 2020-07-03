package com.samphanie.jxmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.ware.entity.PurchaseDetail;

import java.util.Map;

/**
 * 
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:45:33
 */
public interface IPurchaseDetailService extends IService<PurchaseDetail> {

    PageUtils queryPage(Map<String, Object> params);
}

