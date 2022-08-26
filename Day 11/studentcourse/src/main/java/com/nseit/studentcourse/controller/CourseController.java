package com.nseit.studentcourse.controller;

import com.nseit.studentcourse.model.CourseModel;
import com.nseit.studentcourse.model.StudentModel;
import com.nseit.studentcourse.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping
    public void addCourse(@RequestBody CourseModel courseModel) {
        courseService.addCourse(courseModel);
    }

    @GetMapping("/all")
    public List<CourseModel> viewCourse(@PathVariable int id) {
        return courseService.viewCourse();
    }

    @PutMapping
    public void updateCourse(@RequestBody CourseModel courseModel) {
        courseService.updateCourse(courseModel);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable int id) {
        courseService.deleteCourse(id);
    }
}
