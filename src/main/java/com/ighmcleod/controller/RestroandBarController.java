package com.ighmcleod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RestroandBarController {

    @GetMapping("/resto-bar")
    public String restoandbar() {
        return "resto-bar";
    }

}