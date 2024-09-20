package com.kosta.ourapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
    public BoardController() {
        System.out.println("=============== BoardController 생성");
    }

    @GetMapping("/hello")
    public String hello(String name) {
        return "Hello : " + name;
    }
}
