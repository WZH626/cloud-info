package com.wzh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class InfoEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfoEurekaApplication.class, args);
        System.out.println("注册中心启动成功");
    }

}
