package com.xdl.bean;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "DEPT")
public class Dept implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "deptNo")
    private int deptNo;
    @Column(name = "dName")
    private String dName;
    @Column(name = "loc")
    private String loc;



    public Dept() {
    }






    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }



    @Override
    public String toString() {
        return "Dept{" +
                "deptNo=" + deptNo +
                ", dName='" + dName + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
