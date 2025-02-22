package com.usl.training.spring_boot_rest_api.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    // HTTP GET REQUEST
    // http://localhost:8080/hello-world
    @GetMapping("/hello-World")
    public String helloworld(){
        return "Hello World!";
    }
}
