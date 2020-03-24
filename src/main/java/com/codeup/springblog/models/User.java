package com.codeup.springblog.models;

import javax.persistence.*;
import java.util.List;

//Entities in JPA are nothing but POJOs representing data that can be persisted to the database. An entity represents a table stored in a database. Every instance of an entity represents a row in the table.
//we can specify the table name using the @Table annotation.

    @Entity
    @Table(name = "users")
    public class User {


        public User(User copy) {
            id = copy.id; // This line is SUPER important! Many things won't work if it's absent
            email = copy.email;
            username = copy.username;
            password = copy.password;
        }
    @Id//Each JPA entity must have a primary key which uniquely identifies it. The @Id annotation defines the primary key.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}