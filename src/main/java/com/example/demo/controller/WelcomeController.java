package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.configuration.BasicConfiguration;

@RestController
public class WelcomeController {
	
	@Autowired
	WelcomeService welcomeService;
	
	@Autowired
	BasicConfiguration basicConfiguration;
	
	@Value("${welcome.message}")
	private String welcomeMessage;
	
	@RequestMapping("/welcome")
	public String welcome() {
		return welcomeMessage;
		//return welcomeService.retrieveMessage();
	}
	
	@RequestMapping("/dynamic-configuration")
	public Map dynamicConfiguration(){
		Map map = new HashMap();
		map.put("message", basicConfiguration.getMessage());
		map.put("number", basicConfiguration.getNumber());
		map.put("value", basicConfiguration.isValue());
		return map;
	}
	
	
	@Component
	public class WelcomeService {
		public String retrieveMessage() {
			return "This is great!";
		}
	}
}
