package com.example.todolist;

import com.example.todolist.repository.ToDoRepository;
import com.example.todolist.service.DeveloperInfoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.todolist.service.AppInfoService;

@SpringBootApplication
public class TodolistApplication implements CommandLineRunner {

    private final AppInfoService appInfoService;
    private final DeveloperInfoService developerInfoService;
    private final ToDoRepository toDoRepository;

    public TodolistApplication(AppInfoService appInfoService, DeveloperInfoService developerInfoService,
                               ToDoRepository toDoRepository) {
        this.appInfoService = appInfoService;
        this.developerInfoService = developerInfoService;
        this.toDoRepository=toDoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodolistApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- Запускаємо додаток ---");
        System.out.println(appInfoService.getAppInfo());
        System.out.println(toDoRepository.getCityTask());
        System.out.println(developerInfoService.getAppInfo());
        System.out.println("--- Завершення роботи ---");
    }
}
