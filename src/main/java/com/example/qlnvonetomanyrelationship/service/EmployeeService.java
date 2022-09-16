package com.example.qlnvonetomanyrelationship.service;
import com.example.qlnvonetomanyrelationship.model.Employee;
public interface EmployeeService {
     void createEmployee(Employee emp);
     Employee findEmployeeById(long id);
     Employee findAllEmployee();
     Employee updateEmployeeById(long id, Employee emp);
     Employee saveEmployee(Employee emp);
     void deleteEmployeeById(long id);
}
