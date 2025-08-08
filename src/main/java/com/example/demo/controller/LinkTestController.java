package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/articles")
public class LinkTestController {


    @GetMapping("/list")
public String list_all(){
        return "/articles/list_all";
    }

    @GetMapping("/{id}")
    public String list_one(@PathVariable("id") int id, Model model) {
        model.addAttribute("someId", 7);
        model.addAttribute("list_one", id + "번 게시글 읽어오기 성공");
        return "articles/list_one";
    }

    @GetMapping("/create")
   public String Create(){
        return "/articles/new";
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
