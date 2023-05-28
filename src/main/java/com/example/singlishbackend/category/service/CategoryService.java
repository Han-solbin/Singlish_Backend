package com.example.singlishbackend.category.service;

import com.example.singlishbackend.category.domain.Category;
import com.example.singlishbackend.category.domain.CategoryRepository;
import com.example.singlishbackend.category.exception.CategoryErrorCode;
import com.example.singlishbackend.category.exception.CategoryException;
import com.example.singlishbackend.course.domain.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
    public Category getCategory(Long id) {
        return categoryRepository.findById(id).orElseThrow(()-> new CategoryException(CategoryErrorCode.CATEGORY_NOT_EXIST));
    }
}
