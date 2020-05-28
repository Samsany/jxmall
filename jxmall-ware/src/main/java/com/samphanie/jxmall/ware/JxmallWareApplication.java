package com.samphanie.jxmall.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JxmallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(JxmallWareApplication.class, args);
    }

}
