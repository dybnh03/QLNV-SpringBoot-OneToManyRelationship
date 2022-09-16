package com.example.qlnvonetomanyrelationship.controller;

import com.example.qlnvonetomanyrelationship.model.Department;
import com.example.qlnvonetomanyrelationship.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController

@RequestMapping("department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/createDepartment")
    public void createDepartment(@RequestBody Department dpm){
       departmentService.createDepartment(dpm);
    }

    @PutMapping("/updateDepartmentById/{id}")
    public Department updateDepartment(@PathVariable long departmentId, @RequestBody Department dpm){
        Department dpmFound = departmentService.getDepartmentById(departmentId);
        dpmFound.setDepartmentId(dpm.getDepartmentId());
        dpmFound.setDepartmentName(dpm.getDepartmentName());
        return departmentService.updateDepartment(dpmFound.getDepartmentId(), dpmFound);
    }

    @GetMapping("/getAllDepartment")
    public Department getAllDepartment(){
        return departmentService.getAllDepartment();
    }


    @GetMapping("/getDepartmentById/{id}")
    public Department getDepartmentById(@PathVariable long departmentId) {
        return departmentService.getDepartmentById(departmentId);
    }

    @DeleteMapping("/deleteDepartmentByid/{id}")
    public void deleteDepartment(@PathVariable long departmentId){
        Department dpmFound = departmentService.getDepartmentById(departmentId);
        departmentService.deleteDepartment(dpmFound.getDepartmentId());
    }












}
