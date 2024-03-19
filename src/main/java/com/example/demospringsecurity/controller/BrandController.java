package com.example.demospringsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrandController {
    @GetMapping("/brand")
    public String getBrand() {
        return "View Brand";
    }

    @GetMapping("/create-brand")
    public String createBrand() {
        return "Create Brand";
    }

    @GetMapping("/update-brand")
    public String updateBrand() {
        return "Update Brand";
    }

    @GetMapping("/delete-brand")
    public String deleteBrand() {
        return "Delete Brand";
    }
}
