package com.scott.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
//	ctrl + shift + o - import into framework (see above import for reference)
	public String hello() {
		return "I love coding";
	}
	@RequestMapping("/java")
//	ctrl + shift + o - import into framework (see above import for reference)
	public String helloJava() {
		return "I love coding in Java";
	}
}
