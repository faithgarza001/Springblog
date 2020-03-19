package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import com.codeup.springblog.repositories.PostRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private PostRepo postDao;

    public PostController(PostRepo postDao) {
        this.postDao = postDao;
    }

    @GetMapping("/posts")
    public String getPosts(Model model){
//        ArrayList<Post> postList = new ArrayList<>();
//        postList.add(new Post(2, "Second Post", "askdfhkashdfkjahsdf"));
//        postList.add(new Post(3, "Third Post", "some more text..."));//these are hard coded only to be used before you creat dao

        model.addAttribute("posts", postDao.findAll());
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String getPost(@PathVariable int id, Model model){
        Post post1 = new Post(id, "Europa's First Post", "Remote Learning Today!");
        model.addAttribute("title", post1.getTitle());
        model.addAttribute("body", post1.getBody());
        return "posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String getCreatePostForm(){
        return "view the form for creating a post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "create a new post";
    }

    @PostMapping("/posts/{id}/delete")//this is a method to refer to your delete button
    @ResponseBody
    public String delete(@PathVariable long id){
       //delete post
        postDao.deleteById(id);
        return "redirect:/posts";
    }
}