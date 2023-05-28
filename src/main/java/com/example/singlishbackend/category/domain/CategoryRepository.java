package com.example.singlishbackend.category.domain;

import com.example.singlishbackend.course.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
