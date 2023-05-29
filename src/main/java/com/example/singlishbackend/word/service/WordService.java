package com.example.singlishbackend.word.service;

import com.example.singlishbackend.category.exception.CategoryErrorCode;
import com.example.singlishbackend.category.exception.CategoryException;
import com.example.singlishbackend.word.domain.Word;
import com.example.singlishbackend.word.domain.WordRepository;
import com.example.singlishbackend.word.exception.WordErrorCode;
import com.example.singlishbackend.word.exception.WordException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@Service
public class WordService {
    private final WordRepository wordRepository;

    @Autowired
    public WordService(WordRepository wordRepository) { this.wordRepository = wordRepository;}

    public Word getWord(Long id) { return wordRepository.findById(id).orElseThrow(()-> new WordException(WordErrorCode.WORD_NOT_EXIST));}
}
