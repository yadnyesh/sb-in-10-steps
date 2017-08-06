package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@Autowired
	WelcomeService welcomeService;
	
	@Value("${welcome.message}")
	private String welcomeMessage;
	
	@RequestMapping("/welcome")
	public String welcome() {
		return welcomeMessage;
		//return welcomeService.retrieveMessage();
	}
	
	@Component
	public class WelcomeService {
		public String retrieveMessage() {
			return "This is great!";
		}
	}

}
