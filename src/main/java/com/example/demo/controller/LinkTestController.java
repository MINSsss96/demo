package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/articles")
public class LinkTestController {


    @GetMapping("/list")
public String list_all(){


        return "articles/list_all";
    }
//    @GetMapping("/{id}")
//    public String list_one(){
//
//        return "/6list_one";
//    }
//    @GetMapping("/create")
//   public String Create(){
//        return "/new";
//    }
//
//    @GetMapping("/update")
//    public String update_ok(){
//        return "/update_ok";
//    }
//    @GetMapping("/{id}/update")
//    public String update(){
//        return "/update";
//    }
//    @GetMapping("/{id}/delete")
//    public String delete_ok(){
//        return "/delete_ok";
//    }
//    @GetMapping("{id}/articleComment}")
//    public String comment_view(){
//        return "/comment_view";
//    }
//    @GetMapping("{id}/articleComments/{article-comment-id}/delete}")
//    public String delete_comment_ok(){
//        return "/delete_comment_ok";
//    }
}
