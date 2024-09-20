package com.zero.jpa_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String jspView() {
        return "main"; // /WEB-INF/jsp/index.jsp
    }

    @GetMapping("/thymeleaf")
    public String thymeleafView(Model model) {
        model.addAttribute("message", "Hello from Thymeleaf!");
        return "th/main"; // classpath:/templates/index.html
    }
}