package com.example.singlishbackend.advertisement.service.dto;

import com.example.singlishbackend.advertisement.domain.Advertisement;
import com.example.singlishbackend.advertisement.service.dto.response.AdvertisementResponse;
import com.example.singlishbackend.course.domain.Course;
import com.example.singlishbackend.course.service.dto.CourseDtoAssembler;
import com.example.singlishbackend.course.service.dto.response.CourseResponse;

import java.util.List;
import java.util.stream.Collectors;

public class AdvertisementDtoAssembler {
    private AdvertisementDtoAssembler() {
    }

    public static AdvertisementResponse advertisementResponse(Advertisement advertisement) {
        return new AdvertisementResponse(advertisement.getId(), advertisement.getTitle(), advertisement.getBody(), advertisement.getImgUrl());
    }

    public static List<AdvertisementResponse> courseResponses(List<Advertisement> advertisements) {
        return advertisements.stream()
                .map(AdvertisementDtoAssembler::advertisementResponse)
                .collect(Collectors.toList());
    }
}
