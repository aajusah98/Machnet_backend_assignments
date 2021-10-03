package com.ajcourse.courses.Service;

import com.ajcourse.courses.entity.Courses;

import java.util.List;
import java.util.Optional;

public interface CourseService {


    public List<Courses> getCoursers();

    public Optional<Courses> getCourse(long courseId);

    public  Courses addCourse(Courses courses);

    public  Courses updateCourse(Courses courses);

    public  void deleteCourse(long courseId);

}
