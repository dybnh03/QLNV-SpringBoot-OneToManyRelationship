package com.example.qlnvonetomanyrelationship.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class EmployeeDto {
    private long employee_Id;
    @NotEmpty
    @Size(min = 2, message = "employee name should have at least 2 characters")
    private String employee_Name;
    @NotEmpty
    private String phone;
    @NotEmpty
    private String position;
    @NotEmpty
    private String address;
    @NotEmpty
    private double salary;
    @NotEmpty
    private long department_Id;


}
