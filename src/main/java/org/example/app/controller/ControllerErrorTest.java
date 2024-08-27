package org.example.app.controller;

import org.example.app.common.exception.custom.HttpRequestError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerErrorTest {

    @GetMapping("get/error")
    public String get() {
        throw new HttpRequestError("error", "error", new RuntimeException());
    }
    @GetMapping("get/error/null")
    public String getNull() {
        throw new NullPointerException();
    }
}
