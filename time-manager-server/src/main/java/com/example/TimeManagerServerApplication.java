package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "fr.mdarfilal")
public class TimeManagerServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeManagerServerApplication.class, args);
	}
}
