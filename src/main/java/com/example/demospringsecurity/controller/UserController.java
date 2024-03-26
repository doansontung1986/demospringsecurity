package com.example.demospringsecurity.controller;

import com.example.demospringsecurity.security.IsUser;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {

//    @Secured("ROLE_USER")
//    @PreAuthorize("hasRole('ROLE_USER')")
    @IsUser
    @GetMapping("/user")
    public String getUser() {
        return "user";
    }

    @GetMapping("/create-user")
    public String createUser() {
        System.out.println("Created user success");
        return "user";
    }

    @GetMapping("/update-user/{id}")
    public String updateUser(@PathVariable Integer id) {
        System.out.println("Updating user ID: " + id);
        return "user";
    }

    @GetMapping("/delete-user/{id}")
    public String deleteUser(@PathVariable Integer id) {
        System.out.println("Deleting user ID: " + id);
        return "user";
    }
}
