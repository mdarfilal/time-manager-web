package fr.mdarfilal.time.manager.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.mdarfilal.time.manager.dao.IDayDao;
import fr.mdarfilal.time.manager.model.Day;

@Service
public class DayServiceImpl implements IDayService {

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
		day.setBeginOfDay(new Date());
		day.setDateOfDay("Today");
		dayDao.save(day);
	}

	@Override
	public void deleteDay(Day day) {
		if (day != null) {
			dayDao.delete(day);
		}
	}
}
