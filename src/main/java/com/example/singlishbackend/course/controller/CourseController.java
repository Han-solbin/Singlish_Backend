package com.example.singlishbackend.course.controller;

import com.example.singlishbackend.course.service.CourseService;
import com.example.singlishbackend.course.service.dto.CourseDtoAssembler;
import com.example.singlishbackend.course.service.dto.response.CourseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/courses")
@RestController
public class CourseController {
    private final CourseService courseService;
    @Autowired
    public CourseController(final CourseService courseService) {
        this.courseService = courseService;
    }
    @GetMapping("")
    public List<CourseResponse> findAll() {
        return CourseDtoAssembler.courseResponses(courseService.findAll());
    }
    @GetMapping("/{id}")
    public CourseResponse getCourse(@PathVariable("id") Long id) {
        return CourseDtoAssembler.courseResponse(courseService.getCourse(id));
    }
}
