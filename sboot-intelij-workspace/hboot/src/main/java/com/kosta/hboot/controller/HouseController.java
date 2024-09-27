package com.kosta.hboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HouseController {

    public HouseController() {
        System.out.println("HouseController");
    }

    @GetMapping("/house")
    public String house() {
        return "index";
    }
}
