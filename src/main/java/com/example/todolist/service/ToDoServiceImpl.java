package com.example.todolist.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ToDoServiceImpl implements ToDoService{

    @Value("${app.city}")
    private String appCity;

    @Override
    public void createAndGetCity() {

    }
}
