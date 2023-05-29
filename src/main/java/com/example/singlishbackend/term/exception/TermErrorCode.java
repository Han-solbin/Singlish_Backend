package com.example.singlishbackend.term.exception;

import com.example.singlishbackend.global.exception.ErrorCode;

public enum TermErrorCode implements ErrorCode {
    TERM_NOT_EXIST(400, "TERM_001", "약관이 존재하지 않습니다."),
    ;
    private final int statusCode;
    private final String errorCode;
    private final String message;

    TermErrorCode(int statusCode, String errorCode, String message) {
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
