package com.example.demospringsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
    @GetMapping("/category")
    public String getCategory() {
        return "View Category";
    }

    @GetMapping("/create-category")
    public String createCategory() {
        return "Create Category";
    }

    @GetMapping("/update-category")
    public String updateCategory() {
        return "Update Category";
    }

    @GetMapping("/delete-category")
    public String deleteCategory() {
        return "Delete Category";
    }
}
