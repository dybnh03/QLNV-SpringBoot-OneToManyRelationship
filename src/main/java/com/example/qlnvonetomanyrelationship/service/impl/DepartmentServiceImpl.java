package com.example.qlnvonetomanyrelationship.service.impl;

import com.example.qlnvonetomanyrelationship.model.Department;
import com.example.qlnvonetomanyrelationship.repository.DepartmentRepository;
import com.example.qlnvonetomanyrelationship.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DepartmentServiceImpl implements DepartmentService {
//    @Autowired
//    private ModelMapper
    private  DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }



    @Override
    public void createDepartment(Department dpm){
         departmentRepository.save(dpm);
    }


    @Override
    public Department getDepartmentById(long departmentId) {
        return this.departmentRepository.findById(departmentId).orElse(null);

    }

    @Override
    public Department getAllDepartment(){
        return (Department) departmentRepository.findAll();
    }

    @Override
    public Department updateDepartment(long departmentId, Department dpm){
        Department dpmFound =departmentRepository.findById(departmentId).orElse(null);
        dpmFound.setDepartmentId(dpm.getDepartmentId());
        dpmFound.setDepartmentName(dpm.getDepartmentName());
    return departmentRepository.save(dpmFound);
    }

    @Override
    public void deleteDepartment(long departmentId){
        Department dpmFound = departmentRepository.findById(departmentId).orElse(null);
        departmentRepository.deleteById(dpmFound.getDepartmentId());
    }

}
