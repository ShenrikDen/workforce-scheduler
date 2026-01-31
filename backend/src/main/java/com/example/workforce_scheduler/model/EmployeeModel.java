package com.example.workforce_scheduler.model;

public class EmployeeModel {
    private int id;
    private String name;
    private String email;
    private String jobTitle;

    public EmployeeModel() {
    }

    public EmployeeModel(int id, String name, String email, String jobTitle) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;}
}
