package com.example.demorestapicalls.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class HelloController {

	@RequestMapping(value = {"","/","/home"})
	public String hello() {
		return "Hello !";
	}
}
