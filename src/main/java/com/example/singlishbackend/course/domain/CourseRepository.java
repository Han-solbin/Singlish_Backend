package com.example.singlishbackend.course.domain;

import com.example.singlishbackend.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    }