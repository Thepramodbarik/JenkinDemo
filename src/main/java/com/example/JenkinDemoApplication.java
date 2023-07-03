package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinDemoApplication.class, args);

		System.out.println("jenkin deployment test==1112");
	}

}
