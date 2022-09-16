package com.example.qlnvonetomanyrelationship.repository;

import com.example.qlnvonetomanyrelationship.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {


}
