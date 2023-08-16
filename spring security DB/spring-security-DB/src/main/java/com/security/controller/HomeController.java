package com.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/about")
    public String about(){
        return "about";
    }
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/profile")
    public String profile(){
        return "profile";
    }
}
