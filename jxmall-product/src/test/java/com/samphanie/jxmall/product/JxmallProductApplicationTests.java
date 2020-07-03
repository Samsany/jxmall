package com.samphanie.jxmall.product;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.samphanie.jxmall.product.entity.Brand;
import com.samphanie.jxmall.product.mapper.BrandMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@Slf4j
class JxmallProductApplicationTests {

  @Resource private BrandMapper brandMapper;

  @Test
  void add() {
    Brand brand = new Brand();

    brand.setBrandId(1L);
    brand.setDescript("华为");
    int insert = brandMapper.insert(brand);

    Assertions.assertEquals(1, insert);

  }

  @Test
  void list() {
    List<Brand> list = new LambdaQueryChainWrapper<>(brandMapper).ge(Brand::getBrandId, 1L).list();

    list.forEach(e -> System.out.println(e));
  }
}
