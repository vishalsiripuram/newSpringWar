package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Notification {
    
    @RequestMapping("/notification")
    public String notification(){
        return "Notification added";
    }
}
