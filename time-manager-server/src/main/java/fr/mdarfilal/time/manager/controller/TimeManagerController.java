package fr.mdarfilal.time.manager.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.mdarfilal.time.manager.service.IDayService;

@RestController
@RequestMapping("/api")
public class TimeManagerController {

	Logger LOGGER = LoggerFactory.getLogger(TimeManagerController.class);

	@Autowired
	IDayService dayService;

	@RequestMapping("/hello")
	public void helloWorld() {
		System.out.println("Hello Spring Boot REST");
	}

	@RequestMapping("/day/{dateOfDay}")
	public String getDay(@PathVariable String dateOfDay) {
		LOGGER.info("GET day : " + dateOfDay);
		return "GET day : " + dateOfDay;
		// return dayService.findDay(dateOfDay);
	}
}
