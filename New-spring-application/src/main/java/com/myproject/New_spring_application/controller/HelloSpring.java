package com.myproject.New_spring_application.controller;

import org.springframework.web.bind.annotation.PostMapping;

public class HelloSpring {

    @PostMapping("/hello")
    public String helloSpring(){
        return "hello Spring";
    }
}
