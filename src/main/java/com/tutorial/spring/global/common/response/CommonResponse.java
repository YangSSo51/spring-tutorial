package com.tutorial.spring.global.common.response;

import io.micrometer.common.util.StringUtils;
import lombok.Builder;

/**
 * 공통 API Response
 */
@Builder
public class CommonResponse<T> {

    // 응답 코드로 StatusCode에 정의됨
    private final int statusCode;

    // 응답 메세지
    private final String message;

    // 결과
    private T data;

    /**
     * 필수값 확인을 위한 builder 재정의
     *
     * @param statusCode
     * @param message
     * @param data
     */
    public CommonResponseBuilder builder(final int statusCode,final String message,final T data) {
        //응답 메세지가 필수임
        if(StringUtils.isEmpty(message)) {
            throw new IllegalArgumentException("response 메세지 누락");
        }

        return new CommonResponseBuilder().statusCode(statusCode).message(message).data(data);
    }
}