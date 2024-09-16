package com.blog.project.demo.projectblog.controller;


import com.blog.project.demo.projectblog.model.BlogPost;
import com.blog.project.demo.projectblog.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@RestController
@RequestMapping("/posts")
public class BlogPostController {
    @Autowired
    private BlogPostService blogPostService;

    @PostMapping("/create")
    public BlogPost createPost(@RequestBody BlogPost post) {
        return blogPostService.createPost(post);
    }

    @GetMapping("/")
    public List<BlogPost> getAllPosts() {
        return blogPostService.getAllPosts();
    }

    @GetMapping("/{id}")
    public BlogPost getPostById(@PathVariable String id) {
        return blogPostService.getPostById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable String id) {
        blogPostService.deletePost(id);
    }
}