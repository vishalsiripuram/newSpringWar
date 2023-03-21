package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Friends {
    
    @RequestMapping("/friends")
    public String friends(){
        return "friends";
    }
}
