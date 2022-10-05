package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.demo")
public class DeployAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeployAppApplication.class, args);
	}

}
