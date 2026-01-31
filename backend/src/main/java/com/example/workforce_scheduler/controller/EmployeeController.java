package com.example.workforce_scheduler.controller;

import com.example.workforce_scheduler.model.EmployeeModel;
import com.example.workforce_scheduler.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return employeeService.getHello(name);
    }

    @GetMapping("/employees")
    public List<EmployeeModel> getEmployees() {
        return employeeService.getEmployees();
    }

    @PostMapping("/employees")
    @ResponseStatus(HttpStatus.CREATED)
    public EmployeeModel createEmployee(@RequestBody EmployeeModel employee) {
        return employeeService.createEmployee(employee);
    }
}
