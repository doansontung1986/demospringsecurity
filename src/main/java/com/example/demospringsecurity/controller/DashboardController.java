package com.example.demospringsecurity.controller;

import com.example.demospringsecurity.security.IsAdmin;
import com.example.demospringsecurity.security.IsSale;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DashboardController {
    @IsAdmin
    @IsSale
    @GetMapping("/dashboard")
    public String getDashboard() {
        return "dashboard";
    }
}
