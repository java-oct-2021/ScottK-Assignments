package com.scott.ninjadojo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String ninjaDojo() {
		return "index.jsp";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login text";
	}
	
	@RequestMapping("/success")
	public String success(@RequestParam(value="s") String firstName) {
		return "Successful login! Welcome to Ninja & Dojo!" + firstName;
	}
}
