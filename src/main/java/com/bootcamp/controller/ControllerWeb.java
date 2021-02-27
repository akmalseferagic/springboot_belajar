package com.bootcamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerWeb {
	@GetMapping(value="/")
    public String homepage(){
        return "index";
    }

}
