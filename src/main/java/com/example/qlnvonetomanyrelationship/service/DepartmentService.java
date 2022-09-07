package com.example.qlnvonetomanyrelationship.service;

import com.example.qlnvonetomanyrelationship.model.Department;

import java.util.List;

public interface DepartmentService {

        Department findById(long department_Id);

        void save(Department dpm);
}
