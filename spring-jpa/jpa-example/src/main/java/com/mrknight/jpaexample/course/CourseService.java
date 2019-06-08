package com.mrknight.jpaexample.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepo;

    public List<Course> getAllCourses(String topicId) {
        List<Course> courses = new ArrayList<>();
        courseRepo.findByTopicId(topicId).forEach(courses::add);

        return courses;
    }

    public void addCourse(Course t) {
        courseRepo.save(t);
    }

    public Optional<Course> getCourse(String id) {
        return courseRepo.findById(id);

    }

    public void updateCourse(Course t) {
        courseRepo.save(t);
    }

    public void deleteCourse(String id) {
        courseRepo.deleteById(id);

    }

}