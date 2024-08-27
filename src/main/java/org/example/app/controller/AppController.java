package org.example.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class AppController {
    @GetMapping("/get")
    public String get() {
        log.info("123asdasdasdasdasdasdas");
        return "Hello World!";
    }
}
