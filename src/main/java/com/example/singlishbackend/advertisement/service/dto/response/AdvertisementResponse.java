package com.example.singlishbackend.advertisement.service.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdvertisementResponse {
    private Long id;
    private String title;
    private String body;
    private String imgUrl;
}
