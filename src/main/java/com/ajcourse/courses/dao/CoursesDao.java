package com.ajcourse.courses.dao;

import com.ajcourse.courses.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesDao extends JpaRepository<Courses,Long> {

}
