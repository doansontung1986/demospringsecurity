package com.example.demospringsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/product")
    public String getProduct() {
        return "View Product";
    }

    @GetMapping("/create-product")
    public String createProduct() {
        return "Create Product";
    }

    @GetMapping("/update-product")
    public String updateProduct() {
        return "Update Product";
    }

    @GetMapping("/delete-product")
    public String deleteProduct() {
        return "Delete Product";
    }
}
