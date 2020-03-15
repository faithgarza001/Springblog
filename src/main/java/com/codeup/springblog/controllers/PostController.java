package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @PostMapping ("/posts")
    @ResponseBody
    public String getAllPosts()
    {
        return "post index page";
    }

    @PostMapping("/posts/{id}")
    @ResponseBody
    public String getPost(@PathVariable int id)
    {
        return "View an individual post, id="+ id;
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String getCreatePostForm()
    {
        return "View the form for creating a post";
    }

//    @PostMapping("/posts/create")
//    @ResponseBody
//    public String CreatePost()
//    {
//        return "Here are the posts created";
//    }


}
