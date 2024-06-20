package com.tutorial.spring.global.common.response;

import lombok.Builder;
import lombok.Getter;

/**
 * 공통 API Response
 */
@Builder
@Getter
public class CommonResponse<T> {

    // 응답 코드로 StatusCode에 정의됨
    private final int statusCode;

    // 응답 메세지
    private final String message;

    // 결과
    private T data;

    public static <T> CommonResponse<T> success(int statusCode, String message, T data) {
        return CommonResponse.<T>builder()
                .statusCode(statusCode)
                .message(message)
                .data(data)
                .build();
    }

    public static <T> CommonResponse<T> error(int statusCode, String message) {
        return CommonResponse.<T>builder()
                .statusCode(statusCode)
                .message(message)
                .build();
    }
}