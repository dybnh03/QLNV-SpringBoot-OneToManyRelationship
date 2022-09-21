package com.example.qlnvonetomanyrelationship.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "department")
public class Department {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private long department_Id;
    private String department_Name;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Employee> employeeList;

}
