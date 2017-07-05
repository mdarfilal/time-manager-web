package fr.mdarfilal.time.manager.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.mdarfilal.time.manager.model.Day;
import fr.mdarfilal.time.manager.service.IDayService;

@RestController
@RequestMapping("/api")
public class TimeManagerController {

	Logger LOGGER = LoggerFactory.getLogger(TimeManagerController.class);

	@Autowired
	IDayService dayService;

	@RequestMapping("/hello")
	public void helloWorld() {
		LOGGER.info("Hello Spring Boot REST");
	}

	@RequestMapping(method = RequestMethod.GET, value = "/day")
	public List<Day> getDay() {
		LOGGER.info("GET all days");
		return dayService.findAllDays();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/day/{dateOfDay}")
	public Day getDay(@PathVariable String dateOfDay) {
		LOGGER.info("GET day : " + dateOfDay);
		return dayService.findDay(dateOfDay);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/day/save")
	public void saveDay() {
		LOGGER.info("POST day");
		Day day = new Day();
		day.setBeginOfDay(new Date());
		day.setDateOfDay("Today");
		dayService.saveDay(day);
	}
}
