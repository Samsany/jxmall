package com.samphanie.jxmall.product.mapper;

import com.samphanie.jxmall.product.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:41:16
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
	
}