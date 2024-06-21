package com.tutorial.spring.global.exception;

import com.tutorial.spring.global.common.code.StatusCode;

public class ApplicationException extends RuntimeException {
    private final StatusCode statusCode;
    private final String errorCode;

    public ApplicationException(StatusCode statusCode, String errorCode, String message) {
        super(message);
        this.statusCode = statusCode;
        this.errorCode = errorCode;
    }

    public ApplicationException(StatusCode statusCode, String errorCode, String message, Throwable cause) {
        super(message, cause);
        this.statusCode = statusCode;
        this.errorCode = errorCode;
    }

    public StatusCode getStatusCode() {
        return statusCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
