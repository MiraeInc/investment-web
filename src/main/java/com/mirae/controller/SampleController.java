package com.mirae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "my");

        return "hello";
    }

    @GetMapping("/er")
    public String er(Model model) {
        int a = 1;
        if ( a > 0) {
            throw new IllegalArgumentException("test error");
        }

        return "er";
    }

}
