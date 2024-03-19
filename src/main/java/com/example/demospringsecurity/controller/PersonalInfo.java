package com.example.demospringsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonalInfo {
    @GetMapping("/personal")
    public String getPersonal() {
        return "View Personal";
    }

    @GetMapping("/update-personal")
    public String updatePersonal() {
        return "Update Personal";
    }
}
