package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class controller {
    
    @RequestMapping("/dev")
    public String hello(){
        return "developer branches webhook";
    }
}
