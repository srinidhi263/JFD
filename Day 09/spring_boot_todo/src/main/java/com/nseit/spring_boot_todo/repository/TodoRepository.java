package com.nseit.spring_boot_todo.repository;

import com.nseit.spring_boot_todo.model.Todo;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Getter
@Repository
public class TodoRepository {
    private ArrayList<Todo> todos = new ArrayList<>();
}
