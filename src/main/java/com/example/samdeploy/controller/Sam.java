package com.example.samdeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sam {
	
	@GetMapping("/home")
	public String hello() {
		return "Hi I'm Coming from Server";
	}
	
}
