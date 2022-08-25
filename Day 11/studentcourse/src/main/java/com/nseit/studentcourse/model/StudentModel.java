package com.nseit.studentcourse.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class StudentModel {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer rollNumber;
    private Integer age;
    private List<CourseModel> courseModels;
}
