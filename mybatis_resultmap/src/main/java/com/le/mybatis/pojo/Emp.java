package com.le.mybatis.pojo;

public class Emp {
    private Integer empid;
    private String empname;
    private Integer age;
    private String gender;
    private Integer deptid;

    @Override
    public String toString() {
        return "Emp{" +
                "empid=" + empid +
                ", empname='" + empname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", deptid=" + deptid +
                '}';
    }

    public Emp() {
    }

    public Emp(Integer empid, String empname, Integer age, String gender, Integer deptid) {
        this.empid = empid;
        this.empname = empname;
        this.age = age;
        this.gender = gender;
        this.deptid = deptid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }
}
