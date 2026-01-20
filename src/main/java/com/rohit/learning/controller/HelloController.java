package com.rohit.learning.controller;

import com.rohit.learning.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    // 1️⃣ Simple GET
    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot! 🚀";
    }

    // 2️⃣ Path Variable
    // Example: /greet/Rohit
    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello " + name + " 👋";
    }

    // 3️⃣ Query Parameter
    // Example: /add?a=10&b=20
    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    // 4️⃣ POST API with Body
    @PostMapping("/user")
    public String createUser(@RequestBody UserRequest request) {
        return "User created: " + request.getName() + ", Age: " + request.getAge();
    }
}
