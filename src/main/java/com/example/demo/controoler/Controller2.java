package com.example.demo.controoler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {
	
	@GetMapping(value = "/hello2")
	public String hello2() {
		return "Message From Order Service";
		
	}

}
