package com.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangjs6
 * @version 1.0
 * @Description: 自定义Ribbon访问规则类，不可与主启动类同包
 * @date: 2019/6/24 17:43
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule(); //随机
    }
}
