package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostService {
    public ArrayList<Post> listOfPosts(){
        ArrayList<Post> posts = new ArrayList();
        posts.add( new Post("Добро пожаловать!"));
        posts.add(new Post("Сегодня хорошая погода."));
        posts.add(new Post("На небе ни облачка"));
        return posts;
    }
}
