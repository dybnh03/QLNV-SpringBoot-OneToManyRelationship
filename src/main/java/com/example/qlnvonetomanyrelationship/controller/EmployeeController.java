package com.example.qlnvonetomanyrelationship.controller;

import com.example.qlnvonetomanyrelationship.model.Employee;
import com.example.qlnvonetomanyrelationship.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/createEmployee")
    public void createEmployee(@RequestBody Employee emp){
        employeeService.createEmployee(emp);
    }

    @GetMapping("/getEmployeeById/{id}")
    public Employee getEmployeeById(@PathVariable long id){
        Employee empFound = employeeService.findEmployeeById(id);
        return empFound;
    }

    @GetMapping("/getAllEmployee")
    public Employee getAllEmployee(){
        return employeeService.findAllEmployee();
    }

    @PutMapping("/updateEmployeeById/{id}")
    public void updateEmployeeById(@PathVariable long id, @RequestBody Employee emp){
        Employee empFound = employeeService.findEmployeeById(id);
        empFound.setId(emp.getId());
        empFound.setName(empFound.getName());
        empFound.setPhone(emp.getPhone());
        empFound.setPosition(emp.getPosition());
        empFound.setAddress(emp.getAddress());
        empFound.setSalary(emp.getSalary());

        employeeService.updateEmployeeById(empFound.getId(), empFound);


    }

    @DeleteMapping("/deleteEmployeeById/{id}")
    public void deleteEmployeeById(@PathVariable long id){
        Employee empFound = employeeService.findEmployeeById(id);
        employeeService.deleteEmployeeById(empFound.getId());
    }



}
