package com.samphanie.jxmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.ware.entity.WareInfo;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:45:33
 */
public interface IWareInfoService extends IService<WareInfo> {

    PageUtils queryPage(Map<String, Object> params);
}

