package com.example.singlishbackend.member.controller;

import com.example.singlishbackend.member.service.MemberService;
import com.example.singlishbackend.member.service.dto.MemberDtoAssembler;
import com.example.singlishbackend.member.service.dto.response.MemberResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return MemberDtoAssembler.MemberResponse(memberService.getMember(id));
    }
}
