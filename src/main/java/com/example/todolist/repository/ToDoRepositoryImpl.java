package com.example.todolist.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ToDoRepositoryImpl implements ToDoRepository {
    private final List<String> tasks = new ArrayList<>();

    @Value("${app.city}")
    private String cityName;

    @Override
    public void addTask() {
        System.out.println("місто:"+cityName);
    }

    @Override
    public String getCityTask() {
        return "завдання для міста "+ cityName;
    }
}