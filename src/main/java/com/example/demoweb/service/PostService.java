package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import com.example.demoweb.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    public void create(String text) {Post post = new Post(null, text, new Date());
        postRepository.save(post);

    }

    public Iterable<Post> listAllPosts() {
        return postRepository.findAll();
    }
}
