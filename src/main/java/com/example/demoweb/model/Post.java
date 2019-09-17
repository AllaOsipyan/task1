package com.example.demoweb.model;

import java.security.PolicySpi;
import java.util.Date;

public class Post {
    private String text;
    private Integer likes = 0;
    private Date creationDate;

    public Post(String text, Date creationDate){
        this.text = text;
        this.creationDate = creationDate;
    }

    public String getText(){
        return this.text;
    }

    public Integer getLikes(){
        return this.likes;
    }

    public Date getCreationDate(){
        return this.creationDate;
    }
}
