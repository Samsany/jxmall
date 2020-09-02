package com.samphanie.jxmall.product.service.impl;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.product.mapper.AttrGroupMapper;
import com.samphanie.jxmall.product.entity.AttrGroup;
import com.samphanie.jxmall.product.service.IAttrGroupService;

/**
 * @author Dries
 */
@Slf4j
@Service
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupMapper, AttrGroup> implements IAttrGroupService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrGroup> page = this.page(
                new Query<AttrGroup>().getPage(params),
                new QueryWrapper<AttrGroup>()
        );

        return new PageUtils(page);
    }

    @Override
    public PageUtils queryPage(Map<String, Object> params, Long catelogId) {

        log.info("=====》 {}", JSONUtil.toJsonStr(params));
        if (catelogId == 0) {
            IPage<AttrGroup> page = this.page(
                    new Query<AttrGroup>().getPage(params),
                    new QueryWrapper<AttrGroup>()
            );

            return new PageUtils(page);
        } else {
            String key = (String) params.get("key");
            LambdaQueryWrapper<AttrGroup> wrapper = new QueryWrapper<AttrGroup>().lambda().eq(AttrGroup::getCatelogId, catelogId);
            if (StrUtil.isNotEmpty(key)) {
                wrapper.and(e -> {
                    e.eq(AttrGroup::getAttrGroupId, key).or().like(AttrGroup::getAttrGroupName, key);
                });
            }

            IPage<AttrGroup> page = this.page(new Query<AttrGroup>().getPage(params),
                    wrapper);

            return new PageUtils(page);

        }

    }

}