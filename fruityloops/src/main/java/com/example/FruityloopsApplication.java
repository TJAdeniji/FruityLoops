package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class FruityloopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FruityloopsApplication.class, args);
	}
	
	@RequestMapping("/test")
	public String theTest() {
		return "Hello World pls";
	}

}
