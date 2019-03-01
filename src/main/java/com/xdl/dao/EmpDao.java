package com.xdl.dao;

import com.xdl.bean.Emp;

import java.util.List;

public interface EmpDao {

    public List<Emp> empFindAll();

    public List<Emp> findById(int empNo);

    public List<Emp> findemp(Emp emp);



}
