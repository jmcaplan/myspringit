package com.vega.myspringit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // this is just @Controller plus @ResponseBody (which itself puts the return of methods into the webpage)
public class HomeController {

	@GetMapping("/")
	public String home(Model model, HttpServletRequest request) {
		model.addAttribute("message", "Hi from the Home page!");
		return "welcome";
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	
}
