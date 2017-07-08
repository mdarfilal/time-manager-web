package fr.mdarfilal.time.manager.service;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.mdarfilal.time.manager.controller.TimeManagerController;
import fr.mdarfilal.time.manager.dao.IDayDao;
import fr.mdarfilal.time.manager.model.Day;
import fr.mdarfilal.time.manager.utils.TimerManagerDate;

@Service
public class DayServiceImpl implements IDayService {

	private static final Logger LOGGER = LoggerFactory.getLogger(TimeManagerController.class);

	@Autowired
	private IDayDao dayDao;

	@Override
	public List<Day> findAllDays() {
		return dayDao.findAll();
	}

	@Override
	public Day findDay(String dateOfDay) {
		return dayDao.findByDateOfDay(dateOfDay);
	}

	@Override
	public void saveDay(Day day) {
		if (day != null) {
			dayDao.save(day);
		}
	}

	@Override
	public void createDay() {
		Day day = new Day();
		day.setDateOfDay(TimerManagerDate.getDateOfDayFormatted(new Date()));
		dayDao.save(day);
	}

	@Override
	public void deleteDay(Day day) {
		if (day != null) {
			dayDao.delete(day);
		}
	}

	@Override
	public Day getToday() {
		Day today = findDay(TimerManagerDate.getDateOfDayFormatted(new Date()));

		if (today == null) {
			LOGGER.info("Today not exists, create it");
			createDay();
			today = findDay(TimerManagerDate.getDateOfDayFormatted(new Date()));
		}

		return today;
	}
}
