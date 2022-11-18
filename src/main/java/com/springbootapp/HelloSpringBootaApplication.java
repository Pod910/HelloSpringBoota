package com.springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringBootaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootaApplication.class, args);
		System.out.println("hello world");
		System.out.println("welcome");
	}

}
