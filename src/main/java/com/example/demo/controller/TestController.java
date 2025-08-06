package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller


public class TestController {
    @GetMapping({"main","/"})
    public String mainPage(){
        return "main";
    }
    @GetMapping("/gugu")
    public String printGugu(Model model){
        List<Integer> danList = Arrays.asList(2, 3, 9);
        List<Integer> numList = IntStream.rangeClosed(1, 9).boxed().collect(Collectors.toList());

        model.addAttribute("danList", danList);
        model.addAttribute("numList", numList);
        return "/gugudan/gugu";
    }
}
