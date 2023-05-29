package com.example.singlishbackend.category.domain;

import com.example.singlishbackend.course.domain.Course;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "categories")
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 20)
    private String title;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String imgUrl;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private List<Course> courses = new ArrayList<>();

    public List<Course> getCourses() {
        return courses;
    }
}
