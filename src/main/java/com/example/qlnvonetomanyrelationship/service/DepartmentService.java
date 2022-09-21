package com.example.qlnvonetomanyrelationship.service;

import com.example.qlnvonetomanyrelationship.dto.DepartmentDto;
import com.example.qlnvonetomanyrelationship.model.Department;

import java.util.List;


public interface DepartmentService {

    Department getDepartmentById(long id);


    List<Department> getAllDepartment();

    Department createDepartment(Department dpm);

    Department updateDepartment(Department dpm);

    void deleteDepartment(long id);
}
