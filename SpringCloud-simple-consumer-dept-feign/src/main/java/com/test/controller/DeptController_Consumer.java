package com.test.controller;

import com.test.pojo.Dept;
import com.test.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wangjs6
 * @version 1.0
 * @Description:
 * @date: 2019/6/22 15:50
 */

@RestController
public class DeptController_Consumer {


    @Autowired
    private DeptClientService deptClientService;

//    @GetMapping("/consumer/add")
//    public Integer add(@ModelAttribute Dept dept) {
//        return deptClientService.add(dept);
//    }
//
//    @GetMapping("/consumer/get/{id}")
//    public Dept get(@PathVariable("id") Long id) {
//        return deptClientService.get(Integer.valueOf(id+""));
//    }

    @GetMapping("/consumer/get")
    public List<Dept> get() {
        return deptClientService.get();
    }
}
