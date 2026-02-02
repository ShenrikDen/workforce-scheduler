package com.example.workforce_scheduler.service;

import com.example.workforce_scheduler.DTO.EmployeeCreateRequest;
import com.example.workforce_scheduler.DTO.EmployeeUpdateRequest;
import com.example.workforce_scheduler.model.EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

import java.util.*;

@Service
public class EmployeeService {
    private final HashMap<Integer, EmployeeModel> employees = new HashMap<Integer, EmployeeModel>();
    private final AtomicInteger nextId = new AtomicInteger(1);

    public HashMap<Integer, EmployeeModel> getEmployees() {
        return employees;
    }

    public EmployeeModel getEmployee(int id) {
        return employees.get(id);
    }

    public EmployeeModel createEmployee(EmployeeCreateRequest req) {
        EmployeeModel employee = new EmployeeModel();
        employee.setId(nextId.getAndIncrement());
        employee.setName(req.getName());
        employee.setEmail(req.getEmail());
        employee.setJobTitle(req.getJobTitle());
        employees.put(employee.getId(), employee);
        return employee;
    }

    public boolean deleteEmployee(int id) {
        return employees.remove(id) != null;
    }

    public EmployeeModel updateEmployee(int id, EmployeeUpdateRequest req) {
        EmployeeModel employee = employees.get(id);
        if (employee == null) {
            throw new NoSuchElementException("Employee not found with id: " + id);
        }
        if (req.getName() != null) {
            employee.setName(req.getName());
        }
        if (req.getEmail() != null) {
            employee.setEmail(req.getEmail());
        }
        if (req.getJobTitle() != null) {
            employee.setJobTitle(req.getJobTitle());
        }
        return employee;
    }

    public String getHello(String name) {
        return String.format("Hello %s!", name);
    }
}
