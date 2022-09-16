package com.example.qlnvonetomanyrelationship.service.impl;


import com.example.qlnvonetomanyrelationship.model.Employee;
import com.example.qlnvonetomanyrelationship.repository.EmployeeRepository;
import com.example.qlnvonetomanyrelationship.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void createEmployee(Employee emp){
        employeeRepository.save(emp);
    }

    @Override
    public Employee findEmployeeById(long id){
        Employee empFound = employeeRepository.findById(id).orElse(null);
        return empFound;
    }

    @Override
    public Employee findAllEmployee(){
        return (Employee) employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployeeById(long id, Employee emp){
        Employee empFound = employeeRepository.findById(id).orElse(null);
        empFound.setId(emp.getId());
        empFound.setName(emp.getName());
        empFound.setPhone(emp.getPhone());
        empFound.setAddress(emp.getAddress());
        empFound.setPosition(emp.getPosition());
        empFound.setSalary(emp.getSalary());

        return employeeRepository.save(empFound);
    }

    @Override
    public void deleteEmployeeById(long id){
        Employee empFound = employeeRepository.findById(id).orElse(null);
        employeeRepository.deleteById(empFound.getId());

    }

    @Override
    public Employee saveEmployee(Employee emp){
        employeeRepository.save(emp);
        return emp;
    }










}

