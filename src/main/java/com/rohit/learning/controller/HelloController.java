package com.rohit.learning.controller;

import com.rohit.learning.dto.UserRequest;
import com.rohit.learning.service.GreetingService;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    private final GreetingService greetingService;

    // Constructor Injection (BEST PRACTICE)
    public HelloController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot! 🚀";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return greetingService.greet(name);
    }

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    @PostMapping("/user")
    public String createUser(@RequestBody UserRequest request) {
        return "User created: " + request.getName() + ", Age: " + request.getAge();
    }
}
