package com.tutorial.spring.global.exception;

import com.tutorial.spring.global.common.code.StatusCode;
import com.tutorial.spring.global.common.message.ResponseMessage;
import com.tutorial.spring.global.common.response.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<CommonResponse<?>> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        log.error("MethodArgumentNotValidException occurred", e);

        Map<String, String> errors = new HashMap<>();
        e.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });

        CommonResponse<?> response = CommonResponse.error(StatusCode.BAD_REQUEST, e.getDetailMessageCode(),errors);
        return new ResponseEntity<>(response, e.getStatusCode());
    }
    @ExceptionHandler(ApplicationException.class)
    public ResponseEntity<CommonResponse<?>> handleApplicationException(ApplicationException e) {
        log.error("ApplicationException occurred", e);
        ResponseMessage responseMessage = ResponseMessage.fromCode(e.getErrorCode());
        CommonResponse<?> response = CommonResponse.error(e.getStatusCode(), responseMessage);
        return new ResponseEntity<>(response, HttpStatus.valueOf(e.getStatusCode().getCode()));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<CommonResponse<?>> handleException(Exception e) {
        log.error("Exception occurred", e);
        CommonResponse<?> response = CommonResponse.error(StatusCode.INTERNAL_SERVER_ERROR, ResponseMessage.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

