package com.example.singlishbackend.word.exception;

import com.example.singlishbackend.global.exception.ErrorCode;

public enum WordErrorCode implements ErrorCode {
    WORD_NOT_EXIST(400, "WORD_001", "단어가 존재하지 않습니다."),
    ;
    private final int statusCode;
    private final String errorCode;
    private final String message;

    WordErrorCode(int statusCode, String errorCode, String message) {
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