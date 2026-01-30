package com.example.todolist.repository;

public interface ToDoRepository {
    void addTask(String task);
    String getTask(int index);
}