package com.example.circle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/home")
public class ControllerHome {
    @GetMapping
    public String home(){
        return "hello, world!";
    }
}
