package com.webservice.demo;
public class Employee {

    //Variables = Employee Info
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String title;

    //Constructor for Employees
    public Employee(int id, String first, String last, String email, String title) {
        this.id = id;
        firstName = first;
        lastName = last;
        this.email = email;
        this.title = title;
    }
        
    //Getters
    public int getID() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getTitle() { return title; }

    //Setters
    public void setID(int id) { this.id = id; }
    public void setFirst(String firstName) { this.firstName = firstName; }
    public void setLast(String lastName) { this.lastName = lastName; }
    public void setEmail(String email) { this.email = email; }
    public void setTitle(String title) { this.title = title; }
}
