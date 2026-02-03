package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String home() {
		return "spring boot is running successfully";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hello rajendra welcome to spring boot";
	}

}
