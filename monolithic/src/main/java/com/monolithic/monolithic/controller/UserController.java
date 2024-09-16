package com.monolithic.monolithic.controller;

import com.monolithic.monolithic.model.UserModel;
import com.monolithic.monolithic.repo.UserRepo;
import com.monolithic.monolithic.services.UserService;
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
    public UserModel addUser(@RequestBody UserModel userModel){
        return services.createUser(userModel);

    }

    @GetMapping()
    public List<UserModel> getAllUsers(){
        return  services.getAllUsers();

    }

    @GetMapping(value = "/{userId}")
    public  UserModel getUserById(@PathVariable("userId") @RequestBody String UserId){
        return services.getUserById(UserId);
    }




}
