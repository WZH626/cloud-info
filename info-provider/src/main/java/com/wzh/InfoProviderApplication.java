package com.wzh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class InfoProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfoProviderApplication.class, args);
        System.out.println("生产者启动成功");
    }

}
