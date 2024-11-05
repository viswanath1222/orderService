package com.example.demo.controoler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {
	
	@GetMapping(value = "/orderDetails/{orderID}")
	public String hello2(@PathVariable("orderID")String orderID) {
		return "OrderDetails of order with Id :"+orderID;
		
	}

}
