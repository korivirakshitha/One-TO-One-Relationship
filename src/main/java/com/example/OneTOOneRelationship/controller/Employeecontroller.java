package com.example.OneTOOneRelationship.controller;
import com.example.OneTOOneRelationship.model.Employee;
import com.example.OneTOOneRelationship.service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class Employeecontroller {
    @Autowired
    private Employeeservice employeeService;
    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }
    @GetMapping("/{id}")
    public Optional<Employee> getEmployee(@PathVariable int id){
        return employeeService.getEmployee(id);
    }
    @GetMapping("/all")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id){
        return employeeService.deleteEmployee(id);
    }
}

