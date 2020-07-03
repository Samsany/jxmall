package com.samphanie.jxmall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.ware.mapper.PurchaseDetailMapper;
import com.samphanie.jxmall.ware.entity.PurchaseDetail;
import com.samphanie.jxmall.ware.service.IPurchaseDetailService;

@Service
public class PurchaseDetailServiceImpl extends ServiceImpl<PurchaseDetailMapper, PurchaseDetail> implements IPurchaseDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PurchaseDetail> page = this.page(
                new Query<PurchaseDetail>().getPage(params),
                new QueryWrapper<PurchaseDetail>()
        );

        return new PageUtils(page);
    }

}