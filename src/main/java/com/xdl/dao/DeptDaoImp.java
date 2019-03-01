package com.xdl.dao;


import com.xdl.bean.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DeptDaoImp implements DeptDao{

    @Autowired
    private HibernateTemplate template;


    @Override
    public List<Dept> findAll() {
        List<Dept> depts = (List<Dept>) template.find("from Dept");
       return depts;
    }

    @Override
    public Dept findByDeptNo(int deptNo) {
        return null;
    }
}
