package com.test.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author wangjs6
 * @version 1.0
 * @Description:
 * @date: 2019/6/22 15:47
 */

@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced //spring cloud Ribbon 是基于Neflix实现的一套客户端 负载均衡的工具
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

//    @Bean
//    public IRule myRule(){
//        return new RandomRule();
//    }
}
