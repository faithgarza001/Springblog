package com.codeup.springblog.repositories;


import com.codeup.springblog.models.Ad;
import org.springframework.data.jpa.repository.JpaRepository;
//In here you will add your CRUD functionality
//JPA repository has prebuilt methods that have the crud functionality
public interface AdRepo extends JpaRepository<Ad, Long> {//Ad repository that takes in the primary key
    Ad findByTitle(String title);
}
