package fr.mdarfilal.time.manager.service;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.mdarfilal.time.manager.controller.DaysController;
import fr.mdarfilal.time.manager.dao.IDayDao;
import fr.mdarfilal.time.manager.model.Day;
import fr.mdarfilal.time.manager.utils.TimerManagerDate;

@Service
public class DayServiceImpl implements IDayService {

	private static final Logger LOGGER = LoggerFactory.getLogger(DaysController.class);

	@Autowired
	private IDayDao dayDao;

	@Override
	public List<Day> findAllDays() {
		LOGGER.info("Getting all days");
		return dayDao.findAll();
	}

	@Override
	public Day findDay(String dateOfDay) {
		LOGGER.info("Getting the day : " + dateOfDay);
		return dayDao.findByDateOfDay(dateOfDay);
	}

	@Override
	public void saveDay(Day day) {
		if (day != null) {
			LOGGER.info("Saving the day : " + day.getDateOfDay());
			dayDao.save(day);
		}
	}

	@Override
	public void createDay() {
		String dateOfDay = TimerManagerDate.getDateOfDayFormatted(new Date());
		Day day = findDay(dateOfDay);
		if (day != null) {
			LOGGER.info("Day already exists !");
		} else {
			LOGGER.info("Creating a new day");
			day = new Day();
			day.setDateOfDay(dateOfDay);
			dayDao.save(day);
		}
	}

	@Override
	public void deleteDay(String dateOfDay) {
		Day day = findDay(dateOfDay);
		if (day != null) {
			LOGGER.info("Deleting the day : " + day.getDateOfDay());
			dayDao.delete(day);
		} else {
			LOGGER.info("The day doesn't exist !");
		}
	}

}
