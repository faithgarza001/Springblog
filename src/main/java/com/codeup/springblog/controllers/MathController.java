package com.codeup.springblog.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.*;
@Controller
public class MathController {
    @RequestMapping(path = "math/increment/{number}", method = RequestMethod.GET)//you can rewrite a get mapping to request mapping
    @ResponseBody
    public String addOne(@PathVariable int number) {
        return number + " plus one is " + (number + 1) + "!";

    }

    @RequestMapping(path = "math/decrement/{number}", method = RequestMethod.GET)//you can rewrite a get mapping to request mapping
    @ResponseBody
    public String subtractOne(@PathVariable int number) {
        return number + " minus one is " + (number - 1) + "!";

    }

    @RequestMapping(path = "math/multiply/{number}", method = RequestMethod.GET)//you can rewrite a get mapping to request mapping
    @ResponseBody
    public String multiplyOne(@PathVariable int number){
        return number + "multiplied by five is" + (number * 5) + "!";
    }

    @RequestMapping(path = "math/divide/{number}", method = RequestMethod.GET)//you can rewrite a get mapping to request mapping
    @ResponseBody
    public String divideOne(@PathVariable int number){
        return number + "divided by three is" + (number % 3) + "!";
    }
    //Below is another example on how you can do the operator method to get access to the path variable and request on  the get mapping

    //@GetMapping("/add/{a}/and/{b}")_
    //public String add(int a, int b){
    //return "" +(a+b;
    //}

//    @RequestMapping(method = RequestMethod.GET)
//    public ModelAndView calculateSum(@RequestParam int a, @RequestParam int b) {
//        ModelAndView model = new ModelAndView("MathResult");
//
//        model.addObject("sum", (a + b));
//        model.addObject("subtract", (a - b));
//        model.addObject("multiply", (a * b));
//        model.addObject("divide", (a / b));
//
//        return model;

}
