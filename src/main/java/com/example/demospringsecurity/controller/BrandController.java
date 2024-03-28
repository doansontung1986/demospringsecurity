package com.example.demospringsecurity.controller;

import com.example.demospringsecurity.security.IsAdmin;
import com.example.demospringsecurity.security.IsSale;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BrandController {

    @IsAdmin
    @IsSale
    @GetMapping("/brand")
    public String getBrand() {
        return "brand";
    }

    @IsAdmin
    @IsSale
    @GetMapping("/create-brand")
    public String createBrand() {
        System.out.println("Created brand success");
        return "brand";
    }

    @IsAdmin
    @IsSale
    @GetMapping("/update-brand/{id}")
    public String updateBrand(@PathVariable Integer id) {
        System.out.println("Updating brand ID: " + id);
        return "brand";
    }

    @IsAdmin
    @IsSale
    @GetMapping("/delete-brand/{id}")
    public String deleteBrand(@PathVariable Integer id) {
        System.out.println("Deleting brand ID: " + id);
        return "brand";
    }
}
