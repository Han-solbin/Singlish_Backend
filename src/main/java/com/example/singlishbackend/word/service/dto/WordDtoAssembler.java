package com.example.singlishbackend.word.service.dto;

import com.example.singlishbackend.word.domain.Word;
import com.example.singlishbackend.word.service.dto.response.WordResponse;

public class WordDtoAssembler {
    private WordDtoAssembler(){
    }
    public static WordResponse wordResponse(Word word){
        return new WordResponse(word.getId(), word.getEngWord(), word.getKorWord(), word.getDiacritic(), word.getAudioUrl());
    }
}
