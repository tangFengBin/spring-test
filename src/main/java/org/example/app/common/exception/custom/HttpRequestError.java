package org.example.app.common.exception.custom;

import org.example.app.common.exception.ExceptionBase;

public class HttpRequestError extends ExceptionBase {
    private static final long serialVersionUID = 1L;
    private final String code;
    private final String message;

    public String getErrorCode() {
        return code;
    }

    public String getErrorMessage() {
        return message;
    }

    public HttpRequestError(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
        this.message = message;
    }


}
