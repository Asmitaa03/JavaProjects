package com.springbootproject.databasecrud.repo;

import com.springbootproject.databasecrud.model.TodoModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoDAO
           extends CrudRepository<TodoModel, Integer> {
        @Override
        List<TodoModel> findAll();

    }

