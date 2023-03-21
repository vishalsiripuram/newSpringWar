package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class messages {
    
    @RequestMapping("/message")
    public String message(){
        return "Message feature added";
    }
}
