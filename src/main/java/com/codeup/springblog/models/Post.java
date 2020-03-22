package com.codeup.springblog.models;

import javax.persistence.*;
@Entity//Entities in JPA are nothing but POJOs representing data that can be persisted to the database. An entity represents a table stored in a database. Every instance of an entity represents a row in the table.
@Table(name="posts")//we can specify the table name using the @Table annotation.
public class Post {

    @Id//Each JPA entity must have a primary key which uniquely identifies it. The @Id annotation defines the primary key.
    @GeneratedValue(strategy = GenerationType.IDENTITY)//this is the equal to auto increment
    private long id;//creating private id object.

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String body;

    @ManyToOne
    @JoinColumn(name ="user_id")
    private User user;

   public Post() {
   }

   public Post(long id, String title, String body){
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle(){
        return this.title;
    }

    public String getBody(){
        return this.body;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
