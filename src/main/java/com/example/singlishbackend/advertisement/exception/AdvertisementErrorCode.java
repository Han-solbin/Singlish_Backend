package com.example.singlishbackend.advertisement.exception;

import com.example.singlishbackend.global.exception.ErrorCode;

public enum AdvertisementErrorCode implements ErrorCode {
    ADVERTISEMENT_NOT_EXIST(400, "ADVERTISEMENT_001", "광고가 존재하지 않습니다."),
    ;
    private final int statusCode;
    private final String errorCode;
    private final String message;

    AdvertisementErrorCode(int statusCode, String errorCode, String message) {
        this.statusCode = statusCode;
        this.errorCode = errorCode;
        this.message = message;
    }

    @Override
    public int getStatusCode() {
        return statusCode;
    }

    @Override
    public String getErrorCode() {
        return errorCode;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
