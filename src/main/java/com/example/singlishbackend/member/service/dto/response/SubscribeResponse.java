package com.example.singlishbackend.member.service.dto.response;

import com.example.singlishbackend.course.domain.Course;
import com.example.singlishbackend.word.domain.Word;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubscribeResponse {
    private String courseTitle;
    private String courseSubtitle;
    private String courseDescrption;
    private String courseImgUrl;
    private boolean isActivated;
    private float rating;

}
