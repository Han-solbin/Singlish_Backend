package com.example.singlishbackend.category.service.dto;
import com.example.singlishbackend.category.domain.Category;
import com.example.singlishbackend.category.service.dto.response.CategoryResponse;
import com.example.singlishbackend.category.service.dto.response.CourseFindResponse;
import com.example.singlishbackend.course.domain.Course;

import java.util.List;
import java.util.stream.Collectors;

public class CategoryDtoAssembler {
    private CategoryDtoAssembler(){
    }
    public static CategoryResponse categoryResponse(Category category){
        return new CategoryResponse(category.getId(), category.getTitle(), category.getDescription(), category.getTitle());
    }
    public static List<CategoryResponse> categoryResponses(List<Category> categories) {
        return categories.stream()
                .map(CategoryDtoAssembler::categoryResponse)
                .collect(Collectors.toList());
    }

    public static CourseFindResponse courseFindResponse(Course course) {
        return new CourseFindResponse(course.getId(), course.getTitle(), course.getSubtitle(), course.getDescription(), course.getImgUrl());
    }
    public static List<CourseFindResponse> courseFindResponses(List<Course> courses) {
        return courses.stream()
                .map(CategoryDtoAssembler::courseFindResponse)
                .collect(Collectors.toList());
    }
}
