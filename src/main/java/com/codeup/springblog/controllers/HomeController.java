package com.codeup.springblog.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/")
//(run hello method in helloController class)this hello method is the same as having a doGet method within a servlet
    @ResponseBody
//this can be used for json you are free to use this on other projects but will not be common for tis one
    public String hello() {
        return "This is the landing page!";
    }


    @GetMapping("/home")
    @ResponseBody
    public String welcome() {
        return "home";
    }
}
