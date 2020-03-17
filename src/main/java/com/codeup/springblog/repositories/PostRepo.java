package com.codeup.springblog.repositories;

import com.codeup.springblog.controllers.PostController;
import com.codeup.springblog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends JpaRepository<Post, Long> {
}
