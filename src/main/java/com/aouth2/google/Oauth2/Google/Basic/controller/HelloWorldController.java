package com.aouth2.google.Oauth2.Google.Basic.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"${app.security.cors.origin}"})
@RestController
@RequestMapping
public class HelloWorldController {

    @GetMapping("helloworld")
    public String helloWorld(){
        return "Olá, mundo!";
    }
}
