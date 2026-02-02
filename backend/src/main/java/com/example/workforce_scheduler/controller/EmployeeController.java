package com.example.workforce_scheduler.controller;

import com.example.workforce_scheduler.DTO.EmployeeCreateRequest;
import com.example.workforce_scheduler.model.EmployeeModel;
import com.example.workforce_scheduler.service.EmployeeService;
import com.example.workforce_scheduler.DTO.EmployeeUpdateRequest;
import org.springframework.http.HttpStatus;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RequestMapping("/api")
@RestController
@CrossOrigin(origins = "http://localhost:3000")
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
    public HashMap<Integer,EmployeeModel> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/employees/{id}")
    public EmployeeModel getEmployee(@PathVariable int id) {
        return employeeService.getEmployee(id);
    }

    @PostMapping("/employees")
    public ResponseEntity<EmployeeModel> createEmployee(@Valid @RequestBody EmployeeCreateRequest request) {
        EmployeeModel created = employeeService.createEmployee(request);
        return ResponseEntity.ok(created);
    }

    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable int id) {
        boolean removed = employeeService.deleteEmployee(id);
        return removed ? ResponseEntity.noContent().build()
                : ResponseEntity.notFound().build();
    }

    @PatchMapping("/employees/{id}")
    public ResponseEntity<EmployeeModel> updateEmployee(@PathVariable int id, @Valid @RequestBody EmployeeUpdateRequest request) {
        EmployeeModel updated = employeeService.updateEmployee(id, request);
        return ResponseEntity.ok(updated);
    }
}
