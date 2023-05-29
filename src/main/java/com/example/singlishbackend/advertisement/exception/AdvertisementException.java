package com.example.singlishbackend.advertisement.exception;

import com.example.singlishbackend.global.exception.ErrorCode;
import com.example.singlishbackend.global.exception.SinglishException;

public class AdvertisementException extends SinglishException {
    public AdvertisementException(ErrorCode code) {
        super(code);
    }
}
