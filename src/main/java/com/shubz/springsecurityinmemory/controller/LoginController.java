package com.shubz.springsecurityinmemory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {

    @GetMapping("/dologin")
    public String login(){
        System.out.println("login inside!!!!");
        return "login.html";
    }
}
