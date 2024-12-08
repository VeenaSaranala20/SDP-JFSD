package com.jfsd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/home/register")
	public String register() {
		return "register";
	}
	@GetMapping("/aboutus")
    public String aboutus() {
        return "aboutus";
    }
	@GetMapping("/dashboard")
	public String dashboard() {
		return "dashboard";
	}
}