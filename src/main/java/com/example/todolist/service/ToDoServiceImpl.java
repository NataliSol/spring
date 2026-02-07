package com.example.todolist.service;

import com.example.todolist.repository.ToDoRepository;
import org.springframework.stereotype.Service;

@Service
public class ToDoServiceImpl implements ToDoService {

    private final ToDoRepository toDoRepository;

    public ToDoServiceImpl(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    @Override
    public void createAndGetCity() {
        toDoRepository.addTask();
    }
}

