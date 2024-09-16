package com.usemicroservice.userservices.repo;


import com.usemicroservice.userservices.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserModel, String> {

}