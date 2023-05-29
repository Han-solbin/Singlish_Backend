package com.example.singlishbackend.term.service;

import com.example.singlishbackend.course.domain.Course;
import com.example.singlishbackend.course.domain.CourseRepository;
import com.example.singlishbackend.course.exception.CourseErrorCode;
import com.example.singlishbackend.course.exception.CourseException;
import com.example.singlishbackend.term.domain.Term;
import com.example.singlishbackend.term.domain.TermRepository;
import com.example.singlishbackend.term.exception.TermErrorCode;
import com.example.singlishbackend.term.exception.TermException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@Service
public class TermService {
    private final TermRepository termRepository;

    @Autowired
    public TermService(final TermRepository termRepository) { this.termRepository = termRepository;}

    public List<Term> findAll() {
        return termRepository.findAll();
    }

    public Term getTerm(Long id) {
        return termRepository.findById(id).orElseThrow(()-> new TermException(TermErrorCode.TERM_NOT_EXIST));
    }
}
