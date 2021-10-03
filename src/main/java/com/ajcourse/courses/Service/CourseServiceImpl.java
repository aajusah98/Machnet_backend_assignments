package com.ajcourse.courses.Service;

import com.ajcourse.courses.dao.CoursesDao;
import com.ajcourse.courses.entity.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CoursesDao coursesDao;

//    List <Courses> list;

    public CourseServiceImpl(){
//        list = new ArrayList<>();
//        list.add(new Courses(132,"java core","java courses"));
//        list.add(new Courses(233,"php","php php"));
    }

    @Override
    public List<Courses> getCoursers() {
        return coursesDao.findAll();
    }

    @Override
    public Optional<Courses> getCourse(long courseId) {
//        Courses c=null;
//
//        for (Courses course:list){
//            if (course.getId()==courseId){
//                c=course;
//                break;
//            }
//        }

        return coursesDao.findById(courseId);
    }

    @Override
    public Courses addCourse(Courses courses) {
//       list.add(courses);
        coursesDao.save(courses);
        return courses;
    }

    @Override
    public Courses updateCourse(Courses courses) {
//        list.forEach(e->{
//            if (e.getId()==courses.getId()){
//                e.setTitle(courses.getTitle());
//                e.setDescription(courses.getDescription());
//            }
//        });
        coursesDao.save(courses);
        return courses;
    }

    @Override
    public void deleteCourse(long courseId) {
//        list=this.list.stream().filter(e->e.getId()!=courseId).collect(Collectors.toList());
       Courses entity= coursesDao.getById(courseId);
        coursesDao.delete(entity);
    }

}
