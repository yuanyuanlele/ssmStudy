package com.le.mybatis.mapper;

import com.le.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface EmpMapper {
    Emp getEmpByEmpIdOld(@Param("empid")Integer empid);
    Emp getEmpByEmpId(@Param("empid") Integer empid);
    Emp getEmpAndDeptByEmpId(@Param("empid")Integer empid);
    Emp getEmpAndDeptByStep1(@Param("empid")Integer empid);
    List<Emp> getDeptAndEmpByStep2(@Param("deptid") Integer deptid);
}
