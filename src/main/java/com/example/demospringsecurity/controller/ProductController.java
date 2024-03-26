package com.example.demospringsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ProductController {
    @GetMapping("/product")
    public String getProduct() {
        return "product";
    }

    @GetMapping("/create-product")
    public String createProduct() {
        System.out.println("Created product success");
        return "product";
    }

    @GetMapping("/update-product/{id}")
    public String updateProduct(@PathVariable Integer id) {
        System.out.println("Updating product ID: " + id);
        return "product";
    }

    @GetMapping("/delete-product/{id}")
    public String deleteProduct(@PathVariable Integer id) {
        System.out.println("Deleting product ID: " + id);
        return "product";
    }
}
