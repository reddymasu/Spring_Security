package com.dailycodebuffer.SpringSecutity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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

    @GetMapping("/login")
    public String handleLogin(){
        return "custom_login";
    }



}
