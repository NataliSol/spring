package com.example.todolist.service;

import com.example.todolist.repository.ToDoRepository;

public class ToDoService {
    private final ToDoRepository toDoRepository;

    // ToDoService не створює ToDoRepository, він його просто отримує
    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public void createAndGetTask() {
        System.out.println("Додано завдання: спати");
        System.out.println("Додано завдання: бігти");
        System.out.println("отримано завдання: гуляти");
    }
}