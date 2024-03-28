package com.example.demospringsecurity.controller;

import com.example.demospringsecurity.security.IsAdmin;
import com.example.demospringsecurity.security.IsSale;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class OrderController {

    @IsAdmin
    @IsSale
    @GetMapping("/order")
    public String getOrder() {
        return "order";
    }

    @IsAdmin
    @IsSale
    @GetMapping("/create-order")
    public String createOrder() {
        System.out.println("Created order success");
        return "order";
    }

    @IsAdmin
    @IsSale
    @GetMapping("/update-order/{id}")
    public String updateOrder(@PathVariable Integer id) {
        System.out.println("Updating order ID: " + id);
        return "order";
    }

    @IsAdmin
    @IsSale
    @GetMapping("/delete-order/{id}")
    public String deleteOrder(@PathVariable Integer id) {
        System.out.println("Deleting order ID: " + id);
        return "order";
    }
}
