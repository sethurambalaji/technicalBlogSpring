package com.demo.technicalblogapp.service;

import com.demo.technicalblogapp.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {

    public PostService() {
        System.out.println("*** PostService ***");
    }

    public ArrayList<Post> getOnePost() {
        ArrayList<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle("This is your Post");
        post1.setBody("This is your Post. It has some valid content");
        post1.setDate(new Date());
        posts.add(post1);

        return posts;

    }

    public ArrayList<Post> getAllPosts(){

        ArrayList<Post> posts = new ArrayList<>();
        Post post1 = new Post();
        post1.setTitle("Post1 Title");
        post1.setBody("Post1 Body");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Post2 Title");
        post2.setBody("Post2 Body");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("Post3 Title");
        post3.setBody("Post3 Body");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        return posts;

    }
}
