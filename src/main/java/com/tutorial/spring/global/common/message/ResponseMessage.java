package com.tutorial.spring.global.common.message;

public enum ResponseMessage {
    //일반 에러 메세지
    INTERNAL_SERVER_ERROR("내부 서버 에러가 발생했습니다."),
    APPLICATION_EXCEPTION("ApplicationException이 발생했습니다."),

    //회원 관련 메세
    JOIN_SUCCESS("회원가입에 성공했습니다."),
    JOIN_FAIL("회원가입에 실패했습니다."),

    NO_MATCHING_RESPONSE_MESSAGE("해당 코드와 맞는 응답 메세지가 존재하지 않습니다.");

    private final String message;

    ResponseMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public static ResponseMessage fromCode(String code) {
        for (ResponseMessage message : ResponseMessage.values()) {
            if (message.name().equals(code)) {
                return message;
            }
        }
        throw new IllegalArgumentException(NO_MATCHING_RESPONSE_MESSAGE.message);
    }
}
