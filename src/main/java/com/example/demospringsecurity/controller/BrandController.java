package com.example.demospringsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BrandController {
    @GetMapping("/brand")
    public String getBrand() {
        return "brand";
    }

    @GetMapping("/create-brand")
    public String createBrand() {
        System.out.println("Created brand success");
        return "brand";
    }

    @GetMapping("/update-brand/{id}")
    public String updateBrand(@PathVariable Integer id) {
        System.out.println("Updating brand ID: " + id);
        return "brand";
    }

    @GetMapping("/delete-brand/{id}")
    public String deleteBrand(@PathVariable Integer id) {
        System.out.println("Deleting brand ID: " + id);
        return "brand";
    }
}
