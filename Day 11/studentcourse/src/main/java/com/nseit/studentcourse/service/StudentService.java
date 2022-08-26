package com.nseit.studentcourse.service;

import com.nseit.studentcourse.model.StudentModel;
import com.nseit.studentcourse.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public void addStudent(StudentModel studentModel) {
        studentRepository.save(studentModel);
    }

    public List<StudentModel> viewStudent() {
        return studentRepository.findAll();
    }

    public void updateStudent(StudentModel studentModel) {
        studentRepository.save(studentModel);
    }

    public void deleteStudent(int id) {
        for (StudentModel studentModel: studentRepository.findAll()){
            if(id == studentModel.getId()){
                studentRepository.delete(studentModel);
            }
        }
    }
}
