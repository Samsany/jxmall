package com.samphanie.jxmall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.ware.mapper.WareInfoMapper;
import com.samphanie.jxmall.ware.entity.WareInfo;
import com.samphanie.jxmall.ware.service.IWareInfoService;

@Service
public class WareInfoServiceImpl extends ServiceImpl<WareInfoMapper, WareInfo> implements IWareInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WareInfo> page = this.page(
                new Query<WareInfo>().getPage(params),
                new QueryWrapper<WareInfo>()
        );

        return new PageUtils(page);
    }

}