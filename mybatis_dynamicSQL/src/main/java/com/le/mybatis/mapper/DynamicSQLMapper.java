package com.le.mybatis.mapper;

import com.le.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {
    List<Emp> getEmpByCondition(Emp emp);
    void insertMoreEmp(@Param("emps") List<Emp> emps);
    List<Emp> getAllEmp();
    void deleteMoreEmp(@Param("empids") Integer[] empids);
}
