package com.lkytest.service.impl;

import com.lkytest.dao.EmployeeDao_zjl126;
import com.lkytest.entity.Employee_zjl126;
import com.lkytest.service.EmployeeService_zjl126;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService_zjl126Impl implements EmployeeService_zjl126 {
    @Autowired
    private EmployeeDao_zjl126 employeeDao;

    public int saveEmployee(Employee_zjl126 employee) {
        return employeeDao.saveEmployee(employee);
    }

    public Employee_zjl126 getEmployee(String name, String password) {
        return employeeDao.getEmployee(name,password);
    }
}
