package com.example.qlnvonetomanyrelationship.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "employee")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    private long employee_Id;
    private String employee_Name;
    private String phone;
    private String position;
    private String address;
    private double salary;
    @ManyToOne
    @JoinColumn(name = "department_Id", nullable = false, referencedColumnName = "department_Id")
    @JsonBackReference
    private Department department;



}
