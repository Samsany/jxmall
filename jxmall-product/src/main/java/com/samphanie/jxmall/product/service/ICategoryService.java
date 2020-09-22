package com.samphanie.jxmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.product.entity.Category;
import com.samphanie.jxmall.product.vo.CategoryVo;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:41:16
 */
public interface ICategoryService extends IService<Category> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 查出所有的分类以及子分类，以树形结构组装
     */
    List<CategoryVo> listWithTree();

    /**
     * 根据ID删除/批量删除 菜单
     */
    void removeMenuByIds(List<Long> asList);

    /**
     * 找到catelogId的完整路径
     * 【父/子/孙】
     * @param catelogId
     * @return
     */
    Long[] findCatelogPath(Long catelogId);

    void updateCascade(Category category);
}

