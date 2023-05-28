package com.example.singlishbackend.member.service.dto.response;

import com.example.singlishbackend.member.domain.Member;
import com.example.singlishbackend.member.domain.MemberRepository;
import lombok.*;

@Getter
@NoArgsConstructor
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