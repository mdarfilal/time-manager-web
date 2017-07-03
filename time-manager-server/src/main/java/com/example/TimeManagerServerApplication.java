package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "fr.mdarfilal")
@EnableJpaRepositories("fr.mdarfilal")
@EntityScan("fr.mdarfilal")
public class TimeManagerServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeManagerServerApplication.class, args);
	}
}
