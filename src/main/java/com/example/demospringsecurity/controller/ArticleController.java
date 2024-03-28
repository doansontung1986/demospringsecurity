package com.example.demospringsecurity.controller;

import com.example.demospringsecurity.security.IsAdmin;
import com.example.demospringsecurity.security.IsAuthor;
import com.example.demospringsecurity.security.IsSale;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ArticleController {
    @IsAdmin
    @IsSale
    @IsAuthor
    @GetMapping("/article")
    public String getArticle() {
        return "article";
    }

    @IsAdmin
    @IsSale
    @IsAuthor
    @GetMapping("/create-article")
    public String createArticle() {
        System.out.println("Created article success");
        return "article";
    }

    @IsAdmin
    @IsSale
    @IsAuthor
    @GetMapping("/update-article/{id}")
    public String updateArticle(@PathVariable Integer id) {
        System.out.println("Updating article ID: " + id);
        return "article";
    }

    @IsAdmin
    @IsSale
    @IsAuthor
    @GetMapping("/delete-article/{id}")
    public String deleteArticle(@PathVariable Integer id) {
        System.out.println("Deleting article ID: " + id);
        return "article";
    }
}
