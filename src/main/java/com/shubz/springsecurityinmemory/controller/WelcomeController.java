package com.shubz.springsecurityinmemory.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {


    @GetMapping("/greetings")
    public String greeting(Authentication authentication){
        String username = authentication.getName();
        String principal = authentication.getPrincipal().toString();

        System.out.println("username: " + username);
        System.out.println("principal: " + principal);

        return username;
    }
}
