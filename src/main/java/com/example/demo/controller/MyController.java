package com.example.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public String hello() {
		
		System.out.print("aceesou a classes");
		return"hello";
	}
	
}
