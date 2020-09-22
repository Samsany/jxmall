package com.samphanie.jxmall.product.service.impl;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.samphanie.jxmall.product.service.ICategoryBrandRelationService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.product.mapper.BrandMapper;
import com.samphanie.jxmall.product.entity.Brand;
import com.samphanie.jxmall.product.service.IBrandService;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

    @Resource
    private ICategoryBrandRelationService categoryBrandRelationService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {

        // 1.获取Key
        String key = (String) params.get("key");

        QueryWrapper<Brand> queryWrapper = new QueryWrapper<>();

        if (StrUtil.isNotEmpty(key)) {
            queryWrapper.lambda().eq(Brand::getBrandId, key)
                    .or().like(Brand::getName, key);
        }

        IPage<Brand> page = this.page(
                new Query<Brand>().getPage(params),
                queryWrapper
        );
        // 解决查出的total为0
        page.setTotal(page.getRecords().size());

        return new PageUtils(page);
    }

    @Transactional
    @Override
    public void updateDetail(Brand brand) {
        // 保证字段的数据一致
        updateById(brand);

        if (StrUtil.isNotEmpty(brand.getName())) {
            // 同步更新其他关联表中的数据
            categoryBrandRelationService.updateBrand(brand.getBrandId(), brand.getName());

            // TODO 更新其他关联
        }
    }

}