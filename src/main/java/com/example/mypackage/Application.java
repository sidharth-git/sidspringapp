package com.example.mypacakage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {
	
	@RequestMapping(value="/")
	public String index() {
		return "<html><head><style>"
             + "body {"
             + "background-image: url('/images/brahma.jpg');"
             + "background-size: cover;"
             + "background-repeat: no-repeat;"
             + "}"
             + "</style></head>"
             + "<body>"
             + "<h1>HI SIDHU BHAI, WELCOME TO YOUR KHATARNAK SPRINGBOOT APPLICATION</h1>"
             + "</body></html>";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

