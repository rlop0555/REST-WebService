package com.webservice.demo;

import java.util.List;
public class EmployeeManager {
    private Employees list;

    public EmployeeManager() {
        list = new Employees();

        Employee roger = new Employee(23, "Roger", "Federer", "rfed10@gmail.com", "Tennis Player");
        Employee messi = new Employee(34, "Lionel", "Messi", "lionelmessi@gmail.com", "Soccer Player");
        Employee cr7 = new Employee(37, "Christiano", "Ronaldo", "cr7@gmail.com", "Soccer Player");
        Employee kobe = new Employee(44, "Kobe", "Bryant", "kobe24@gmail.com", "Basketball Player");
        Employee bob = new Employee(18, "Bob", "Smith", "bobsmith2023@gmail.com", "Trainer");
        Employee arteta = new Employee(40, "Mikel", "Arteta", "MikelA@gmail.com", "Manager");

        list.addEmployee(roger);
        list.addEmployee(messi);
        list.addEmployee(cr7);
        list.addEmployee(kobe);
        list.addEmployee(bob);
        list.addEmployee(arteta);
    }

    public List<Employee> getAllEmployees(){
        return list.getEmployees();
    }

    public void addEmployee( Employee newemployee ){
        list.addEmployee(newemployee);
    }

}