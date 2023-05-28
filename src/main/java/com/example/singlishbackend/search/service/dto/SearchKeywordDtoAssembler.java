package com.example.singlishbackend.search.service.dto;

import com.example.singlishbackend.course.domain.Course;
import com.example.singlishbackend.course.service.dto.CourseDtoAssembler;
import com.example.singlishbackend.course.service.dto.response.CourseResponse;
import com.example.singlishbackend.search.domain.SearchKeyword;
import com.example.singlishbackend.search.service.dto.response.SearchKeywordResponse;

import java.util.List;
import java.util.stream.Collectors;

public class SearchKeywordDtoAssembler {

    private SearchKeywordDtoAssembler(){

    }
    public static SearchKeywordResponse searchKeywordResponse(SearchKeyword searchKeyword) {
        return new SearchKeywordResponse(searchKeyword.getSearchKeyword());
    }

    public static List<SearchKeywordResponse> searchKeywordResponses(List<SearchKeyword> searchKeywords) {
        return searchKeywords.stream()
                .map(SearchKeywordDtoAssembler::searchKeywordResponse)
                .collect(Collectors.toList());
    }
}
