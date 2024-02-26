package com.example.JenkinsTestFile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
@GetMapping("/home")
    public String getHomePage(){

        return "index";
    }

}
