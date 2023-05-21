package com.example.singlishbackend.global.exception;

import lombok.Getter;

@Getter
public class SinglishException extends RuntimeException {
    private final int statusCode;
    private final String errorCode;
    private final String message;

    public SinglishException(ErrorCode code) {
        statusCode = code.getStatusCode();
        errorCode = code.getErrorCode();
        message = code.getMessage();
    }
}