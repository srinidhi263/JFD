package com.nseit.spring_boot_todo.service;

import com.nseit.spring_boot_todo.model.Todo;
import com.nseit.spring_boot_todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public void addTodo(Todo todo) {
        ArrayList<Todo> todos = todoRepository.getTodos();
        todos.add(todo);
    }

    public void viewTodo() {
        for (Todo todo : todoRepository.getTodos()) {
            System.out.println(todo.getId() + "-" + todo.getName() + "-" + todo.isCompleted());
        }
    }

    public void updateTodo(int id) {
        for (Todo todo : todoRepository.getTodos()) {
            if (id == todo.getId()) {
                todo.setCompleted(true);
                break;
            }
        }

    }

    public void removeTodo(int id) {
        ArrayList<Todo> todos = todoRepository.getTodos();
        for (Todo todo : todos) {
            if (id == todo.getId()) {
                todos.remove(todo);
                break;
            }
        }

    }

}
