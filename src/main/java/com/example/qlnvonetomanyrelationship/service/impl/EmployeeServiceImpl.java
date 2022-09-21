package com.example.qlnvonetomanyrelationship.service.impl;


import com.example.qlnvonetomanyrelationship.model.Employee;
import com.example.qlnvonetomanyrelationship.repository.EmployeeRepository;
import com.example.qlnvonetomanyrelationship.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee createEmployee(Employee emp){
        return employeeRepository.save(emp);
    }

    @Override
    public Employee findEmployeeById(long id){
        Employee empFound = employeeRepository.findById(id).orElse(null);
        return empFound;
    }

    @Override
    public List<Employee> findAllEmployee(){
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployeeById(Employee emp){

        return employeeRepository.save(emp);
    }

    @Override
    public void deleteEmployeeById(long id){
        Employee empFound = employeeRepository.findById(id).orElse(null);
        employeeRepository.deleteById(empFound.getEmployee_Id());

    }












}

