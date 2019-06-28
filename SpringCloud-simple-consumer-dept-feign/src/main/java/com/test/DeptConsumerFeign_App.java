package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wangjs6
 * @version 1.0
 * @Description:
 * @date: 2019/6/22 16:07
 */
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.test"})
public class DeptConsumerFeign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign_App.class,args);
    }
}
