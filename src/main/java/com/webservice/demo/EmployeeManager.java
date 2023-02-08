package com.webservice.demo;
public class EmployeeManager {

    public static void main(String[] args) {

        Employees employeeList = new Employees();

        Employee roger = new Employee(23, "Roger", "Federer", "rfed10@gmail.com", "Tennis Player");
        Employee messi = new Employee(34, "Lionel", "Messi", "lionelmessi@gmail.com","Soccer Player");
        Employee cr7 = new Employee(37, "Christiano","Ronaldo", "cr7@gmail.com", "Soccer Player");
        Employee kobe = new Employee(44, "Kobe", "Bryant", "kobe24@gmail.com", "Basketball Player");
        Employee bob = new Employee(18, "Bob", "Smith", "bobsmith2023@gmail.com", "Trainer");
        Employee arteta = new Employee(40, "Mikel", "Arteta", "MikelA@gmail.com", "Manager");

        employeeList.addEmployee(roger);
        employeeList.addEmployee(messi);
        employeeList.addEmployee(cr7);
        employeeList.addEmployee(kobe);
        employeeList.addEmployee(bob);
        employeeList.addEmployee(arteta);

        System.out.print("6 Employees Added to List\n");

    }

}