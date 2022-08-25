package com.nseit.studentcourse.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @PostMapping
    public void addStudent(){

    }
    @GetMapping("/all")
    public void viewStudent(){

    }
    @PutMapping
    public void updateStudent(){

    }
    @DeleteMapping("/{id}")
    public void deleteStudent(){

    }
}
