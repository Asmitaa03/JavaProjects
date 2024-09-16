package com.blog.project.demo.projectblog.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.blog.project.demo.projectblog.model.BlogPost;

import java.util.List;

public interface BlogPostRepository extends MongoRepository<BlogPost, String> {
    List<BlogPost> findByAuthorId(String authorId);
}

