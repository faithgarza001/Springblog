package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import com.codeup.springblog.repositories.PostRepo;
import com.codeup.springblog.repositories.UserRepo;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.model.IModel;

import java.util.ArrayList;
//**Quick notes this is the PostController class that will hold all the CRUD functionality

@Controller//indicates the class is a Controller typically used with @RequestMapping as well as @RestController
public class PostController {

    private PostRepo postDao;
    private UserRepo userDao;

    public PostController(PostRepo postDao, UserRepo userDao) {
        this.postDao = postDao;
        this.userDao = userDao;
    }

    @GetMapping("/posts")//@GetMapping: defines a method that should be invoked when a GET request is received for the specified URI
    public String getPosts(Model model){
        model.addAttribute("posts", postDao.findAll());
        return "posts/index";
    }

    @GetMapping("/posts/{id}")//view an individual post
    public String getPost(@PathVariable long id, Model model){
//        Post post1 = new Post(id, "Europa's First Post", "Remote Learning Today!");
//        model.addAttribute("title", post1.getTitle());
//        model.addAttribute("body", post1.getBody());
        model.addAttribute("post",postDao.getOne(id));
        return "posts/show";
    }

    @GetMapping("/posts/create")//	view the form for creating a post
    public String getCreatePostForm(Model model){
        model.addAttribute("post", new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")//create a new post
    public String createPost(@ModelAttribute Post post){//to work with form auto-binding you will use the model attribute annotation in this example you are taking the post object from the form.
//        Post newPost = new Post();//this you will not include in the form auto-binding method.()//getTitle would be pulling the object from the post object form.
//        newPost.setTitle(title);//this you will not include in the form-auto-binding method.()//getBody would be pulling the object for
//        newPost.setBody(body);//this you will not include in the form auto-binding method.()
        post.setUser(userDao.getOne(1l));//set user to set the post.
        postDao.save(post);//saving the post which will then in turn create the id.
        return "redirect:/posts";// you are redirecting to the posts.
    }

    @PostMapping("/posts/{id}/delete")
    public String delete(@PathVariable long id){
        // delete post
        postDao.deleteById(id);//deleting the post based on the id
        return "redirect:/posts";//redirecting to the post page
    }

    @GetMapping("/posts/{id}/edit")
    public String editForm(@PathVariable long id, Model model) {
        Post postToEdit = postDao.getOne(id);//here you are grabbing the id of the user to
        model.addAttribute("post", postToEdit);
        return "posts/edit";//redirecting to the edit page
    }

    @PostMapping("/posts/{id}/edit")
    public String updatePost(@PathVariable long id, @ModelAttribute Post post) {//there is no user associated with post params
        //if you were to only put postDao.save(post) this would create a new post but not identify the id
        Post p = postDao.getOne(id);//here user is associated within the id.(Meaning this should match with your database in the data whatever the id is assigned with the page, the SQL data should match
        p.setTitle(post.getTitle());//here you are grabbing title to  be updated
        p.setBody(post.getBody());//here you grab body to be updated
        postDao.save(p);//then you save the "p" created for the object.
        return "redirect:/posts";//redirecting to the posts page.
    }


}