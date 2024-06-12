package com.tutorial.spring.global.common.code;

/**
 * 상태 코드
 * 참고 : https://developer.mozilla.org/ko/docs/Web/HTTP
 */
public class StatusCode {
    //성공 응답
    public static final int OK = 200;
    public static final int CREATED = 201;
    public static final int ACCEPTED = 202;
    public static final int NO_CONTENT = 204;

    //리다이렉션 메세지
    public static final int MULTIPLE_CHOICE = 300;
    public static final int MOVED_PERMANENTLY = 301;

    //클라이언트 에러 응답
    public static final int BAD_REQUEST =  400;
    public static final int UNAUTHORIZED = 401;
    public static final int FORBIDDEN = 403;
    public static final int NOT_FOUND = 404;

    //서버 에러 응답
    public static final int INTERNAL_SERVER_ERROR = 500;
    public static final int NOT_IMPLEMENTED = 501;
    public static final int BAD_GATEWAY = 502;
    public static final int SERVICE_UNAVAILABLE = 503;
}