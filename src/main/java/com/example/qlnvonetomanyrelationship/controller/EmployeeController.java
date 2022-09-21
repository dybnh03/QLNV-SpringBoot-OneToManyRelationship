package com.example.qlnvonetomanyrelationship.controller;

import com.example.qlnvonetomanyrelationship.dto.DepartmentDto;
import com.example.qlnvonetomanyrelationship.dto.EmployeeDto;
import com.example.qlnvonetomanyrelationship.model.Department;
import com.example.qlnvonetomanyrelationship.model.Employee;
import com.example.qlnvonetomanyrelationship.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController

@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    private ModelMapper modelMapper;

    public EmployeeController(EmployeeService employeeService, ModelMapper modelMapper) {
        this.employeeService = employeeService;
        this.modelMapper = modelMapper;
    }

    @PostMapping("/createEmployee")
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto empDto) {
        // convert DTO to entity
        Employee empRequest = modelMapper.map(empDto, Employee.class);
        Employee emp = employeeService.createEmployee(empRequest);
        // convert entity to DTO
        EmployeeDto empResponse = modelMapper.map(emp, EmployeeDto.class);

        return new ResponseEntity<EmployeeDto>(empResponse, HttpStatus.CREATED);
    }

    @GetMapping("/getEmployeeById/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable long id) {

        Employee emp = employeeService.findEmployeeById(id);
        // entity to DTO

        EmployeeDto empResponse = modelMapper.map(emp, EmployeeDto.class);
        return ResponseEntity.ok().body(empResponse);
    }

    @GetMapping("/getAllEmployee")
    public List<EmployeeDto> getAllEmployee() {
        return employeeService.findAllEmployee().stream().map(emp -> modelMapper.map(emp, EmployeeDto.class)).collect(Collectors.toList());
    }

    @PutMapping("/updateEmployeeById/{id}")
    public ResponseEntity<EmployeeDto> updateEmployeeById(@RequestBody EmployeeDto empDto){
        // convert DTO to Entity
        Employee empRequest = modelMapper. map(empDto, Employee.class);
        Employee emp = employeeService.updateEmployeeById(empRequest);
        // entity to DTO
        EmployeeDto empResponse = modelMapper.map(emp, EmployeeDto.class);
        return ResponseEntity.ok().body(empResponse);



    }

    @DeleteMapping("/deleteEmployeeById/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable long id){
        employeeService.deleteEmployeeById(id);

        return ResponseEntity.noContent().build();
    }


}
