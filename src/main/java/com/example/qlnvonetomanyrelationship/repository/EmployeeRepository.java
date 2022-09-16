package com.example.qlnvonetomanyrelationship.repository;

import com.example.qlnvonetomanyrelationship.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
