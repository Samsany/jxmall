package com.samphanie.jxmall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ZSY
 */
@SpringBootApplication
@EnableDiscoveryClient
public class JxmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(JxmallCouponApplication.class, args);
    }

}
