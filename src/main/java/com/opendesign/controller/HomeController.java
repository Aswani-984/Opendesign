package com.opendesign.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/header")
	public String header(Model model) {
		return "/header";
	}

	@GetMapping("/home")
	public String home(Model model) {
		return "/home";
	}
	@GetMapping("/index")
	public String index(Model model) {
		return "/index";
	}
	@GetMapping("/animation")
	public String animation(Model model) {
		return "/animation";
	}
}
