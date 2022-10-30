package com.ksm.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/")
	public String helloWorldRoot() {
		return "Hello world root";
	}
	
	@GetMapping("/helloworld")
	public String helloWorld() {
		return "Hello world";
	}

}
