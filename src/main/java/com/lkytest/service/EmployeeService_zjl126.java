package com.lkytest.service;

import com.lkytest.entity.Employee_zjl126;

public interface EmployeeService_zjl126 {
    int saveEmployee(Employee_zjl126 employee);
    Employee_zjl126 getEmployee(String name,String password);
}
