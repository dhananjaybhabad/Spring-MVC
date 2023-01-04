package com.BikkadIT.ControllerToUI.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	public WelcomeController() {
		super();
		System.out.println("This is a welcome controller");
			
	}	
	@GetMapping("/welcome")
	public String welcomemsg() {
		
		String msg = "Welcome Dhananjay ! You are the Best Backend Devlopper";
		return msg;
		
		
	}
}
