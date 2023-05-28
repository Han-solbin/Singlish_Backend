package com.example.singlishbackend.member.service.dto.response;

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