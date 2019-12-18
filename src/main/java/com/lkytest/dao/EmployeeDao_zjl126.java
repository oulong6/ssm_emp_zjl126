package com.lkytest.dao;

import com.lkytest.entity.Employee_zjl126;
import org.apache.ibatis.annotations.Param;

public interface EmployeeDao_zjl126 {
    int saveEmployee(Employee_zjl126 employee);
    Employee_zjl126 getEmployee(@Param("name") String name,@Param("password") String password);
}
