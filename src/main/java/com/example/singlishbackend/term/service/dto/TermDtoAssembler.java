package com.example.singlishbackend.term.service.dto;

import com.example.singlishbackend.course.domain.Course;
import com.example.singlishbackend.course.service.dto.CourseDtoAssembler;
import com.example.singlishbackend.course.service.dto.response.CourseResponse;
import com.example.singlishbackend.term.domain.Term;
import com.example.singlishbackend.term.service.dto.response.TermResponse;
import org.springframework.lang.Nullable;;

import java.util.List;
import java.util.stream.Collectors;

public class TermDtoAssembler {
    private TermDtoAssembler() {
    }

    public static TermResponse termResponse(Term term) {
        return new TermResponse(term.getId(), term.getTitle(), term.getIsMandatory(), term.getImgUrl(), term.getBody());
    }

    public static List<TermResponse> termResponses(List<Term> terms) {
        return terms.stream()
                .map(TermDtoAssembler::termResponse)
                .collect(Collectors.toList());
    }
}
