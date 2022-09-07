package com.example.qlnvonetomanyrelationship.service.impl;

import com.example.qlnvonetomanyrelationship.model.Department;
import com.example.qlnvonetomanyrelationship.repository.DepartmentRepository;
import com.example.qlnvonetomanyrelationship.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private  DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department findById(long department_Id) {
        return this.departmentRepository.findById(department_Id).orElse(null);

    }





    @Override
    public void save(Department dpm){
        this.departmentRepository.save(dpm);
    }

}
