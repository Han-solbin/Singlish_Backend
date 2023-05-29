package com.example.singlishbackend.category.service.dto.response;

import com.example.singlishbackend.course.domain.Course;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseFindResponse {
    private Long id;
    private String title;
    private String subtitle;
    private String description;
    private String imgUrl;
}
