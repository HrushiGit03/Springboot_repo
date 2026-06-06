package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class HelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

    @RestController
    @RequestMapping("/api")
    public class ApiController {

        /**
         * GET / - Welcome endpoint
         */
        @GetMapping("/")
        public String welcome() {
            return "Hello, World! Welcome to Spring Boot Hello World Application!";
        }

        /**
         * GET /hello?name=YourName - Personalized greeting
         */
        @GetMapping("/hello")
        public String greet(@RequestParam(defaultValue = "World") String name) {
            return "Hello, " + name + "! Welcome to Spring Boot.";
        }

        /**
         * GET /user/{id} - Get user by ID
         */
        @GetMapping("/user/{id}")
        public String getUser(@PathVariable int id) {
            return "User ID: " + id + ", Name: User" + id;
        }

        /**
         * GET /status - Application status
         */
        @GetMapping("/status")
        public String getStatus() {
            return "Application is running successfully!";
        }

        /**
         * POST /echo - Echo the request body
         */
        @PostMapping("/echo")
        public String echo(@RequestBody String message) {
            return "You sent: " + message;
        }

        /**
         * GET /info - Get application info
         */
        @GetMapping("/info")
        public String getInfo() {
            return "{\"app\": \"Spring Boot Hello World\", \"version\": \"1.0.0\", \"status\": \"running\"}";
        }

        /**
         * GET /timestamp - Get current timestamp
         */
        @GetMapping("/timestamp")
        public String getTimestamp() {
            return "Current Timestamp: " + System.currentTimeMillis();
        }

        /**
         * PUT /update/{id} - Update user
         */
        @PutMapping("/update/{id}")
        public String updateUser(@PathVariable int id, @RequestBody String details) {
            return "User " + id + " updated with details: " + details;
        }

        /**
         * DELETE /delete/{id} - Delete user
         */
        @DeleteMapping("/delete/{id}")
        public String deleteUser(@PathVariable int id) {
            return "User " + id + " has been deleted.";
        }
    }
}
