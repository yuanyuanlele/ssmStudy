package com.le.ssm.service;

import com.github.pagehelper.PageInfo;
import com.le.ssm.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    PageInfo<Employee> getEmployeeList(Integer pageNum);
}
