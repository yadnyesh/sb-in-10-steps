package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class SbIn10StepsApplication {

	public static void main(String[] args) {
				SpringApplication.run(SbIn10StepsApplication.class, args);
	}
	
	@Profile("dev")
	@Bean
	public String dummy() {
		return "something";
	}
}
