package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    public ArrayList<Post> listOfPosts(){
        ArrayList<Post> posts = new ArrayList();
        posts.add( new Post("Добро пожаловать!", new Date()));
        posts.add(new Post("Сегодня хорошая погода.", new Date()));
        posts.add(new Post("На небе ни облачка", new Date()));
        return posts;
    }
}
