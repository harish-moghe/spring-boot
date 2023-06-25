package com.example.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//@Controller
//@ResponseBody
@RestController
public class HelloWorldContoller {

    @GetMapping("/hellow-world")
    public String hellowWorld(){
        return "hello world";
    }
}
