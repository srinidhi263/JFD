package com.nseit.studentcourse.controller;

import com.nseit.studentcourse.model.StudentModel;
import com.nseit.studentcourse.repository.StudentRepository;
import com.nseit.studentcourse.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping
    public void addStudent(@RequestBody StudentModel studentModel) {
        studentService.addStudent(studentModel);
    }
    @GetMapping("/all")
    public List<StudentModel> viewStudent(@PathVariable int id) {
        return studentService.viewStudent();
    }
    @PutMapping
    public void updateStudent(@RequestBody StudentModel studentModel) {
        studentService.updateStudent(studentModel);
    }
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
    }
}
