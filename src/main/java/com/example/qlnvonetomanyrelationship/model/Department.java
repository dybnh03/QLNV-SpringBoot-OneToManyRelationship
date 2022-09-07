package com.example.qlnvonetomanyrelationship.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_Id")
    private long departmentId;
    private String departmentName;
    @OneToMany(mappedBy = "dpm", cascade = CascadeType.ALL)

    @JsonManagedReference
    private Set<Employee> emp;


    public void setEmployee(Set<Employee> emp ){
        this.emp = emp;
    }

    public Department(String departmentName){
        this.departmentName = departmentName;
    }



}
