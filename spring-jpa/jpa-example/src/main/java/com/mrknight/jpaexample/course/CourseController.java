package com.mrknight.jpaexample.course;

import java.util.List;
import java.util.Optional;

import com.mrknight.jpaexample.topic.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    private CourseService coursesvc;

    @GetMapping("topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable("id") String id) {
        return coursesvc.getAllCourses(id);
    }

    @PostMapping("topics/{id}/courses")
    public void addCourses(@RequestBody Course course, @PathVariable("id") String id) {
        course.setTopic(new Topic(id, "", ""));
        coursesvc.addCourse(course);

    }

    @GetMapping("topics/{topicid}/courses/{id}")
    public Optional<Course> getCourse(@PathVariable("topicid") String topicid, @PathVariable("id") String id) {
        return coursesvc.getCourse(id);

    }

    @PutMapping("topics/{topicid}/courses/{id}")
    public void updateCourse(@PathVariable("topicid") String topicid, @PathVariable("id") String id,
            @RequestBody Course c) {
        c.setTopic(new Topic(topicid, "", ""));
        coursesvc.updateCourse(c);
    }

    @DeleteMapping("topics/{topicid}/courses/{id}")
    public void delCourse(@PathVariable("topicid") String topicid, @PathVariable("id") String id) {
        coursesvc.deleteCourse(id);
    }
}