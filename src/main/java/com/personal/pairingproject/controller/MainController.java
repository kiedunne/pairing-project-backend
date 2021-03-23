package com.personal.pairingproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MainController {

    @CrossOrigin("*")
    @GetMapping(value = "health-check")
    public String healthCheck() {
        log.info("health check hit");
        return "OK";
    }
}
