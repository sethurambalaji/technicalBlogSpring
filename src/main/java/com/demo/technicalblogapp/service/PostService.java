package com.demo.technicalblogapp.service;

import com.demo.technicalblogapp.model.Post;
import com.demo.technicalblogapp.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public PostService() {
        System.out.println("*** PostService ***");
    }

    public Post getOnePost() {
        return repository.getLatestPost();
    }

    public List<Post> getAllPosts() {

        return repository.getAllPosts();
    }

    public void createPost(Post newPost) {
    }
}
