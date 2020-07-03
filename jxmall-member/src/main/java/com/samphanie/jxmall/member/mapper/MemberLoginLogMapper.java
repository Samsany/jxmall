package com.samphanie.jxmall.member.mapper;

import com.samphanie.jxmall.member.entity.MemberLoginLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:43:15
 */
@Mapper
public interface MemberLoginLogMapper extends BaseMapper<MemberLoginLog> {
	
}
