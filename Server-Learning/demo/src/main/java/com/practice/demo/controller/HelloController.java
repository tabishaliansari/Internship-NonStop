package com.practice.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/greet")
    public String greet() {return "Greetings from Spring Boot!";
    }

    @GetMapping("/bye")
    public String bye() {
        return "Goodbye, World!";
    }

    @GetMapping("/greet/{name}")
    public String greetName(@PathVariable String name) {return "Hello " + name + "! Welcome to Java Spring Boot Web App on Tomcat Server";}
}
