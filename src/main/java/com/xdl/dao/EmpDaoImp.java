package com.xdl.dao;

import com.xdl.bean.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmpDaoImp implements EmpDao{

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public List<Emp> empFindAll() {

        List<Emp> emps = (List<Emp>) hibernateTemplate.find("from Emp");

        return emps;
    }

    @Override
    public List<Emp> findById(int empNo) {

        List<Emp> emps = (List<Emp>) hibernateTemplate.find("select e.empNo,e.mgr from Emp e where e.empNo=?0", empNo);


        return emps;
    }

    @Override
    public List<Emp> findemp(Emp emp) {

        List<Emp> emps = (List<Emp>) hibernateTemplate.findByValueBean("from Emp where empNo=:empNo and deptNo=:deptNo", emp);

        return emps;
    }
}
