package com.webservice.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeListController {
    private EmployeeManager existingEmployees = new EmployeeManager();
    @GetMapping("/employees")
    public List<Employee> getEmployeeManager() {
        return existingEmployees.getAllEmployees();
    }


    /*Use this in windows command line to add an employee to EmployeeManager:
    curl -H "Content-Type: application/json" -X POST -d "{\"id\": 1, \"firstName\": \"John\",
    \"lastName\": \"Doe\", \"email\": \"john.doe@example.com\", \"title\": \"Developer\"}"
    http://localhost:8080/employees
    */
    @PostMapping("/employees")
    public void addEmployeetoList(@RequestBody Employee newEmployee){
        existingEmployees.addEmployee(newEmployee);
    }
}
