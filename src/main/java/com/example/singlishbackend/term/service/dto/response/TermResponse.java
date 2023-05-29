package com.example.singlishbackend.term.service.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TermResponse {
    private Long id;
    private String title;
    private Boolean isMandatory;
    private Optional<String> imgUrl;
    private String body;

}
