package com.webservice.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeListController {
    private EmployeeManager existingEmployees = new EmployeeManager();
    @GetMapping("/employees")
    public List<Employee> getEmployeeManager() {
        return existingEmployees.getAllEmployees();
    }
}
