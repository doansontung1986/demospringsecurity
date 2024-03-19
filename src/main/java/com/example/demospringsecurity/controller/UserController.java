package com.example.demospringsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/user")
    public String getUser() {
        return "View User";
    }

    @GetMapping("/create-user")
    public String createUser() {
        return "Create User";
    }

    @GetMapping("/update-user")
    public String updateUser() {
        return "Update User";
    }

    @GetMapping("/delete-user")
    public String deleteUser() {
        return "Delete User";
    }
}
