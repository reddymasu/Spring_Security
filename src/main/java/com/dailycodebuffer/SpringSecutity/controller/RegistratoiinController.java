package com.dailycodebuffer.SpringSecutity.controller;

import com.dailycodebuffer.SpringSecutity.MyUser;
import com.dailycodebuffer.SpringSecutity.respository.MyUserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistratoiinController {

    @Autowired
    private MyUserRespository myUserRespository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("register/user")
    public MyUser create(@RequestBody MyUser myUser)
    {
        myUser.setPassword(passwordEncoder.encode(myUser.getPassword()));
        return myUserRespository.save(myUser);



    }


}
