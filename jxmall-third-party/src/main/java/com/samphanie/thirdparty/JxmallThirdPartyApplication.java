package com.samphanie.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Dries
 */
@EnableDiscoveryClient
@SpringBootApplication
public class JxmallThirdPartyApplication {

    public static void main(String[] args) {
        SpringApplication.run(JxmallThirdPartyApplication.class, args);
    }

}
