package com.tutorial.spring.global.common.message;

public enum ResponseMessage {
    JOIN_SUCCESS("회원가입에 성공했습니다."),
    JOIN_FAIL("회원가입에 실패했습니다.");

    private final String message;

    ResponseMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
