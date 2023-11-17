package com.example.resortproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResortController {
    @GetMapping("/index")
    public String indexResort(Model model){
        return "index";
    }
    @GetMapping("/attraction1")
    public String Attraction1Resort(Model model){
        return "attraction1";
    }

    @GetMapping("/attraction2")
    public String Attraction2Resort(Model model){
        return "attraction2";
    }

    @GetMapping("/attraction3")
    public String Attraction3Resort(Model model){
        return "attraction3";
    }

    @GetMapping("/room1")
    public String Room1Resort(Model model){
        return "room1";
    }

    @GetMapping("/room2")
    public String Room2Resort(Model model){
        return "room2";
    }

    @GetMapping("/room3")
    public String Room3Resort(Model model){
        return "room3";
    }

    @GetMapping("/customer")
    public String CustomerResort(Model model){
        return "customer";
    }

    @GetMapping("/load")
    public String LoadResort(Model model){
        return "load";
    }

    @GetMapping("/service")
    public String ServiceResort(Model model){
        return "service";
    }
}
