package com.example.workforce_scheduler.model;

public class EmployeeModel {
    private int id;
    private String name;
    private String email;
    private String jobTitle;

    public EmployeeModel(int id, String name, String email, String jobTitle) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
    }
}
