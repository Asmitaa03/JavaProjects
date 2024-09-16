package com.monolithic.monolithic.repo;

import com.monolithic.monolithic.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserModel, String> {

}
