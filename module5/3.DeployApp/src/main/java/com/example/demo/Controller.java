package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	@GetMapping("/")
	public String hello() {
	 
	return "hello welcome to amazon ec2 online app";

}
}
