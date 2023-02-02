package com.epa.epadiplom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    // Main page (temporary)
    @GetMapping("/")
    public String getIndex(){
        return "main/index";
    }


}
