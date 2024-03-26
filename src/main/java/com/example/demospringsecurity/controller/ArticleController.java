package com.example.demospringsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ArticleController {
    @GetMapping("/article")
    public String getArticle() {
        return "article";
    }

    @GetMapping("/create-article")
    public String createArticle() {
        System.out.println("Created article success");
        return "article";
    }

    @GetMapping("/update-article/{id}")
    public String updateArticle(@PathVariable Integer id) {
        System.out.println("Updating article ID: " + id);
        return "article";
    }

    @GetMapping("/delete-article/{id}")
    public String deleteArticle(@PathVariable Integer id) {
        System.out.println("Deleting article ID: " + id);
        return "article";
    }
}
