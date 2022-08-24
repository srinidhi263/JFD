package com.nseit.spring_boot_todo;

import com.nseit.spring_boot_todo.model.Todo;
import com.nseit.spring_boot_todo.repository.TodoRepository;
import com.nseit.spring_boot_todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication

public class SpringBootTodoApplication implements CommandLineRunner {

    @Autowired
    private TodoService todoService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTodoApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        Todo todoOne = new Todo(1, "abc", false);
        Todo todoTwo = new Todo(2, "xyz", false);
        Todo todoThree = new Todo(3, "pqr", false);
        todoService.addTodo(todoOne);
        todoService.addTodo(todoTwo);
        todoService.addTodo(todoThree);

        todoService.viewTodo();

        todoService.updateTodo(1);
        todoService.viewTodo();

        todoService.removeTodo(2);
        todoService.viewTodo();

    }

}
