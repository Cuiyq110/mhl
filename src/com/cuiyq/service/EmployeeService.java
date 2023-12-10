package com.cuiyq.service;

import com.cuiyq.dao.EmployeeDao;
import com.cuiyq.domain.Employee;

/**
 * @author Cuiyq
 * @version 1.0
 * describe：该类完成对employee表的各种操作(通过调用EmployeeDAO对象完成)
 */
@SuppressWarnings("all")
public class EmployeeService {
    private EmployeeDao employeeDao = new EmployeeDao();

    //根据empId和empPwd返回一个employee对象
    public Employee getEmployee(String empId, String empPwd) {
       return employeeDao.querySingle("select * from employee where empId = ? and pwd = md5(?)", Employee.class,empId,empPwd);
    }

//    根据empId返回一个employee对象
    public Employee getEmployee(String empId) {
        return  employeeDao.querySingle("select * from employee where empId =?", Employee.class,empId);
    }
}
