package com.example.singlishbackend.word.controller;

import com.example.singlishbackend.category.service.dto.CategoryDtoAssembler;
import com.example.singlishbackend.category.service.dto.response.CategoryResponse;
import com.example.singlishbackend.word.service.WordService;
import com.example.singlishbackend.word.service.dto.WordDtoAssembler;
import com.example.singlishbackend.word.service.dto.response.WordResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/words")
@RestController
public class WordController {
    public final WordService wordService;
    @Autowired
    public WordController(final WordService wordService){ this.wordService = wordService;}
    @GetMapping("/{id}")
    public WordResponse getWord(@PathVariable("id") Long id) {
        return WordDtoAssembler.wordResponse(wordService.getWord(id));
    }
}
