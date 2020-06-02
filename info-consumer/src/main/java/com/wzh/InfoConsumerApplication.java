package com.wzh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class InfoConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfoConsumerApplication.class, args);
        System.out.println("消费者启动成功");
    }

}
