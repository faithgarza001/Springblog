package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller//indicates the class is a Controller typically used with @RequestMapping as well as @RestController
public class HomeController {
    @GetMapping("/")////@GetMapping: defines a method that should be invoked when a GET request is received for the specified URI
    @ResponseBody//@ResponseBody annotation can be put on a method and indicates that the return type should be written straight to the HTTP response body (and not placed in a Model, or interpreted as a view name).
    public String landing() {
        return  "This is the landing page!";
    }

    @RequestMapping("/home")//@RequestMapping with Class: We can use it with class definition to create the base URI
    public String welcome() {
        return "home";
    }

    @GetMapping("/roll-dice")//@GetMapping – Handle HTTP Get Requests
    public String rollDice(){
        return "dice/roll-dice";
    }

    @GetMapping("/roll-dice/{guess}")
    public String rollDiceGuess(@PathVariable int guess, Model model){
        String message;

        int random = (int) Math.ceil(Math.random() * 6);

        if (random == guess) {
            message = "You guessed the random number!";
        } else {
            message = "Sorry, try again.";
        }

        model.addAttribute("message", message);
        model.addAttribute("guess", guess);
        model.addAttribute("random", random);

        return "dice/roll-dice-guess";
    }
}
