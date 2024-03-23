package com.springboot.kiran;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController{

//String s="Kiran";
	@GetMapping("/hello")
	public String hello() {
		return "Hello kiran ";
	}
	
}
