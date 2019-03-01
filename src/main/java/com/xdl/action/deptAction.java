package com.xdl.action;


import com.opensymphony.xwork2.ModelDriven;
import com.xdl.bean.Dept;
import com.xdl.bean.Emp;
import com.xdl.dao.DeptDao;
import com.xdl.dao.EmpDao;
import com.xdl.dao.EmpDaoImp;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@Namespace("/ssh")   //命名空间 访问时候 需要加上 /ssh
@ParentPackage("json-default")
public class deptAction  {


    private List<Dept> depts;

    private Dept dept;

    private Emp emp;

    private List<Emp> emps;

    private int empNo;

    private int deptNo;

    @Autowired
    private EmpDao empDao;

    @Autowired
    private DeptDao deptDao;

    @Action(value = "findAll",results = {    // 当需要调用该action时需要加上/findAll  即/ssh/findAll
            @Result(name = "success",type = "json",params = {"root","depts"})})  // 当返回success时，返回json格式，depts
                                                                                  // params 可以选择当前类属性进行返回（当有多个属性时，只返回depts）
    public String findAll(){
        depts = deptDao.findAll();
        return "success";
    }

    @Action(value = "empfindAll",results = {
            @Result(name = "success",type = "json",params = {"root","emps"})})
    public String empfindAll(){
         emps = empDao.empFindAll();
        return "success";
    }

    @Action(value = "empfindById",results = {@Result(name = "success",type = "json")})
    public String empfindById(){
         emps = empDao.findById(empNo);
        return "success";
    }

    @Action(value = "findemp",results = {@Result(name = "success",type = "json")})
    public String findemp(){
        Emp emp1=new Emp();
        emp1.setDeptNo(deptNo);
        emp1.setEmpNo(empNo);
        emps = empDao.findemp(emp1);



        return "success";
    }












    public List<Dept> getDepts() {
        return depts;
    }

    public void setDepts(List<Dept> depts) {
        this.depts = depts;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }


}
