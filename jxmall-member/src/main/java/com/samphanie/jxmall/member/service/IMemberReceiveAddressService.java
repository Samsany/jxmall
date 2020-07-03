package com.samphanie.jxmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.jxmall.member.entity.MemberReceiveAddress;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author dries
 * @email samphsanie@gmail.com
 * @date 2020-07-03 22:43:15
 */
public interface IMemberReceiveAddressService extends IService<MemberReceiveAddress> {

    PageUtils queryPage(Map<String, Object> params);
}

