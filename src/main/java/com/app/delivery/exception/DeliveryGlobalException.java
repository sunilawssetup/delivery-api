package com.app.delivery.exception;


import com.app.delivery.dto.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

public class DeliveryGlobalException {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorDto> handleGlobalException(RuntimeException runtimeException, WebRequest webRequest) {
        return ResponseEntity.ok(ErrorDto.builder()
                .errorTime(LocalDateTime.now())
                .message(runtimeException.getMessage())
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .path(webRequest.getDescription(false))
                .build());
    }
}
