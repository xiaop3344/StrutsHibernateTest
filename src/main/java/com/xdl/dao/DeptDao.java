package com.xdl.dao;

import com.xdl.bean.Dept;

import java.util.List;

public interface DeptDao {
    public List<Dept> findAll();
    public Dept findByDeptNo(int deptNo);




}
