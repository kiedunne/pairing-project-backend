package com.personal.pairingproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {Application.class})
public class Application {
    public static void main(String... args) {
        SpringApplication.run(Application.class);
    }
}
