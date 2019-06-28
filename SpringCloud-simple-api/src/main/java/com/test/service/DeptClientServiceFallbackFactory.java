package com.test.service;

import com.test.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangjs6
 * @version 1.0
 * @Description:
 * @date: 2019/6/27 18:48
 */
@Component //添加注解
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService(){

            @Override
            public List<Dept> get() {
                List<Dept> dept = new ArrayList<>();
                dept.add(new Dept().setDName("测试 服务 终端 效果--FallbackFactory"));
                return dept;
            }
        };
    }
}
