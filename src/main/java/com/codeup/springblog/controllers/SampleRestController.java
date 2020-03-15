package com.codeup.springblog.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

    @GetMapping("/rest")
    public String hello(){
        return "Take a rest things will be ok!!";
    }
}
