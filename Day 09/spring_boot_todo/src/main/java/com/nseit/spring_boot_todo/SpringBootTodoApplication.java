package com.nseit.spring_boot_todo;
import com.nseit.spring_boot_todo.Model.Todo;
import com.nseit.spring_boot_todo.Service.TodoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication

public class SpringBootTodoApplication implements CommandLineRunner {

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



}
