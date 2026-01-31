package com.example.workforce_scheduler.service;

import com.example.workforce_scheduler.model.EmployeeModel;
import org.springframework.stereotype.Service;
import java.util.concurrent.atomic.AtomicInteger;

import java.util.*;

@Service
public class EmployeeService {
    private final List<EmployeeModel> employees = new ArrayList<>();
    private final AtomicInteger nextId = new AtomicInteger(1);

    public List<EmployeeModel> getEmployees() {
        return employees;
        //return List.of(
       //         new EmployeeModel(1, "Alice", "alice@test.com", "Manager"),
       //         new EmployeeModel(2, "Bob", "bob@test.com", "Staff")
        //);
    }

    public EmployeeModel createEmployee(EmployeeModel employee) {
        // assign id on the server
        employee.setId(nextId.getAndIncrement());
        employees.add(employee);
        return employee;
    }
    public String getHello(String name) {
        return String.format("Hello %s!", name);
    }
}
