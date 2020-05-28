package com.samphanie.jxmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.samphanie.jxmall.member.fegin")
public class JxmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(JxmallMemberApplication.class, args);
    }

}
