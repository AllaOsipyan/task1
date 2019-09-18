package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@Service
public class PostService {
    ArrayList<Post> posts = new ArrayList<Post>(Arrays.asList(new Post(1L,"Добро пожаловать!", new Date()),
                                                              new Post(2L,"Сегодня хорошая погода.", new Date()),
                                                              new Post(3L,"На небе ни облачка", new Date())));

    public void create(String text) {
        posts.add(new Post(Long.valueOf(posts.size() + 1),text, new Date()));
    }

    public ArrayList<Post> listOfPosts(){
        return posts;
    }
}
