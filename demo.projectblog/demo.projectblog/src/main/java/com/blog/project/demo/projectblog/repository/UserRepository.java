package com.blog.project.demo.projectblog.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.blog.project.demo.projectblog.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
}
