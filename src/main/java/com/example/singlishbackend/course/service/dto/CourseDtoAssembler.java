package com.example.singlishbackend.course.service.dto;

import com.example.singlishbackend.course.service.dto.response.CourseResponse;
import com.example.singlishbackend.course.domain.Course;
import com.example.singlishbackend.course.service.dto.response.WordFindResponse;
import com.example.singlishbackend.word.domain.Word;

import java.util.List;
import java.util.stream.Collectors;

public class CourseDtoAssembler {
    private CourseDtoAssembler() {
    }

    public static CourseResponse courseResponse(Course course) {
        return new CourseResponse(course.getId(), course.getTitle(), course.getSubtitle(), course.getDescription(), course.getImgUrl() , course.getCategoryId());
    }

    public static List<CourseResponse> courseResponses(List<Course> courses) {
        return courses.stream()
                .map(CourseDtoAssembler::courseResponse)
                .collect(Collectors.toList());
    }
    public static WordFindResponse wordFindResponse(Word word) {
        return new WordFindResponse(word.getId(), word.getEngWord(), word.getKorWord(), word.getDiacritic(), word.getAudioUrl());
    }
    public static List<WordFindResponse> wordFindResponses(List<Word> words) {
        return words.stream()
                .map(CourseDtoAssembler::wordFindResponse)
                .collect(Collectors.toList());
    }
}
