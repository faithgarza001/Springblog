package com.codeup.springblog.repositories;


import com.codeup.springblog.models.Ad;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdRepo extends JpaRepository<Ad, Long> {//JPA is a Java specification for accessing, persisting, and managing data between Java objects and a relational database.
    Ad findByTitle(String title);
}
