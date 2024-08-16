package org.kosta.helloboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {   // new HomeController()
    public HomeController() {
        System.out.println("HomeController 생성자 호출");
    }

    @GetMapping("/home")
    public String home() {
        return "index";         //index.html
    }
}
