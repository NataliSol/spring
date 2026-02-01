package com.example.todolist.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ToDoRepositoryImpl implements ToDoRepository {
    private final List<String> tasks = new ArrayList<>();

    @Override
    public void save(String task) {
        tasks.add(task);
        System.out.println("[MEMORY] Завдання збережено в оперативну пам'ять: " + task);
    }
}