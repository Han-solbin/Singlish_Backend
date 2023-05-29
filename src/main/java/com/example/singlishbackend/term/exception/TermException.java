package com.example.singlishbackend.term.exception;

import com.example.singlishbackend.global.exception.ErrorCode;
import com.example.singlishbackend.global.exception.SinglishException;

public class TermException extends SinglishException {
    public TermException(ErrorCode code) {
        super(code);
    }
}
