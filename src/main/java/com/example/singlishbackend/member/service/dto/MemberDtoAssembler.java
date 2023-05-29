package com.example.singlishbackend.member.service.dto;

import com.example.singlishbackend.category.service.dto.CategoryDtoAssembler;
import com.example.singlishbackend.course.domain.Course;
import com.example.singlishbackend.member.domain.entity.Member;
import com.example.singlishbackend.member.domain.entity.Subscribe;
import com.example.singlishbackend.member.service.dto.response.MemberResponse;
import com.example.singlishbackend.member.service.dto.response.SubscribeResponse;
import com.example.singlishbackend.word.domain.Word;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class MemberDtoAssembler {
    private MemberDtoAssembler() {
    }
    public static MemberResponse memberResponse(Member member) {
        return new MemberResponse(member.getId(), member.getEmail(), member.getPassword(), member.getUserId() , member.getUsername(), member.getProfileImg_Url());
    }

    public static SubscribeResponse subscribeResponse(Subscribe subscribe) {
        Course course = subscribe.getCourse();
        return new SubscribeResponse(course.getTitle(), course.getSubtitle(), course.getDescription(), course.getImgUrl(), subscribe.getIsActivated(), subscribe.getRating());
    }

    public static List<SubscribeResponse> subscribeResponses(List<Subscribe> subscribes) {
        return subscribes.stream()
                .map(MemberDtoAssembler::subscribeResponse)
                .collect(Collectors.toList());
    }
}
