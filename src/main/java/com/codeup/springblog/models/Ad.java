package com.codeup.springblog.models;

import javax.persistence.*;

@Entity//Entities in JPA are nothing but POJOs representing data that can be persisted to the database. An entity represents a table stored in a database. Every instance of an entity represents a row in the table.
@Table(name="ads")
public class Ad {
    /* More code here... */


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 100, nullable = false)
    private String title;


    @Column(columnDefinition = "Text", nullable = false)
    private String description;

    public Ad(){

    }
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(){
        this.title = title;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(){
        this.description = description;
    }
}
