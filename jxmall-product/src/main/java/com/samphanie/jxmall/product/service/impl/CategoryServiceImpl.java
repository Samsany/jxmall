package com.samphanie.jxmall.product.service.impl;

import com.samphanie.jxmall.product.service.ICategoryBrandRelationService;
import com.samphanie.jxmall.product.vo.CategoryVo;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.product.mapper.CategoryMapper;
import com.samphanie.jxmall.product.entity.Category;
import com.samphanie.jxmall.product.service.ICategoryService;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author Dries
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

    @Resource
    private CategoryMapper categoryMapper;
    @Resource
    private ICategoryBrandRelationService categoryBrandRelationService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Category> page = this.page(
                new Query<Category>().getPage(params),
                new QueryWrapper<Category>()
        );

        return new PageUtils(page);
    }

    /**
     * 查出所有的分类以及子分类，以树形结构组装
     */
    @Override
    public List<CategoryVo> listWithTree() {
        // 1.查出所有的分类
        // List<Category> categories = baseMapper.selectList(null);
        List<CategoryVo> categories = categoryMapper.pages();

        // 2. 树形结构组装
        // 2.1 找到所有的一级分类
        // List<Category> level1Menus = categories.stream().filter(e -> e.getParentCid() == 0).collect(Collectors.toList());
        List<CategoryVo> level1Menus = categories.stream()
                .filter(e -> e.getParentCid() == 0)
                .peek(menu -> menu.setChildren(getChildrens(menu, categories)))
                .sorted(Comparator.comparingInt(menu -> (menu.getSort() == null ? 0 : menu.getSort())))
                .collect(Collectors.toList());
        return level1Menus;
    }

    /**
     * [1, 21, 221]
     * 找到catelogId的完整路径
     */
    @Override
    public Long[] findCatelogPath(Long catelogId) {

        List<Long> paths = new ArrayList<>();
        List<Long> parentPath = findParentPath(catelogId, paths);

        // 将集合逆序排列
        Collections.reverse(parentPath);
        return parentPath.toArray(new Long[parentPath.size()]);
    }

    // [221, 21 , 1]
    private List<Long> findParentPath(Long catelogId, List<Long> paths){
        // 1.收集当前节点ID
        paths.add(catelogId);

        Category byId = getById(catelogId);

        if (byId.getParentCid() != 0) {
            findParentPath(byId.getParentCid(), paths);
        }

        return paths;

    }

    /**
     *递归查找所有的菜单子菜单
     */
    private List<CategoryVo> getChildrens(CategoryVo root, List<CategoryVo> all) {

        List<CategoryVo> children = all.stream().filter(e -> e.getParentCid().equals(root.getCatId()))
                // 找到子菜单
                .peek(menu -> menu.setChildren(getChildrens(menu, all)))
                // 菜单排序 sorted((a,b)-> {return a.sort - b.getsort})
                // .sorted((menu1,menu2) -> {
                //    return  (menu1.getSort() == null ? 0: menu1.getSort()) - (menu2.getSort() == null ? 0: menu2.getSort());
                //  })
                .sorted(Comparator.comparingInt(menu -> (menu.getSort() == null ? 0 : menu.getSort())))
                .collect(Collectors.toList());

        return children;
    }

    /**
     * 根据ID删除/批量删除 菜单
     *
     * @param asList
     */
    @Override
    public void removeMenuByIds(List<Long> asList) {

        // TODO 检查当前删除的菜单是否被别的引用
        baseMapper.deleteBatchIds(asList);
    }

    /**
     * 级联更新所有关联数据
     * @param category
     */
    @Transactional
    @Override
    public void updateCascade(Category category) {
        updateById(category);

        categoryBrandRelationService.updateCategory(category.getCatId(), category.getName());
    }
}