package com.test.controller;

import com.test.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author wangjs6
 * @version 1.0
 * @Description:
 * @date: 2019/6/22 15:50
 */

@RestController
public class DeptController_Consumer {

    //    public static final String REST_URL_PREFIX = "http://localhost:8001";
    public static final String REST_URL_PREFIX = "http://SPRINGCLOUD-SIMPLE-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/add")
    public Integer add(@ModelAttribute Dept dept) {
        System.out.println(dept);
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Integer.class);
    }

    @GetMapping("/consumer/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        System.out.println(id);
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @GetMapping("/consumer/get")
    public List<Dept> get() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get", List.class);
    }
}
