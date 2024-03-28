package com.example.demospringsecurity.controller;

import com.example.demospringsecurity.security.IsAdmin;
import com.example.demospringsecurity.security.IsSale;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CategoryController {

    @IsAdmin
    @IsSale
    @GetMapping("/category")
    public String getCategory() {
        return "category";
    }

    @IsAdmin
    @IsSale
    @GetMapping("/create-category")
    public String createCategory() {
        System.out.println("Created category success");
        return "category";
    }

    @IsAdmin
    @IsSale
    @GetMapping("/update-category/{id}")
    public String updateCategory(@PathVariable Integer id) {
        System.out.println("Updating category ID: " + id);
        return "category";
    }

    @IsAdmin
    @IsSale
    @GetMapping("/delete-category/{id}")
    public String deleteCategory(@PathVariable Integer id) {
        System.out.println("Deleting category ID: " + id);
        return "category";
    }
}
