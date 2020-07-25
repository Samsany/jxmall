package com.samphanie.jxmall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) 排除数据库连接配置
@SpringBootApplication
public class JxmallGatewayApplication {

  public static void main(String[] args) {
    SpringApplication.run(JxmallGatewayApplication.class, args);
  }

}
