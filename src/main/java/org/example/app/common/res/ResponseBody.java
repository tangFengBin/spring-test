package org.example.app.common.res;

import lombok.Data;

@Data
public class ResponseBody<T> {
    private String code;
    private String message;
    private T data;

    public ResponseBody(T data, String message, String code) {
        this.data = data;
        this.message = message;
        this.code = code;
    }
}
