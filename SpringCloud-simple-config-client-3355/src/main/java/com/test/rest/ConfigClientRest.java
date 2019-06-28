package com.test.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangjs6
 * @version 1.0
 * @Description:
 * @date: 2019/6/28 19:06
 */
@RestController
public class ConfigClientRest {

    @Value("${spring.application.name}")
    private String applicateionName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;

    @GetMapping("/config")
    public String getConfig(){
        String str = "applicationName:"+applicateionName+"\neurekaServers:"+eurekaServers+"\nport:"+port;
        System.out.println(str);
        return str;
    }
}
