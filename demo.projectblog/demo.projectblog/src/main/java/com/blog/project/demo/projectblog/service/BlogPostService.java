package com.blog.project.demo.projectblog.service;

import com.blog.project.demo.projectblog.model.BlogPost;
import com.blog.project.demo.projectblog.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogPostService {
    @Autowired
    private BlogPostRepository blogPostRepository;

    public BlogPost createPost(BlogPost post) {
        return blogPostRepository.save(post);
    }

    public List<BlogPost> getAllPosts() {
        return blogPostRepository.findAll();
    }

    public BlogPost getPostById(String id) {
        return blogPostRepository.findById(id).orElse(null);
    }

    public void deletePost(String id) {
        blogPostRepository.deleteById(id);
    }
}
