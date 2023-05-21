package com.example.singlishbackend.member.exception;

import com.example.singlishbackend.global.exception.ErrorCode;
import com.example.singlishbackend.global.exception.SinglishException;

public class MemberException extends SinglishException {

    public MemberException(ErrorCode code) {
        super(code);
    }
}
