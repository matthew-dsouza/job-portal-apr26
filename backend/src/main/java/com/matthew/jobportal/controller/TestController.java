package com.matthew.jobportal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/test/health")
    public String healthCheck() {
        return "Backend is running 🚀";
    }
}