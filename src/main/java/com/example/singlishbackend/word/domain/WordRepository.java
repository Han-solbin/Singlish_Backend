package com.example.singlishbackend.word.domain;

import com.example.singlishbackend.course.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, Long> {
}
