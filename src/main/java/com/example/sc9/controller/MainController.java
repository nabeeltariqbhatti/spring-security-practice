package com.example.sc9.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class MainController {


    @GetMapping("/main")
    public String main(){
        return "main.html";
    }


    @PostMapping("/change")
    public String doSmth(){

        System.out.printf("called");
        return "main.html";
    }
}
