package com.samphanie.jxmall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ZSY
 */
@SpringBootApplication
@EnableDiscoveryClient
public class JxmallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(JxmallOrderApplication.class, args);
    }

}
