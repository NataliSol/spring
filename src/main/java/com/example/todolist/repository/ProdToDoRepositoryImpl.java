package com.example.todolist.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("prod")
public class ProdToDoRepositoryImpl implements ToDoRepository {

    @Override
    public void addTask() {
        System.out.println("Завдання додано до репозиторію для ПРОДАКШЕНУ.");
    }

    @Override
    public String getTask(int index) {
        return "Завдання з репозиторію для ПРОДАКШЕНУ №" + index;
    }
}