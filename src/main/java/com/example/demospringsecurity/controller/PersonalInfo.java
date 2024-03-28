package com.example.demospringsecurity.controller;

import com.example.demospringsecurity.security.IsUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PersonalInfo {

    @IsUser
    @GetMapping("/personal")
    public String getPersonal() {
        return "user";
    }

    @IsUser
    @GetMapping("/update-personal/{id}")
    public String updatePersonal(@PathVariable Integer id) {
        System.out.println("Updating ID: " + id);
        return "user";
    }
}
