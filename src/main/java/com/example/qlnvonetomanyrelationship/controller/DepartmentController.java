package com.example.qlnvonetomanyrelationship.controller;

import com.example.qlnvonetomanyrelationship.model.Department;
import com.example.qlnvonetomanyrelationship.model.Employee;
import com.example.qlnvonetomanyrelationship.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@RestController

@RequestMapping("department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;


    @GetMapping("/addDepartment")
    public void addDepartment(){
        Employee emp1 = new Employee("Dat", "001", "HN", "employee", 2.2);
        Employee emp2 = new Employee("Binh","003", "TH", "employee",2.2);

        Set<Employee> emp = new HashSet<Employee>();
        emp.add(emp1);
        emp.add(emp2);


        Department dpm = new Department("Phong San Xuat");
        dpm.setEmployee(emp);
        emp1.setDepartment(dpm);
        emp2.setDepartment(dpm);


        departmentService.save(dpm);
    }

    @GetMapping("/id/{id}")
    public Department getDepartmentById(@PathVariable long id) {
        return this.departmentService.findById(id);
    }



}
