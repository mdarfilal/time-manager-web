package fr.mdarfilal.time.manager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TimeManagerController {

	@RequestMapping("/hello")
	public void helloWorld() {
		System.out.println("Hello Spring Boot REST");
	}
}
