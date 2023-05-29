package com.example.singlishbackend.category.controller;

import com.example.singlishbackend.category.domain.Category;
import com.example.singlishbackend.category.service.CategoryService;
import com.example.singlishbackend.category.service.dto.CategoryDtoAssembler;
import com.example.singlishbackend.category.service.dto.response.CategoryResponse;
import com.example.singlishbackend.category.service.dto.response.CourseFindResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/categories")
@RestController
public class CategoryController {
    private final CategoryService categoryService;
    @Autowired
    public CategoryController(final CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @GetMapping("")
    public List<CategoryResponse> findAll() {
        return CategoryDtoAssembler.categoryResponses(categoryService.findAll());
    }
    @GetMapping("/{id}")
    public CategoryResponse getCategory(@PathVariable("id") Long id) {
        return CategoryDtoAssembler.categoryResponse(categoryService.getCategory(id));
    }
    @GetMapping("/{id}/courses")
    public List<CourseFindResponse> getCourseFind(@PathVariable("id") Long id) {
        Category category = categoryService.getCategory(id);
        return CategoryDtoAssembler.courseFindResponses(category.getCourses());
    }
}
