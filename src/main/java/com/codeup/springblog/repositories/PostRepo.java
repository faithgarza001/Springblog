package com.codeup.springblog.repositories;

import com.codeup.springblog.controllers.PostController;
import com.codeup.springblog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends JpaRepository <Post, Long> {//We will extend this class and define the type of objects it will be manipulating, as well as the data type of the entity's id.
}
