package com.example.workforce_scheduler.controller;

import com.example.workforce_scheduler.model.EmployeeModel;
import com.example.workforce_scheduler.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
        @GetMapping("/hello")
        public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
            return String.format("Hello %s!", name);
        }
}
