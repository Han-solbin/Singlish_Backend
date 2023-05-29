package com.example.singlishbackend.member.controller;

import com.example.singlishbackend.member.domain.entity.Member;
import com.example.singlishbackend.member.domain.entity.Subscribe;
import com.example.singlishbackend.member.service.MemberService;
import com.example.singlishbackend.member.service.dto.MemberDtoAssembler;
import com.example.singlishbackend.member.service.dto.response.MemberResponse;
import com.example.singlishbackend.member.service.dto.response.SubscribeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/users")
@RestController
public class MemberController {
    private final MemberService memberService;
    @Autowired
    public MemberController(final MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/{id}")
    public MemberResponse getMember(@PathVariable("id") Long id) {
        return MemberDtoAssembler.memberResponse(memberService.getMember(id));
    }

    @GetMapping("/{id}/courses")
    public List<SubscribeResponse> getSubscribes(@PathVariable("id") Long id) {
        Member member = memberService.getMember(id);
        return MemberDtoAssembler.subscribeResponses(member.getSubscribes());
    }
}
