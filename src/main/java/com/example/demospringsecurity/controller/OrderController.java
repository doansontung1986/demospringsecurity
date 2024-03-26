package com.example.demospringsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class OrderController {
    @GetMapping("/order")
    public String getOrder() {
        return "order";
    }

    @GetMapping("/create-order")
    public String createOrder() {
        System.out.println("Created order success");
        return "order";
    }

    @GetMapping("/update-order/{id}")
    public String updateOrder(@PathVariable Integer id) {
        System.out.println("Updating order ID: " + id);
        return "order";
    }

    @GetMapping("/delete-order/{id}")
    public String deleteOrder(@PathVariable Integer id) {
        System.out.println("Deleting order ID: " + id);
        return "order";
    }
}
