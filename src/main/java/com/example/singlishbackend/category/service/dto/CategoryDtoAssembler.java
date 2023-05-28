package com.example.singlishbackend.category.service.dto;

import com.example.singlishbackend.category.domain.Category;
import com.example.singlishbackend.category.service.dto.response.CategoryResponse;
import com.example.singlishbackend.course.domain.Course;
import com.example.singlishbackend.course.service.dto.CourseDtoAssembler;
import com.example.singlishbackend.course.service.dto.response.CourseResponse;

import java.util.List;
import java.util.stream.Collectors;

public class CategoryDtoAssembler {
    private CategoryDtoAssembler(){

    }
    public static CategoryResponse categoryResponse(Category category){
        return new CategoryResponse(category.getId(), category.getTitle(), category.getDescription(), category.getTitle());
    }
    public static List<CategoryResponse> categoryResponses(List<Category> category) {
        return category.stream()
                .map(CategoryDtoAssembler::categoryResponse)
                .collect(Collectors.toList());
    }
}
