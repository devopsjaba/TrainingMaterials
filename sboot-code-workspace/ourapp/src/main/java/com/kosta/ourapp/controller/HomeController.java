package com.kosta.ourapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")        // new HomeController().home()
    public String home() {
        return "index";     //index.html
    }
}
