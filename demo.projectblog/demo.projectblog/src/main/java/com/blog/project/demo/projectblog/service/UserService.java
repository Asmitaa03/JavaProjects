package com.blog.project.demo.projectblog.service;
import com.blog.project.demo.projectblog.model.User;
import com.blog.project.demo.projectblog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        // Add logic for registering user (e.g., encrypt password)
        return userRepository.save(user);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
