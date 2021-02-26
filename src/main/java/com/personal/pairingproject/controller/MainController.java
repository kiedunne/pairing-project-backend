package com.personal.pairingproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping(value = "health-check")
    public String healthCheck() {
        return "OK";
    }
}
