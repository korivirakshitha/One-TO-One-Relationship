package com.example.OneTOOneRelationship.service;
import com.example.OneTOOneRelationship.model.Employee;
import com.example.OneTOOneRelationship.repository.Employeerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Employeeservice {
    @Autowired
    private Employeerepository repo;
    public Employee addEmployee(Employee employee) {
        return repo.save(employee);
    }

    public Optional getEmployee(int id) {
        return repo.findById(id);
    }

    public List<Employee> getAllEmployee() {
        return repo.findAll();
    }

    public String deleteEmployee(int id) {
        repo.deleteById(id);
        return "Employee Deleted";
    }
    public Employee saveEmployee(Employee employee) {
        return repo.save(employee);
    }
}
