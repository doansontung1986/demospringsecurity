package com.example.demospringsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @GetMapping("/order")
    public String getOrder() {
        return "View Order";
    }

    @GetMapping("/create-order")
    public String createOrder() {
        return "Create Order";
    }

    @GetMapping("/update-order")
    public String updateOrder() {
        return "Update Order";
    }

    @GetMapping("/delete-order")
    public String deleteOrder() {
        return "Delete Order";
    }
}
