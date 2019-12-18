package com.lkytest.controller;

import com.lkytest.entity.Employee_zjl126;
import com.lkytest.service.EmployeeService_zjl126;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class EmployeeController_zjl126 {
    @Autowired
    private EmployeeService_zjl126 employeeService;
    @RequestMapping(value = "register",method = RequestMethod.POST)
    public String register(Employee_zjl126 employee_zjl126, HttpSession session){
        String name = employee_zjl126.getName();
        String password = employee_zjl126.getPassword();
        if (name==null || "".equals(name)){
            session.setAttribute("error","用户名不能为空！");
            return "register";
        }
        if (password==null || "".equals(password)){
            session.setAttribute("error","密码不能为空！");
            return "register";
        }
        employeeService.saveEmployee(employee_zjl126);
        return "redirect:";
    }
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(String name,String password,HttpSession session){
        if (name == null || "".equals(name)) {
            session.setAttribute("error","员工名或密码为空");
            return "login";
        }
        if (password == null || "".equals(password)){
            session.setAttribute("error","员工名或密码为空");
            return "login";
        }
        Employee_zjl126 employee = employeeService.getEmployee(name, password);
        if (employee==null){
            session.setAttribute("error","用户名密码错误!");
            return "login";
        }
        session.setAttribute("name",employee.getName());
        return "loginsuccess";
    }
    @RequestMapping(value = "register",method = RequestMethod.GET)
    public String register(){
        return "register";
    }

}
