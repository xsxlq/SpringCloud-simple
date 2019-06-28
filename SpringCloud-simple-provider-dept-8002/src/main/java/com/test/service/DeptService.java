package com.test.service;

import com.test.pojo.Dept;

import java.util.List;

/**
 * @author wangjs6
 * @version 1.0
 * @Description:
 * @date: 2019/6/20 22:29
 */
public interface DeptService {
    int deleteByPrimaryKey(Long deptno);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Long deptno);

    List<Dept> selectAll();

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}
