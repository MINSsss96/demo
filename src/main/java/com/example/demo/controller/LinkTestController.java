package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/articles")
public class LinkTestController {


    @GetMapping("/list")
private String list_all(){


        return "articles/list_all";
    }
//    @GetMapping("/{id}")
//    private String list_one(){
//
//        return "/6list_one";
//    }
//    @GetMapping("/create")
//   private String Create(){
//        return "/new";
//    }
//
//    @GetMapping("/update")
//    private String update_ok(){
//        return "/update_ok";
//    }
//    @GetMapping("/{id}/update")
//    private String update(){
//        return "/update";
//    }
//    @GetMapping("/{id}/delete")
//    private String delete_ok(){
//        return "/delete_ok";
//    }
//    @GetMapping("{id}/articleComment}")
//    private String comment_view(){
//        return "/comment_view";
//    }
//    @GetMapping("{id}/articleComments/{article-comment-id}/delete}")
//    private String delete_comment_ok(){
//        return "/delete_comment_ok";
//    }
}
