package com.example.singlishbackend.term.controller;

import com.example.singlishbackend.term.service.TermService;
import com.example.singlishbackend.term.service.dto.TermDtoAssembler;
import com.example.singlishbackend.term.service.dto.response.TermResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/terms")
@RestController
public class TermController {
    private final TermService termService;
    @Autowired
    public TermController(final TermService termService) {
        this.termService = termService;
    }
    @GetMapping("")
    public List<TermResponse> findAll() {
        return TermDtoAssembler.termResponses(termService.findAll());
    }
    @GetMapping("/{id}")
    public TermResponse getTerm(@PathVariable("id") Long id) {
        return TermDtoAssembler.termResponse(termService.getTerm(id));
    }
}