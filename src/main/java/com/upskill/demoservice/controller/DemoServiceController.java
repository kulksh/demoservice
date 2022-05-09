package com.upskill.demoservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoServiceController {

    @GetMapping("/")
    public String getMessage() {
        return "Welcome to DemoService!!";
    }
}
