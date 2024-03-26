package com.example.demospringsecurity.controller;

import com.example.demospringsecurity.security.IAuthenticationFacade;
import com.example.demospringsecurity.security.IsAdmin;
import jakarta.annotation.security.RolesAllowed;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class WebController {
    private IAuthenticationFacade authenticationFacade;

    @GetMapping("/")
    public String getHome() {
        return "index";
    }

    //    @RolesAllowed("ADMIN")
    @IsAdmin
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/admin")
    public String getAdmin() {
        return "admin";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }
}
