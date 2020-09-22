package com.samphanie.jxmall.product.mapper;

import com.samphanie.jxmall.product.entity.Brand;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 品牌
 * 
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:41:16
 */
@Mapper
public interface BrandMapper extends BaseMapper<Brand> {

    void updateCategory(@Param("catId") Long catId,@Param("name") String name);
}
