package com.demo.technicalblogapp.controller;

import com.demo.technicalblogapp.model.Post;
import com.demo.technicalblogapp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@EnableAutoConfiguration
public class HomeController {

    public HomeController() {
        System.out.println("*** HomeController ***");
    }

    @Autowired
    private PostService postService;

    @RequestMapping("/")
    public String getAllPosts(Model model) {

        List<Post> posts = postService.getAllPosts();

        model.addAttribute("posts", posts);
        return "index";

    }

}
