package com.demo.apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsDemoAppApplication {

	@GetMapping
	public String hello() {
		return "Hello from Github Actions Demo App!";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubActionsDemoAppApplication.class, args);
	}

}
