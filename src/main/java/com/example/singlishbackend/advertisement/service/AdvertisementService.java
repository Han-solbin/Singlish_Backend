package com.example.singlishbackend.advertisement.service;

import com.example.singlishbackend.advertisement.domain.Advertisement;
import com.example.singlishbackend.advertisement.domain.AdvertisementRepository;
import com.example.singlishbackend.advertisement.exception.AdvertisementErrorCode;
import com.example.singlishbackend.advertisement.exception.AdvertisementException;
import com.example.singlishbackend.advertisement.service.dto.response.AdvertisementResponse;
import com.example.singlishbackend.course.domain.Course;
import com.example.singlishbackend.course.exception.CourseErrorCode;
import com.example.singlishbackend.course.exception.CourseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/advertisements")
@RestController
public class AdvertisementService {
    private final AdvertisementRepository advertisementRepository;
    @Autowired
    public AdvertisementService(final AdvertisementRepository advertisementRepository) {
        this.advertisementRepository = advertisementRepository;
    }

    public List<Advertisement> findAll() {
        return advertisementRepository.findAll();
    }

    public Advertisement getAdvertisement(Long id) {
        return advertisementRepository.findById(id).orElseThrow(()-> new AdvertisementException(AdvertisementErrorCode.ADVERTISEMENT_NOT_EXIST));
    }
}
