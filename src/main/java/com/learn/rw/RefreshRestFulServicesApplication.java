package com.learn.rw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RefreshRestFulServicesApplication {

	public static void main(String[] args) {
		System.out.println("This is a check for git push");
		SpringApplication.run(RefreshRestFulServicesApplication.class, args);
	}

}
