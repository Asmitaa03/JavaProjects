package com.springbootproject.databasecrud.services;

import com.springbootproject.databasecrud.model.TodoModel;
import com.springbootproject.databasecrud.repo.TodoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TodoService {
    //Add todo
    //Get todo
    //Delete todo
    //Update todo
    @Autowired
    private TodoDAO dao;
    public TodoModel addTodo(TodoModel todoModel)
    {return dao.save(todoModel);

    }
    public List<TodoModel> getTodo(){
        return dao.findAll();
    }
    public void deleteTodo (int todoId){
        dao.deleteById(todoId);

    }
    public TodoModel updateTodo(int todoId, TodoModel todoModel){
        todoModel.setTaskId(todoId);
        return dao.save(todoModel);
    }
}
