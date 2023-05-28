package com.example.singlishbackend.course.service;

import com.example.singlishbackend.course.domain.Course;
import com.example.singlishbackend.course.domain.CourseRepository;
import com.example.singlishbackend.course.exception.CourseErrorCode;
import com.example.singlishbackend.course.exception.CourseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional(readOnly = true)
@Service
public class CourseService {
    private final CourseRepository courseRepository;

    @Autowired
    public CourseService(final CourseRepository courseRepository) { this.courseRepository = courseRepository;}

    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    public Course getCourse(Long id) {
        return courseRepository.findById(id).orElseThrow(()-> new CourseException(CourseErrorCode.COURSE_NOT_EXIST));
    }
}
