package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@Service
public class PostService {
    ArrayList<Post> posts = new ArrayList<Post>(Arrays.asList(new Post("Добро пожаловать!", new Date()),
                                                              new Post("Сегодня хорошая погода.", new Date()),
                                                              new Post("На небе ни облачка", new Date())));

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }

    public ArrayList<Post> listOfPosts(){
        return posts;
    }
}
