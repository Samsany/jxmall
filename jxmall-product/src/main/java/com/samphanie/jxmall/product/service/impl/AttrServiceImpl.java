package com.samphanie.jxmall.product.service.impl;

import com.samphanie.jxmall.product.entity.AttrAttrgroupRelation;
import com.samphanie.jxmall.product.mapper.AttrAttrgroupRelationMapper;
import com.samphanie.jxmall.product.vo.AttrVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.common.utils.PageUtils;
import com.samphanie.common.utils.Query;

import com.samphanie.jxmall.product.mapper.AttrMapper;
import com.samphanie.jxmall.product.entity.Attr;
import com.samphanie.jxmall.product.service.IAttrService;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class AttrServiceImpl extends ServiceImpl<AttrMapper, Attr> implements IAttrService {

    @Resource
    private AttrAttrgroupRelationMapper relationMapper;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Attr> page = this.page(
                new Query<Attr>().getPage(params),
                new QueryWrapper<Attr>()
        );

        return new PageUtils(page);
    }

    @Transactional
    @Override
    public void saveAttr(AttrVo attrVo) {
        Attr attr = new Attr();

        BeanUtils.copyProperties(attrVo, attr);
        // 保存基本数据
        save(attr);
        // 保存关联关系
        AttrAttrgroupRelation relation = new AttrAttrgroupRelation();
        relation.setAttrGroupId(attrVo.getAttrGroupId());
        relation.setAttrId(attr.getAttrId());
        relationMapper.insert(relation);


    }
}