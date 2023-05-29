package com.example.singlishbackend.word.exception;

import com.example.singlishbackend.global.exception.ErrorCode;
import com.example.singlishbackend.global.exception.SinglishException;

public class WordException extends SinglishException {
    public WordException(ErrorCode code) {
        super(code);
    }
}
