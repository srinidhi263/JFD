package com.nseit.studentcourse.service;

import com.nseit.studentcourse.model.CourseModel;
import com.nseit.studentcourse.model.StudentModel;
import com.nseit.studentcourse.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public void addCourse(CourseModel courseModel) {
        courseRepository.save(courseModel);
    }

    public List<CourseModel> viewCourse() {
        return courseRepository.findAll();
    }

    public void updateCourse(CourseModel courseModel) {
        courseRepository.save(courseModel);
    }

    public void deleteCourse(int id) {
        for (CourseModel courseModel: courseRepository.findAll()){
            if(id == courseModel.getId()){
                courseRepository.delete(courseModel);
            }
        }
    }
}
