package com.example.singlishbackend.course.exception;

import com.example.singlishbackend.global.exception.ErrorCode;

public enum CourseErrorCode implements ErrorCode {
    COURSE_NOT_EXIST(400, "COURSE_001", "코스가 존재하지 않습니다."),
    ;
    private final int statusCode;
    private final String errorCode;
    private final String message;

    CourseErrorCode(int statusCode, String errorCode, String message) {
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
