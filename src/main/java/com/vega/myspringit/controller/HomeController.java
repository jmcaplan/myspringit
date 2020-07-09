package com.vega.myspringit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // this is just @Controller plus @ResponseBody (which itself puts the return of methods into the webpage)
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "Hello, Myspringit!";
	}
	
}
