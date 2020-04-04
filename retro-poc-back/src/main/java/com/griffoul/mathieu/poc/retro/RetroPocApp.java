package com.griffoul.mathieu.poc.retro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RetroPocApp {

    public static void main(String[] args) {
        SpringApplication.run(RetroPocApp.class, args);
        System.out.println("http://localhost:3000/");
    }

}
