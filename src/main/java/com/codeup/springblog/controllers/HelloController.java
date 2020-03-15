package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//you must type in browser ('http://localhost:8080/hello')
@Controller//here we attaching the description of the class
class HelloController {

    @GetMapping("/hello")//(run hello method in helloController class)this hello method is the same as having a doGet method within a servlet
    @ResponseBody//this can be used for json you are free to use this on other projects but will not be common for tis one
    public String hello() {
        return "Hello from Spring!";
    }




    @GetMapping("/hello/{name}")//pulling parameter off url (/hello) access is give through path variable//get mapping and post mapping are preferred methods
    @ResponseBody
    public String sayHello(@PathVariable String name) {
        return "Hello " + name + "!";
    }



    @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)//you can rewrite a get mapping to request mapping
    @ResponseBody
    public String addOne(@PathVariable int number) {
        return number + " plus one is " + (number + 1) + "!";

    }

//    @GetMapping("/hello/{name}")
//    public String sayHello(@PathVariable String name, Model model) {
//        model.addAttribute("name", name);
//        return "hello";
//    }
    @GetMapping("/fruit")
public String fruit(Model model) {
    List<String> fruitBasket = new ArrayList<>();
    fruitBasket.add("apple");
        fruitBasket.add("kiwi");
        fruitBasket.add("pear");
        fruitBasket.add("mango");

        model.addAttribute("fruitBasket", fruitBasket);
        return "fruit";


}


}
