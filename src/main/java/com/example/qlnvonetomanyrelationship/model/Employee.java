package com.example.qlnvonetomanyrelationship.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "employee")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String phone;
    private String address;
    private String position;
    private double salary;


    @ManyToOne
    @JoinColumn(name = "department_Id", nullable = false, referencedColumnName = "department_Id")


    @JsonBackReference
    private Department dpm;

    public Employee() {
    }

    public Employee(String name, String phone, String address, String position, double salary) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.position = position;
        this.salary = salary;

    }


    public void setDepartment(Department dpm) {
        this.dpm = dpm;
    }



}
