package com.tutorial.spring.global.common.response;

import com.tutorial.spring.global.common.code.StatusCode;
import com.tutorial.spring.global.common.message.ResponseMessage;
import lombok.Builder;
import lombok.Getter;

/**
 * 공통 API Response
 */
@Builder
@Getter
public class CommonResponse<T> {

    // 응답 코드
    private final StatusCode statusCode;

    // 응답 메세지
    private final ResponseMessage message;

    // 결과
    private T data;

    public static <T> CommonResponse<T> success(StatusCode statusCode, ResponseMessage message, T data) {
        return CommonResponse.<T>builder()
                .statusCode(statusCode)
                .message(message)
                .data(data)
                .build();
    }

    public static <T> CommonResponse<T> error(StatusCode statusCode, ResponseMessage message) {
        return CommonResponse.<T>builder()
                .statusCode(statusCode)
                .message(message)
                .build();
    }
}