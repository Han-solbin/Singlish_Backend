package com.example.singlishbackend.member.service.dto;

import com.example.singlishbackend.member.domain.Member;
import com.example.singlishbackend.member.service.dto.response.MemberResponse;


public class MemberDtoAssembler {
    private MemberDtoAssembler() {
    }
    public static MemberResponse memberResponse(Member member) {
        return new MemberResponse(member.getId(), member.getEmail(), member.getPassword(), member.getUserId() , member.getUsername(), member.getProfileImg_Url());
    }
}
