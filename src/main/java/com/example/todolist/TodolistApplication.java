package com.example.todolist;

//import com.example.todolist.repository.ToDoRepository;
//import com.example.todolist.service.DeveloperInfoService;
//import com.example.todolist.service.ToDoBackupService;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import com.example.todolist.service.AppInfoService;
//
//@SpringBootApplication
//public class TodolistApplication implements CommandLineRunner {


import com.example.todolist.service.ToDoBackupService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodolistApplication implements CommandLineRunner {

//    private final ToDoBackupService toDoBackupService;
//
//    public TodolistApplication(ToDoBackupService toDoBackupService) {
//        this.toDoBackupService = toDoBackupService;
//    }
//
//    public static void main(String[] args) {
//        SpringApplication.run(TodolistApplication.class, args);
//    }
//
//
//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("--- Запускаємо додаток ---");
//        toDoBackupService.saveTaskToAllRepositories("Зробити резервну копію даних");
//        System.out.println("--- Завершення роботи ---");
//    }

    private final ToDoBackupService toDoBackupService; // Вказуємо інтерфейс

    public TodolistApplication(ToDoBackupService toDoBackupService) {
        this.toDoBackupService = toDoBackupService;
    }


    public static void main(String[] args) {
        SpringApplication.run(TodolistApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- Запускаємо додаток ---");
        toDoBackupService.saveTaskToAllRepositories("Зробити резервну копію даних");
        System.out.println("--- Завершення роботи ---");
    }
}
