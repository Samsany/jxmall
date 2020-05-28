package com.samphanie.jxmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JxmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(JxmallProductApplication.class, args);
    }

}
