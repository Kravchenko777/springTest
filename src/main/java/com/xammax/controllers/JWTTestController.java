package com.xammax.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/jwt")
public class JWTTestController {


    @GetMapping("/exp")
    public String test(){
        return "exp";

    }

    @GetMapping("/mmm")
    public String testMmmm(){
        return "mmm";

    }
}
