package com.webservice.demo;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employeesList;

    //Employees constructor
    public Employees() {
        employeesList = new ArrayList<>();
    }
    public void setEmployees(List<Employee> employees) {
        this.employeesList = employees;
    }

    public void addEmployee(Employee employee){
        employeesList.add(employee);
    }

    public List<Employee> getEmployees(){
        return employeesList;
    }
}