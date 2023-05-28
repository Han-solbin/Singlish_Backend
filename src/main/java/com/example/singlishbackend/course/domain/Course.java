package com.example.singlishbackend.course.domain;

import com.example.singlishbackend.category.domain.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="category_id", referencedColumnName = "id")
    Category category;
    @Column(nullable = false, length = 255)
    private String imgUrl;
    @Column(nullable = false, length = 255)
    private String description;
    @Column(nullable = false, length = 255)
    private String subtitle;
    @Column(nullable = false, length = 30)
    private String title;

    public Long getCategoryId(){
        return category.getId();
    }
}
