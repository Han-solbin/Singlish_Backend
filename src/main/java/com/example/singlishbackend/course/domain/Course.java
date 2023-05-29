package com.example.singlishbackend.course.domain;

import com.example.singlishbackend.category.domain.Category;
import com.example.singlishbackend.word.domain.Word;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="category_id", referencedColumnName = "id")
    private Category category;
    @Column(nullable = false, length = 255)
    private String imgUrl;
    @Column(nullable = false, length = 255)
    private String description;
    @Column(nullable = false, length = 255)
    private String subtitle;
    @Column(nullable = false, length = 30)
    private String title;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private List<Word> words = new ArrayList<>();
    public Long getCategoryId(){
        return category.getId();
    }
    public List<Word> getWords() {
        return words;
    }

}
