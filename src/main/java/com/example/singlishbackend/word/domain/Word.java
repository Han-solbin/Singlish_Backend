package com.example.singlishbackend.word.domain;

import com.example.singlishbackend.category.domain.Category;
import com.example.singlishbackend.course.domain.Course;
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
@Table(name = "words")
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 20)
    private String engWord;
    @Column(nullable = false, length = 20)
    private String korWord;
    @Column(nullable = false, length = 20)
    private String diacritic;
    @Column(nullable = false)
    private String audioUrl;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="course_id", referencedColumnName = "id")
    private Course course;
}
