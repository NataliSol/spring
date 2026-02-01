package com.example.todolist.service;

import com.example.todolist.repository.ToDoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ToDoBackupServiceImpl implements ToDoBackupService {
    private final List<ToDoRepository> repositories;

    public ToDoBackupServiceImpl(List<ToDoRepository> repositories) {
        this.repositories = repositories;
    }

    public void saveTaskToAllRepositories(String task) {
        System.out.println("Backup Service: розпочато збереження");
        repositories.forEach(repo -> repo.save(task));
    }
}
