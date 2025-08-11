package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/articles")
public class LinkTestController {
    @GetMapping({"/main", "/"})
    public String mainPage() {
        return "/articles/main";
    }


    @GetMapping("/list")
public String list_all(){
        return "/articles/list_all";
    }

    @GetMapping("/{id}")
    public String list_one(@PathVariable("id") int id, Model model) {
        String msg = id + "번 게시글 읽어오기 성공";
        model.addAttribute("msg", msg);
        return "/articles/list_one";
    }


    @GetMapping("/create")
    public String Create(@RequestParam("name") String name, @RequestParam("weight") int weight,@RequestParam("height") int height, Model model
    ) {
        String msg =  name + "의 키는 " + height + ", 몸무게는" + weight + "입니다.";
        model.addAttribute("name", name);
        model.addAttribute("weight", weight);
        model.addAttribute("height", height);
        model.addAttribute("msg", msg);

        return "/articles/list_one";

    }

    @GetMapping("/update")
    public String update_ok(){
        return "/articles/update_ok";
    }
    @GetMapping("/{id}/update")
    public String update(){
        return "/articles/update";
    }
    @GetMapping("/{id}/delete")
    public String delete_ok(){
        return "/articles/delete_ok";
    }
    @GetMapping("/{id}/articleComment")
    public String comment_view(){
        return "/articles/comment_view";
    }
    @GetMapping("{id}/articleComments/{article-comment-id}/delete")
    public String delete_comment_ok(){
        return "/articles/delete_comment_ok";
    }
}
