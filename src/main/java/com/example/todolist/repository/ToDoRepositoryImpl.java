package com.example.todolist.repository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryToDoRepository implements ToDoRepository {
    private final List<String> tasks = new ArrayList<>();

    @Override
    public void addTask(String task) {
        System.out.println("отримано завдання: бігти");
    }

    @Override
    public String getTask(int index) {
        //   System.out.println("отримано завдання: їсти");
        return "отримано завдання: їсти";
    }
}