package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller


public class TestController {
    @GetMapping({"main","/"})
    public String mainPage(){
        return "main";
    }
    @GetMapping("/gugu")
    public String printGugu(){
        return "/gugudan/gugu";
    }
}
