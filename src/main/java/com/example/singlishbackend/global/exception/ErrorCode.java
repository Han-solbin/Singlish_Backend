package com.example.singlishbackend.global.exception;

public interface ErrorCode {
    int getStatusCode();
    String getErrorCode();
    String getMessage();
}
