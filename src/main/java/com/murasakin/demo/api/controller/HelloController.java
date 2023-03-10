package com.murasakin.demo.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping
    public String greet(@RequestParam String name) {
        return "Hello, " + name + "!";
    }
}
