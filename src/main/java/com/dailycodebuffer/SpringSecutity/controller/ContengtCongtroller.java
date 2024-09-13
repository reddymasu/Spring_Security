package com.dailycodebuffer.SpringSecutity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ContengtCongtroller {

    @GetMapping("/home")
    public String handleWelcome(){
        return "home";
    }
    @GetMapping("/admin/home")
    public String handleAdminHome()
    {
        return "home_admin";
    }
    @GetMapping("/user/home")
    public String handleuserhome(){
        return "home_user";
    }



}
