package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello World REST Controller
 */
@RestController
@RequestMapping("/api")
public class HelloController {

    /**
     * Simple Hello World endpoint
     * 
     * @return greeting message
     */
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World! Welcome to Spring Boot!";
    }

    /**
     * Personalized greeting endpoint
     * 
     * @param name the name to greet
     * @return personalized greeting
     */
    @GetMapping("/hello/{name}")
    public String sayHelloToName(@PathVariable String name) {
        return "Hello, " + name + "! Welcome to Spring Boot!";
    }

    /**
     * Health check endpoint
     * 
     * @return status message
     */
    @GetMapping("/health")
    public String healthCheck() {
        return "Application is running successfully!";
    }

}
