package com.test.service.impl;

import com.test.dao.DeptMapper;
import com.test.pojo.Dept;
import com.test.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangjs6
 * @version 1.0
 * @Description:
 * @date: 2019/6/20 22:30
 */

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public int deleteByPrimaryKey(Long deptno) {
        return deptMapper.deleteByPrimaryKey(deptno);
    }

    @Override
    public int insert(Dept record) {
        return deptMapper.insert(record);
    }

    @Override
    public int insertSelective(Dept record) {
        return deptMapper.insertSelective(record);
    }

    @Override
    public Dept selectByPrimaryKey(Long deptno) {
        return deptMapper.selectByPrimaryKey(deptno);
    }

    @Override
    public List<Dept> selectAll() {
        return deptMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKeySelective(Dept record) {
        return deptMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Dept record) {
        return deptMapper.updateByPrimaryKeySelective(record);
    }
}
