package com.example.demoweb;

import com.example.demoweb.controller.PostsViewController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoWebApplication.class, args);
		PostsViewController post = new PostsViewController();
		post.list();
	}

}
