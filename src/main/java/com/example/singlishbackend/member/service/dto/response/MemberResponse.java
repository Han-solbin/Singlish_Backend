package com.example.singlishbackend.member.service.dto.response;

import com.example.singlishbackend.member.domain.Member;
import com.example.singlishbackend.member.domain.MemberRepository;
import lombok.*;

@Getter
@NoArgsConstructor//아무런 매개변수가 없는 생성자, 접근레벨 private entity의 경우에는 private 못 씀.
@AllArgsConstructor
@Builder
public class MemberResponse {
    private Long id;
    private String email;
    private String password;
    private String userId;
    private String userName;
    private String profileImgUrl;

}