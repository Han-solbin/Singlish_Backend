package com.example.singlishbackend.category.exception;

import com.example.singlishbackend.global.exception.ErrorCode;
import com.example.singlishbackend.global.exception.SinglishException;

public class CategoryException extends SinglishException {
    public CategoryException(ErrorCode code) {
        super(code);
    }
}
