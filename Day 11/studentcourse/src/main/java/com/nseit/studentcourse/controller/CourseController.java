package com.nseit.studentcourse.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class CourseController {
    @PostMapping
    public void addCourse() {

    }

    @GetMapping("/all")
    public void viewCourse() {

    }

    @PutMapping
    public void updateCourse() {

    }

    @DeleteMapping("/{id}")
    public void deleteCourse() {

    }
}
