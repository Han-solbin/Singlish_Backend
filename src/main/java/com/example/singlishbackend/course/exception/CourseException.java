package com.example.singlishbackend.course.exception;

import com.example.singlishbackend.global.exception.ErrorCode;
import com.example.singlishbackend.global.exception.SinglishException;

public class CourseException extends SinglishException {
    public CourseException(ErrorCode code) {
        super(code);
    }
}
