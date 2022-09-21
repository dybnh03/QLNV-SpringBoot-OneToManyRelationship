package com.example.qlnvonetomanyrelationship.service;
import com.example.qlnvonetomanyrelationship.model.Employee;

import java.util.List;

public interface EmployeeService {
     Employee createEmployee(Employee emp);
     Employee findEmployeeById(long id);
     List<Employee> findAllEmployee();
     Employee updateEmployeeById(Employee emp);

     void deleteEmployeeById(long id);
}
