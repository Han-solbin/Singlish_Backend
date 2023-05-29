package com.example.singlishbackend.advertisement.controller;

import com.example.singlishbackend.advertisement.service.AdvertisementService;
import com.example.singlishbackend.advertisement.service.dto.AdvertisementDtoAssembler;
import com.example.singlishbackend.advertisement.service.dto.response.AdvertisementResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/advertisements")
@RestController
public class AdvertisementController {
    private final AdvertisementService advertisementService;
    @Autowired
    public AdvertisementController(final AdvertisementService advertisementService) { this.advertisementService = advertisementService; }
    @GetMapping("/{id}")
    public AdvertisementResponse getAdvertisement(@PathVariable("id") Long id) {
        return AdvertisementDtoAssembler.advertisementResponse(advertisementService.getAdvertisement(id));
    }
}
