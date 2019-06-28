package com.test.controller;

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
    public Dept get(@PathVariable Integer id){
        System.out.println(id);
        return deptService.selectByPrimaryKey((long) id);
    }

    @GetMapping("/dept/get")
    public List<Dept> get(){
        return deptService.selectAll();
    }
}
