package com.test.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.test.pojo.Dept;
import com.test.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wangjs6
 * @version 1.0
 * @Description:
 * @date: 2019/6/20 22:35
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping("/dept/add")
    public int add(@RequestBody Dept dept) {
        if(dept.getDb_source() == null && dept.getDName() == null){
            System.out.println(dept);
            return 0;
        }
        return deptService.insertSelective(dept);
    }

    @RequestMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable Long id){
        Dept dept = deptService.selectByPrimaryKey((long) id);
        if(dept == null){
            throw new RuntimeException("该id"+id+"没有对应的信息。");
        }
        return dept;
    }

    @GetMapping("/dept/get")
    public List<Dept> get(){
        return deptService.selectAll();
    }

    public Dept processHystrix_Get(@PathVariable("id") Long id){
        return new Dept().setDeptNo(id).setDName("该ID:"+id+"没有对应的信息，null--@HystrixCommand")
                .setDb_source("no this database in MySQL");
    }
}
