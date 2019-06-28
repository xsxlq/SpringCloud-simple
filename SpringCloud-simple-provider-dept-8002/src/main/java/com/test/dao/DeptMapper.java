package com.test.dao;

import com.test.pojo.Dept;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DeptMapper {
    int deleteByPrimaryKey(Long deptno);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Long deptno);

    List<Dept> selectAll();

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}