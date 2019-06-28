package com.test.service;

import com.test.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wangjs6
 * @version 1.0
 * @Description: 修改api工程，根据已经有的DeptClientService接口，新建一个实现了FallbackFactory接口的类
 *                  DeptClientServiceFallbackFactory
 * @date: 2019/6/24 18:27
 */
//@FeignClient(value = "SPRINGCLOUD-SIMPLE-DEPT")
@FeignClient(value = "SPRINGCLOUD-SIMPLE-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

//    @PostMapping("/dept/add")
//    public int add(@RequestBody Dept dept);
//
//    @RequestMapping("/dept/get/{id}")
//    public Dept get(@PathVariable Integer id);

    @GetMapping("/dept/get")
    public List<Dept> get();
}
