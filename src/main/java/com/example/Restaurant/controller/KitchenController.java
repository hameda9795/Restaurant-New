package com.example.Restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class KitchenController {

    @GetMapping("/kitchen")
    public String getKitchen(){
        return "kitchen";
    }

}
