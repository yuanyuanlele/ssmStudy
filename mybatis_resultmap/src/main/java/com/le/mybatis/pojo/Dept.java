package com.le.mybatis.pojo;

import java.util.List;

public class Dept {
    private Integer deptid;
    private String deptname;
    private List<Emp> emps;

    @Override
    public String toString() {
        return "Dept{" +
                "deptid=" + deptid +
                ", deptname='" + deptname + '\'' +
                ", emps=" + emps +
                '}';
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    public Dept(List<Emp> emps) {
        this.emps = emps;
    }

    public Dept(Integer deptid, String deptname, List<Emp> emps) {
        this.deptid = deptid;
        this.deptname = deptname;
        this.emps = emps;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }
}
