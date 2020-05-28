package com.samphanie.jxmall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.samphanie.jxmall.product.entity.BrandEntity;
import com.samphanie.jxmall.product.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
@Slf4j
class JxmallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");

        brandService.save(brandEntity);
        log.info("【保存成功】");

    }

    @Test
    void list() {

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));

        list.forEach(System.out::println);

    }

}
