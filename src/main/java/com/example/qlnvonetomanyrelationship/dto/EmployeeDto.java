package com.example.qlnvonetomanyrelationship.dto;

import lombok.Data;

@Data
public class EmployeeDto {
    private long id;
    private String name;
    private String phone;
    private String position;
    private String address;
    private double salary;

}
