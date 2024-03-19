package com.example.demospringsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {
    @GetMapping("/article")
    public String getArticle() {
        return "View Article";
    }

    @GetMapping("/create-article")
    public String createArticle() {
        return "Create Article";
    }

    @GetMapping("/update-article")
    public String updateArticle() {
        return "Update Article";
    }

    @GetMapping("/delete-article")
    public String deleteArticle() {
        return "Delete Article";
    }
}
