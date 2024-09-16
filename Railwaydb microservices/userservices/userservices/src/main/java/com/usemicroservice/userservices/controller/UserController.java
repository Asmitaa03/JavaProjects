package com.usemicroservice.userservices.controller;


import com.usemicroservice.userservices.model.UserModel;
import com.usemicroservice.userservices.services.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService services;

    @PostMapping()
    public UserModel addUser(@RequestBody UserModel userModel) {
        return services.createUser(userModel);

    }

    @GetMapping()
    public List<UserModel> getAllUsers() {
        return services.getAllUsers();

    }

    @GetMapping(value = "/{userId}")
    public UserModel getUserById(@PathVariable("userId") @RequestBody String userId) {
        return services.getUserById(userId);
    }
}