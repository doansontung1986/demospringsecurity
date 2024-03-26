package com.example.demospringsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CategoryController {
    @GetMapping("/category")
    public String getCategory() {
        return "category";
    }

    @GetMapping("/create-category")
    public String createCategory() {
        System.out.println("Created category success");
        return "category";
    }

    @GetMapping("/update-category/{id}")
    public String updateCategory(@PathVariable Integer id) {
        System.out.println("Updating category ID: " + id);
        return "category";
    }

    @GetMapping("/delete-category/{id}")
    public String deleteCategory(@PathVariable Integer id) {
        System.out.println("Deleting category ID: " + id);
        return "category";
    }
}
