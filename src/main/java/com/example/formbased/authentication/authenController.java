package com.example.formbased.authentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class authenController {
    @GetMapping("/greeting")
    public String greeting(){
        return "Hello world";
    }
}
