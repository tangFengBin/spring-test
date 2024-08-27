package org.example.app.common.exception;

import lombok.extern.slf4j.Slf4j;
import org.example.app.common.exception.custom.HttpRequestError;
import org.example.app.common.res.ResponseBody;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    public GlobalExceptionHandler() {
    }

    private ResponseBody<?> getResponseBody(ExceptionBase e) {
        return new ResponseBody<Object>(null, e.getErrorMessage(), e.getErrorCode());
    }

    @ExceptionHandler(ExceptionBase.class)
    public ResponseBody<?> handleException(ExceptionBase e) {
        log.error("{}:{},exception:{}", e.getErrorCode(), e.getErrorMessage(),e.getCause());
        return getResponseBody(e);
    }
    @ExceptionHandler(Exception.class)
    public ResponseBody<?> handleException(Exception e) {
        log.error("{}:{}", "500", "系统异常",e);
        return new ResponseBody<>(null, "系统异常", "500");
    }
}
