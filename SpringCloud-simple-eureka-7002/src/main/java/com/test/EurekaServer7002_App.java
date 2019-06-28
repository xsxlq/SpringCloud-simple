package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wangjs6
 * @version 1.0
 * @Description:
 * @date: 2019/6/23 14:16
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002_App {
    public static void main(String[] args) {

        SpringApplication.run(EurekaServer7002_App.class,args);
    }
}
