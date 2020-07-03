package com.samphanie.jxmall.coupon.mapper;

import com.samphanie.jxmall.coupon.entity.CouponSpuRelation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:42:28
 */
@Mapper
public interface CouponSpuRelationMapper extends BaseMapper<CouponSpuRelation> {
	
}
