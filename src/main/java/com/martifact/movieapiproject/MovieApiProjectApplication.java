package com.martifact.movieapiproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class MovieApiProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieApiProjectApplication.class, args);
    }



}
