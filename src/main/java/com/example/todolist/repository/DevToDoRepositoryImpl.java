package com.example.todolist.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("dev") // Ця реалізація активна лише в профілі "dev"
public class DevToDoRepositoryImpl implements ToDoRepository {

    @Override
    public void addTask() {
        System.out.println("Завдання додано до репозиторію для РОЗРОБКИ.");
    }

    @Override
    public String getTask(int index) {
        return "Завдання з репозиторію для РОЗРОБКИ №" + index;
    }
}