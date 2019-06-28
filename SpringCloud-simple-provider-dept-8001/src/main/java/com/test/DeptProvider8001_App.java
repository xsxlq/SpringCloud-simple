package com.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wangjs6
 * @version 1.0
 * @Description:
 * @date: 2019/6/22 14:55
 */

@SpringBootApplication
@MapperScan("com.test.dao")
@EnableEurekaClient
public class DeptProvider8001_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_App.class,args);
    }
}
