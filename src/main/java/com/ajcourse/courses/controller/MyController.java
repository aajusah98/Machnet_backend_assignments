package com.ajcourse.courses.controller;


import com.ajcourse.courses.Service.CourseService;
import com.ajcourse.courses.entity.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

//    test method
    @GetMapping("/home")
    public String home(){
        return "Welcome to courses application";
    }

    //get the all Courses
    @GetMapping("courses")
    public List<Courses> getCourses(){
    return  this.courseService.getCoursers();
    }

    //get course by id
    @GetMapping("/courses/{courseId}")
    public Optional<Courses> getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }

    //create courses
    @PostMapping("/courses")
    public Courses addCourse(@RequestBody Courses courses){
        return  this.courseService.addCourse(courses);
    }

    //update courses
    @PutMapping("courses")
    public Courses updateCourse(@RequestBody Courses courses){
        return this.courseService.updateCourse(courses);
    }

    //get course by id
    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
        try {
            this.courseService.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
