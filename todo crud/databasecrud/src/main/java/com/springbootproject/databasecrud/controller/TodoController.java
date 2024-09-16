package com.springbootproject.databasecrud.controller;

import com.springbootproject.databasecrud.model.TodoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.springbootproject.databasecrud.services.TodoService;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping(value ="/todo")
public class TodoController {
    //create first print name api

    @GetMapping(value = "/add")
    public String add() {
        JFrame frame = new JFrame("Addition");
        JLabel alb = new JLabel("Enter a");
        JTextField atf = new JTextField();
        JLabel blb = new JLabel("Enter b");
        JTextField btf = new JTextField();
        alb.setBounds(20, 20, 120, 30);
        blb.setBounds(20, 60, 120, 30);
        atf.setBounds(140, 20, 50, 30);
        btf.setBounds(140, 60, 50, 30);

        JButton addBt = new JButton("Add");
        addBt.setBounds(100, 100, 100, 30);

        addBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(atf.getText());
                int b = Integer.parseInt(btf.getText());
                alb.setText(String.valueOf(a + b));
            }
        });

        frame.add(alb);
        frame.add(blb);
        frame.add(atf);
        frame.add(btf);
        frame.add(addBt);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setSize(250, 200);
        return alb.getText();
    }

    @Autowired
    private TodoService todoServices;

    @PostMapping()
    public TodoModel addTodo(@RequestBody TodoModel todoModel) {
        return todoServices.addTodo(todoModel);
    }

    @GetMapping()
    public List<TodoModel> getTodos() {
        return todoServices.getTodo();
    }

    @DeleteMapping(value = "/{todoId}")
    public void deleteTodo(@PathVariable("todoId") int todoId) {
        todoServices.deleteTodo(todoId);
    }
    @PutMapping(value = "/todoId")
    public Todo
}
