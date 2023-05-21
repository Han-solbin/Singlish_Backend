package com.example.singlishbackend.global.exception;
import lombok.Data;
import lombok.Getter;
import lombok.AllArgsConstructor;
@Getter
@AllArgsConstructor
public enum GlobalErrorCode implements ErrorCode{
    NOT_SUPPORTED_URI_ERROR(404, "NOT_SUPPORTED_URI", "지원하지 않는 URI 요청입니다."),
    NOT_SUPPORTED_METHOD_ERROR(405, "NOT_SUPPORTED_METHOD", "지원하지 않는 Method 요청입니다."),
    VALIDATION_ERROR(400, "VALIDATION_001", "잘못된 요청입니다."),
    INTERNAL_SERVER_ERROR(500, "SERVER_001", "내부 서버 오류입니다."),
    ;
    private final int statusCode;
    private final String errorCode;
    private final String message;

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