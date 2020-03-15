package com.codeup.springblog.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.*;
@Controller
public class PageController {
    @RequestMapping(path = "page/increment/{number}", method = RequestMethod.GET)//you can rewrite a get mapping to request mapping
    @ResponseBody
    public String addOne(@PathVariable int number) {
        return number + " plus one is " + (number + 1) + "!";

    }


}