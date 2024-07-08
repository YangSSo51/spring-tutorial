package com.tutorial.spring.global.common.code;

/**
 * 상태 코드
 * 참고 : https://developer.mozilla.org/ko/docs/Web/HTTP
 */
public enum StatusCode {
    //성공 응답
    OK(200),
    CREATED(201),
    ACCEPTED(202),
    NO_CONTENT(204),

    //리다이렉션 메세지
    MULTIPLE_CHOICE(300),
    MOVED_PERMANENTLY(301),

    //클라이언트 에러 응답
    BAD_REQUEST(400),
    UNAUTHORIZED(401),
    FORBIDDEN(403),
    NOT_FOUND(404),

    //서버 에러 응답
    INTERNAL_SERVER_ERROR(500),
    NOT_IMPLEMENTED(501),
    BAD_GATEWAY(502),
    SERVICE_UNAVAILABLE(503);

    private final int code;
    
    StatusCode(int code) { this.code = code; }
    
    public int getCode() { return code; }
}