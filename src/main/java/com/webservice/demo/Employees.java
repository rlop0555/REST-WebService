package com.webservice.demo;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employeesList;

    public Employees() {
        employeesList = new ArrayList<Employee>();
    }

    public List<Employee> getEmployees() {
        return employeesList;
    }

    public void setEmployees(List<Employee> employees) {
        this.employeesList = employees;
    }

    public void addEmployee(Employee employee){
        employeesList.add(employee);
    }
}