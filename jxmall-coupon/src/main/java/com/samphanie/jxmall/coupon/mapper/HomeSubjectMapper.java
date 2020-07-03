package com.samphanie.jxmall.coupon.mapper;

import com.samphanie.jxmall.coupon.entity.HomeSubject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 * 
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:42:28
 */
@Mapper
public interface HomeSubjectMapper extends BaseMapper<HomeSubject> {
	
}
