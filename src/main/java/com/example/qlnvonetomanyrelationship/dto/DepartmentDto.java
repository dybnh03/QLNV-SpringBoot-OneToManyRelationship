package com.example.qlnvonetomanyrelationship.dto;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class DepartmentDto {
    private long department_Id;
    @NotEmpty
    @Size(min = 8, message = "department name should have at least 2 characters")
    private String department_Name;
}
