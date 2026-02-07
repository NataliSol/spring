package com.example.todolist.controller;

import com.example.todolist.dto.ToDoItem;
import com.example.todolist.service.ToDoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/todos")
public class ToDoController {

    private final ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    private final List<ToDoItem> todoList = new ArrayList<>();
    private long idCounter = 1;

    // 1. READ ALL (GET /api/todos)
    @GetMapping
    public List<ToDoItem> getAllToDos() {
        return todoList;
    }

    // 2. READ ONE (GET /api/todos/{id})
    @GetMapping("/{id}")
    public ToDoItem getToDoById(@PathVariable Long id) {
        return todoList.stream()
                .filter(todo -> todo.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // 3. CREATE (POST /api/todos)
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // Встановлюємо код відповіді 201 Created
    public ToDoItem createNewToDo(@RequestBody ToDoItem newTodo) {
        newTodo.setId(idCounter++);
        todoList.add(newTodo);
        System.out.println("Додаемо нове завдання");
        return newTodo;
    }

    // 4. UPDATE (PUT /api/todos/{id})
    @PutMapping("/{id}")
    public ToDoItem updateToDo(@PathVariable Long id, @RequestBody ToDoItem updatedTodo) {
        for (ToDoItem item : todoList) {
            if (item.getId().equals(id)) {
                item.setTitle(updatedTodo.getTitle());
                item.setCompleted(updatedTodo.isCompleted());
                System.out.println("Оновили дані завдання з ID: "+ id);
                return item;
            }
        }
        return null;
    }

    // 5. DELETE (DELETE /api/todos/{id})
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT) // Код відповіді 204 No Content
    public void deleteToDo(@PathVariable Long id) {
        todoList.removeIf(todo -> todo.getId().equals(id));
        System.out.println("Видаляємо завдання з ID: " + id);
    }
}
