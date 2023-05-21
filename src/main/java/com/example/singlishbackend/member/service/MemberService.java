package com.example.singlishbackend.member.service;

import com.example.singlishbackend.member.domain.Member;
import com.example.singlishbackend.member.domain.MemberRepository;
import com.example.singlishbackend.member.exception.MemberErrorCode;
import com.example.singlishbackend.member.exception.MemberException;
import com.example.singlishbackend.member.service.dto.MemberDtoAssembler;
import com.example.singlishbackend.member.service.dto.response.MemberResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional(readOnly = true)
@Service
public class MemberService {
    private final MemberRepository memberRepository;
    @Autowired
    public MemberService(final MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member getMember(Long id) {
        Member member = memberRepository.findById(id).orElseThrow(()-> new MemberException(MemberErrorCode.MEMBER_NOT_EXIST));
        return member;
    }

}
