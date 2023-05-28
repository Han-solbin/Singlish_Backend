package com.example.singlishbackend.search.controller;

import com.example.singlishbackend.search.domain.SearchKeyword;
import com.example.singlishbackend.search.service.SearchKeywordService;
import com.example.singlishbackend.search.service.dto.SearchKeywordDtoAssembler;
import com.example.singlishbackend.search.service.dto.response.SearchKeywordResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequestMapping("/api/v1/search-keywords")
@RestController
public class SearchKeywordController {

    private final SearchKeywordService searchKeywordService;

    @Autowired
    public SearchKeywordController(final SearchKeywordService searchKeywordService) { this.searchKeywordService = searchKeywordService; }

    @GetMapping("")
    public List<SearchKeywordResponse> getSearchKeywords() {
        return SearchKeywordDtoAssembler.searchKeywordResponses(searchKeywordService.findAll());
    }
}
