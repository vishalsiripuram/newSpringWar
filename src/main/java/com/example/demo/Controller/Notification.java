package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Notification {
    
    public String notification(){
        return "Notification added";
    }
}
