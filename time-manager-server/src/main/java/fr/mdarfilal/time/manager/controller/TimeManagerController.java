package fr.mdarfilal.time.manager.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.mdarfilal.time.manager.model.Day;
import fr.mdarfilal.time.manager.service.IDayService;

@RestController
@RequestMapping("/api/days")
public class TimeManagerController {

	Logger LOGGER = LoggerFactory.getLogger(TimeManagerController.class);

	@Autowired
	IDayService dayService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Day> getAllDays() {
		LOGGER.info("GET all days");
		return dayService.findAllDays();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{dateOfDay}")
	public Day getDay(@PathVariable String dateOfDay) {
		LOGGER.info("GET day : " + dateOfDay);
		return dayService.findDay(dateOfDay);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/today")
	public Day getToday() {
		LOGGER.info("GET today");
		return dayService.getToday();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/create")
	public void createDay() {
		LOGGER.info("POST createDay");
		dayService.createDay();
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/save")
	public void saveDay(@RequestBody Day day) {
		LOGGER.info("PUT saveDay");
		dayService.saveDay(day);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/delete")
	public void deleteDay(@RequestBody Day day) {
		LOGGER.info("DELETE deleteDay");
		dayService.deleteDay(day);
	}

}
