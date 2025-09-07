package com.example.workforce_scheduler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
        @GetMapping("/hello")
        public String hello() { return "Hello from Workforce Scheduler"; }
}
