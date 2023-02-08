package com.webservice.demo;
public class Employee {

    //Variables = Employee Info
    private int employee_id;
    private String first_name;
    private String last_name;
    private String email;
    private String title;

    //Constructor for Employees
    public Employee(int id, String first, String last, String email, String title) {
        employee_id = id;
        first_name = first;
        last_name = last;
        this.email = email;
        this.title = title;
    }
        
    //Getters
    public int getID() { return employee_id; }
    public String getFirstName() { return first_name; }
    public String getLastName() { return last_name; }
    public String getEmail() { return email; }
    public String getTitle() { return title; }

}
