package com.example.qlnvonetomanyrelationship.service;

import com.example.qlnvonetomanyrelationship.model.Department;



public interface DepartmentService {

        Department getDepartmentById(long departmentId);



        Department getAllDepartment();

        void createDepartment(Department dpm);

        Department updateDepartment(long departmentId, Department dpm);

        public void deleteDepartment(long departmentId);
}
