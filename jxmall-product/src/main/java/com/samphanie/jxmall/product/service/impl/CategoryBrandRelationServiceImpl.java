package com.samphanie.jxmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import com.samphanie.jxmall.product.entity.Brand;
import com.samphanie.jxmall.product.entity.Category;
import com.samphanie.jxmall.product.mapper.BrandMapper;
import com.samphanie.jxmall.product.mapper.CategoryMapper;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.product.mapper.CategoryBrandRelationMapper;
import com.samphanie.jxmall.product.entity.CategoryBrandRelation;
import com.samphanie.jxmall.product.service.ICategoryBrandRelationService;

import javax.annotation.Resource;

@Service
public class CategoryBrandRelationServiceImpl extends ServiceImpl<CategoryBrandRelationMapper, CategoryBrandRelation> implements ICategoryBrandRelationService {

    @Resource
    private BrandMapper brandMapper;
    @Resource
    private CategoryMapper categoryMapper;


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryBrandRelation> page = this.page(
                new Query<CategoryBrandRelation>().getPage(params),
                new QueryWrapper<CategoryBrandRelation>()
        );

        return new PageUtils(page);
    }

    @Override
    public void saveDetail(CategoryBrandRelation categoryBrandRelation) {
        Long brandId = categoryBrandRelation.getBrandId();
        Long catelogId = categoryBrandRelation.getCatelogId();

        // 1.查询详细名字
        Brand brand = brandMapper.selectById(brandId);
        Category category = categoryMapper.selectById(catelogId);

        categoryBrandRelation.setBrandName(brand.getName());
        categoryBrandRelation.setCatelogName(category.getName());

        save(categoryBrandRelation);


    }

    @Override
    public void updateBrand(Long brandId, String name) {
        CategoryBrandRelation brandRelation = new CategoryBrandRelation();
        brandRelation.setBrandId(brandId);
        brandRelation.setBrandName(name);

        update(brandRelation, new UpdateWrapper<CategoryBrandRelation>()
            .lambda().eq(CategoryBrandRelation::getBrandId, brandId)
        );
    }

    @Override
    public void updateCategory(Long catId, String name) {
        // brandMapper.updateCategory(catId, name);

        boolean update = new LambdaUpdateChainWrapper<CategoryBrandRelation>(baseMapper)
                .set(CategoryBrandRelation::getCatelogName, name)
                .eq(CategoryBrandRelation::getCatelogId, catId)
                .update();

    }
}