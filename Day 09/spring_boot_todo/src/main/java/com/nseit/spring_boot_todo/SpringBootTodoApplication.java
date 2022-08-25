package com.nseit.spring_boot_todo;
<<<<<<< HEAD

import com.nseit.spring_boot_todo.model.Todo;
import com.nseit.spring_boot_todo.repository.TodoRepository;
import com.nseit.spring_boot_todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
=======
import com.nseit.spring_boot_todo.Model.Todo;
import com.nseit.spring_boot_todo.Service.TodoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

>>>>>>> 7980a8f07fd3c44c623baa0078a028bdb4ac4b55
@SpringBootApplication

public class SpringBootTodoApplication implements CommandLineRunner {

<<<<<<< HEAD
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
=======
	public static void main(String[] args) {

		SpringApplication.run(SpringBootTodoApplication.class, args);

	}
	@Override
	public void run(String... args) throws Exception {
		Todo todoOne = new Todo(1, "abc", false);
		Todo todoTwo = new Todo(2, "xyz", false);
		Todo todoThree = new Todo(3, "pqr", false);
		TodoService.addTodo(todoOne);
		TodoService.addTodo(todoTwo);
		TodoService.addTodo(todoThree);

		for (Todo todo : TodoService.

		}

	}


>>>>>>> 7980a8f07fd3c44c623baa0078a028bdb4ac4b55

}
