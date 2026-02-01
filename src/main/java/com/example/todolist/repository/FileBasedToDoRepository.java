package com.example.todolist.repository;

import org.springframework.stereotype.Repository;

@Repository
public class FileBasedToDoRepository implements ToDoRepository {
        @Override
        public void save(String task) {
                // Симуляція запису у файл
                System.out.println("[FILE] Збереження завдання у файл: " + task);
        }
}