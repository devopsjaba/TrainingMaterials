package org.kosta.helloboot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomController {
    @GetMapping("/custom")
    public String customView() {
        return "customView";
    }
}
