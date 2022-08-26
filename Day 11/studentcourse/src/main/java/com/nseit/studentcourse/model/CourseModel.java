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
@Table(name = "course")
public class CourseModel {
    @Id
    @GeneratedValue
    private Integer id;
    private String courseName;
    private Integer duration;
    @ManyToMany(mappedBy = "course")
    private List<StudentModel> student;
}
