package com.example.todolist.service;

import com.example.todolist.repository.FileBasedToDoRepository;
import com.example.todolist.repository.ToDoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoBackupService  {
    private final List<ToDoRepository> repositories;

    public ToDoBackupService(List<ToDoRepository> repositories) {
        this.repositories = repositories;
    }

    public void saveTaskToAllRepositories(String task) {
        System.out.println("Backup Service: розпочато збереження");
        repositories.forEach(repo -> repo.save(task));
    }
}
//    @Override
//    public void createAndGetCity() {
//
//    }
//        // Spring автоматично впровадить сюди обидві реалізації
//        private final List<NotificationService> notificationServices;
//
//        public OrderServiceImpl(List<NotificationService> notificationServices) {
//            this.notificationServices = notificationServices;
//        }
//
//        public void processOrder() {
//            System.out.println("Обробка замовлення...");
//            // Викликаємо метод на кожному сервісі зі списку
//            notificationServices.forEach(service -> service.sendNotification("Ваше замовлення прийнято!"));
//        }
//    }


