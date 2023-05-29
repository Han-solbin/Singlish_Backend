package com.example.singlishbackend.word.service.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WordResponse {
    private Long id;
    private String engWord;
    private String korWord;
    private String diacritic;
    private String audioUrl;
}
